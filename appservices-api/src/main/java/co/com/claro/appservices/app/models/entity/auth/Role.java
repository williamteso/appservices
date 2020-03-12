package co.com.claro.appservices.app.models.entity.auth;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "SERV_ROLES")
public class Role implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private Long id;

	@Column(unique = true, length = 20)
	private String nombre;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
