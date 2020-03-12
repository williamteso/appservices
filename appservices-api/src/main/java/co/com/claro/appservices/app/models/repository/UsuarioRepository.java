package co.com.claro.appservices.app.models.repository;

import co.com.claro.appservices.app.models.entity.auth.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
	
	public Usuario findByUsername(String username);

}
