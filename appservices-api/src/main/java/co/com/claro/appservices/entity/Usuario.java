package co.com.claro.appservices.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the USUARIOS database table.
 * 
 */
@Entity
@Table(name="USUARIOS")
@NamedQuery(name="Usuario.findAll", query="SELECT u FROM Usuario u")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_USUARIO")
	private long idUsuario;

	private Object email;

	private Object password;

	public Usuario() {
	}

	public long getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Object getEmail() {
		return this.email;
	}

	public void setEmail(Object email) {
		this.email = email;
	}

	public Object getPassword() {
		return this.password;
	}

	public void setPassword(Object password) {
		this.password = password;
	}

}