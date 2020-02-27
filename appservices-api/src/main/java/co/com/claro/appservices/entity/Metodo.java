package co.com.claro.appservices.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the METODO database table.
 * 
 */
@Entity
@NamedQuery(name="Metodo.findAll", query="SELECT m FROM Metodo m")
public class Metodo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_METODO")
	private long idMetodo;

	private Object descripcion;

	@Column(name="NOMBRE_METODO")
	private Object nombreMetodo;

	//bi-directional many-to-one association to Servicio
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_SERVICIO")
	private Servicio servicio;

	//bi-directional many-to-one association to TipoMetodo
	@OneToMany(mappedBy="metodo")
	private List<TipoMetodo> tipoMetodos;

	public Metodo() {
	}

	public long getIdMetodo() {
		return this.idMetodo;
	}

	public void setIdMetodo(long idMetodo) {
		this.idMetodo = idMetodo;
	}

	public Object getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(Object descripcion) {
		this.descripcion = descripcion;
	}

	public Object getNombreMetodo() {
		return this.nombreMetodo;
	}

	public void setNombreMetodo(Object nombreMetodo) {
		this.nombreMetodo = nombreMetodo;
	}

	public Servicio getServicio() {
		return this.servicio;
	}

	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}

	public List<TipoMetodo> getTipoMetodos() {
		return this.tipoMetodos;
	}

	public void setTipoMetodos(List<TipoMetodo> tipoMetodos) {
		this.tipoMetodos = tipoMetodos;
	}

	public TipoMetodo addTipoMetodo(TipoMetodo tipoMetodo) {
		getTipoMetodos().add(tipoMetodo);
		tipoMetodo.setMetodo(this);

		return tipoMetodo;
	}

	public TipoMetodo removeTipoMetodo(TipoMetodo tipoMetodo) {
		getTipoMetodos().remove(tipoMetodo);
		tipoMetodo.setMetodo(null);

		return tipoMetodo;
	}

}