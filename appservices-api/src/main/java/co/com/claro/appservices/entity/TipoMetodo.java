package co.com.claro.appservices.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the TIPO_METODO database table.
 * 
 */
@Entity
@Table(name="TIPO_METODO")
@NamedQuery(name="TipoMetodo.findAll", query="SELECT t FROM TipoMetodo t")
public class TipoMetodo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_TIPO_METODO")
	private long idTipoMetodo;

	@Lob
	private String request;

	@Lob
	private String response;

	//bi-directional many-to-one association to Metodo
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_METODO")
	private Metodo metodo;

	public TipoMetodo() {
	}

	public long getIdTipoMetodo() {
		return this.idTipoMetodo;
	}

	public void setIdTipoMetodo(long idTipoMetodo) {
		this.idTipoMetodo = idTipoMetodo;
	}

	public String getRequest() {
		return this.request;
	}

	public void setRequest(String request) {
		this.request = request;
	}

	public String getResponse() {
		return this.response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public Metodo getMetodo() {
		return this.metodo;
	}

	public void setMetodo(Metodo metodo) {
		this.metodo = metodo;
	}

}