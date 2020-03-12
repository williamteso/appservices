package co.com.claro.appservices.app.services;

import co.com.claro.appservices.app.models.entity.auth.Usuario;

public interface IUsuarioService {

	public Usuario findByUsername(String username);
	
}
