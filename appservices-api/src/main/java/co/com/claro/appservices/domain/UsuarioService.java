package co.com.claro.appservices.domain;

import java.util.Optional;

import co.com.claro.appservices.entity.Usuario;

public class UsuarioService implements ICrudService<Usuario, Long> {

	@Override
	public Usuario save(Usuario entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Usuario> saveAll(Iterable<Usuario> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Usuario> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Usuario> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Usuario entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<Usuario> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

}
