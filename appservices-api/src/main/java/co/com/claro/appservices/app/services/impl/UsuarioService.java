package co.com.claro.appservices.app.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import co.com.claro.appservices.app.models.entity.auth.Usuario;
import co.com.claro.appservices.app.models.repository.UsuarioRepository;
import co.com.claro.appservices.app.services.IUsuarioService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UsuarioService implements IUsuarioService, UserDetailsService {
	
	private static final Logger logger = LoggerFactory.getLogger(UsuarioService.class);

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	@Transactional(readOnly = true)
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		Usuario usuario = usuarioRepository.findByUsername(username);
		boolean activo = false;
		
		if(usuario == null) {
			logger.error("Error en el login: no existe el usuario '" + username + "' en el sistema!");
			throw new UsernameNotFoundException("Error en el login: no existe el usuario '" + username + "' en el sistema!");
		}

		List<GrantedAuthority> authorities = usuario.getRoles().stream()
				.map(role -> new SimpleGrantedAuthority(role.getNombre()))
				.peek(authority -> logger.info("Role: " + authority.getAuthority()))
				.collect(Collectors.toList());

		if ("1".equals(String.valueOf(usuario.getEnabled()))) {
			activo = true;
		} else {
			activo = false;
		}

		return new User(usuario.getUsername(), usuario.getPassword(), activo, true, true, true,
				authorities);
	}

	@Override
	@Transactional(readOnly=true)
	public Usuario findByUsername(String username) {
		return usuarioRepository.findByUsername(username);
	}

}
