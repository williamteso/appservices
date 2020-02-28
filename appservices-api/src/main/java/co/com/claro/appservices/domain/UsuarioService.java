package co.com.claro.appservices.domain;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import co.com.claro.appservices.entity.Usuario;
import co.com.claro.appservices.repository.IUsuarioRepository;

public class UsuarioService implements ICrudService<Usuario, Long> {
	
	@Autowired
	private IUsuarioRepository repository;
	
	@Override
	public Usuario save(Usuario entity) {
		return repository.save(entity);
	}

	@Override
	public Iterable<Usuario> saveAll(Iterable<Usuario> entities) {
		return repository.saveAll(entities);
	}

	@Override
	public Optional<Usuario> findById(Long id) {
		return repository.findById(id);
	}

	@Override
	public boolean existsById(Long id) {
		return repository.existsById(id);
	}

	@Override
	public Iterable<Usuario> findAll() {
		return repository.findAll();
	}

	@Override
	public long count() {
		return repository.count();
	}

	@Override
	public void deleteById(Long id) {
		repository.deleteById(id);
	}

	@Override
	public void delete(Usuario entity) {
		repository.delete(entity);	
	}

	@Override
	public void deleteAll(Iterable<Usuario> entities) {
		repository.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		repository.deleteAll();
	}
}
