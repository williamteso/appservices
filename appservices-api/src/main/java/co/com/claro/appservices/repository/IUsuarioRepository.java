package co.com.claro.appservices.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.com.claro.appservices.entity.Usuario;

@Repository
public interface IUsuarioRepository extends CrudRepository<Usuario, Long>{
	
	//TODO wdguevaram - Caracterizar consultas y transacciones requeridas
}
