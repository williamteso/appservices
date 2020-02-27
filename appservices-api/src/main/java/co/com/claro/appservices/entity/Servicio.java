package co.com.claro.appservices.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the SERVICIO database table.
 * 
 */
@Entity
@NamedQuery(name="Servicio.findAll", query="SELECT s FROM Servicio s")
public class Servicio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_SERVICIO")
	private long idServicio;

	private Object descripcion;

	@Column(name="NOMBRE_SERVICIO")
	private Object nombreServicio;

	@Column(name="URL_DES")
	private Object urlDes;

	@Column(name="URL_PROD")
	private Object urlProd;

	@Column(name="URL_QA")
	private Object urlQa;

	//bi-directional many-to-one association to Appservicio
	@OneToMany(mappedBy="servicio")
	private List<Appservicio> appservicios;

	//bi-directional many-to-one association to Metodo
	@OneToMany(mappedBy="servicio")
	private List<Metodo> metodos;

	//bi-directional many-to-one association to TipoServicio
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_TIPO_SERVICIO")
	private TipoServicio tipoServicio;

	public Servicio() {
	}

	public long getIdServicio() {
		return this.idServicio;
	}

	public void setIdServicio(long idServicio) {
		this.idServicio = idServicio;
	}

	public Object getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(Object descripcion) {
		this.descripcion = descripcion;
	}

	public Object getNombreServicio() {
		return this.nombreServicio;
	}

	public void setNombreServicio(Object nombreServicio) {
		this.nombreServicio = nombreServicio;
	}

	public Object getUrlDes() {
		return this.urlDes;
	}

	public void setUrlDes(Object urlDes) {
		this.urlDes = urlDes;
	}

	public Object getUrlProd() {
		return this.urlProd;
	}

	public void setUrlProd(Object urlProd) {
		this.urlProd = urlProd;
	}

	public Object getUrlQa() {
		return this.urlQa;
	}

	public void setUrlQa(Object urlQa) {
		this.urlQa = urlQa;
	}

	public List<Appservicio> getAppservicios() {
		return this.appservicios;
	}

	public void setAppservicios(List<Appservicio> appservicios) {
		this.appservicios = appservicios;
	}

	public Appservicio addAppservicio(Appservicio appservicio) {
		getAppservicios().add(appservicio);
		appservicio.setServicio(this);

		return appservicio;
	}

	public Appservicio removeAppservicio(Appservicio appservicio) {
		getAppservicios().remove(appservicio);
		appservicio.setServicio(null);

		return appservicio;
	}

	public List<Metodo> getMetodos() {
		return this.metodos;
	}

	public void setMetodos(List<Metodo> metodos) {
		this.metodos = metodos;
	}

	public Metodo addMetodo(Metodo metodo) {
		getMetodos().add(metodo);
		metodo.setServicio(this);

		return metodo;
	}

	public Metodo removeMetodo(Metodo metodo) {
		getMetodos().remove(metodo);
		metodo.setServicio(null);

		return metodo;
	}

	public TipoServicio getTipoServicio() {
		return this.tipoServicio;
	}

	public void setTipoServicio(TipoServicio tipoServicio) {
		this.tipoServicio = tipoServicio;
	}

}