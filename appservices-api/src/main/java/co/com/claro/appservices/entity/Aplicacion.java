package co.com.claro.appservices.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the APLICACION database table.
 * 
 */
@Entity
@NamedQuery(name="Aplicacion.findAll", query="SELECT a FROM Aplicacion a")
public class Aplicacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_APLICACION")
	private long idAplicacion;

	private Object descripcion;

	@Column(name="NOMBRE_APLICACION")
	private Object nombreAplicacion;

	private Object operacion;

	//bi-directional many-to-one association to Appservicio
	@OneToMany(mappedBy="aplicacion1")
	private List<Appservicio> appservicios1;

	//bi-directional many-to-one association to Appservicio
	@OneToMany(mappedBy="aplicacion2")
	private List<Appservicio> appservicios2;

	public Aplicacion() {
	}

	public long getIdAplicacion() {
		return this.idAplicacion;
	}

	public void setIdAplicacion(long idAplicacion) {
		this.idAplicacion = idAplicacion;
	}

	public Object getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(Object descripcion) {
		this.descripcion = descripcion;
	}

	public Object getNombreAplicacion() {
		return this.nombreAplicacion;
	}

	public void setNombreAplicacion(Object nombreAplicacion) {
		this.nombreAplicacion = nombreAplicacion;
	}

	public Object getOperacion() {
		return this.operacion;
	}

	public void setOperacion(Object operacion) {
		this.operacion = operacion;
	}

	public List<Appservicio> getAppservicios1() {
		return this.appservicios1;
	}

	public void setAppservicios1(List<Appservicio> appservicios1) {
		this.appservicios1 = appservicios1;
	}

	public Appservicio addAppservicios1(Appservicio appservicios1) {
		getAppservicios1().add(appservicios1);
		appservicios1.setAplicacion1(this);

		return appservicios1;
	}

	public Appservicio removeAppservicios1(Appservicio appservicios1) {
		getAppservicios1().remove(appservicios1);
		appservicios1.setAplicacion1(null);

		return appservicios1;
	}

	public List<Appservicio> getAppservicios2() {
		return this.appservicios2;
	}

	public void setAppservicios2(List<Appservicio> appservicios2) {
		this.appservicios2 = appservicios2;
	}

	public Appservicio addAppservicios2(Appservicio appservicios2) {
		getAppservicios2().add(appservicios2);
		appservicios2.setAplicacion2(this);

		return appservicios2;
	}

	public Appservicio removeAppservicios2(Appservicio appservicios2) {
		getAppservicios2().remove(appservicios2);
		appservicios2.setAplicacion2(null);

		return appservicios2;
	}

}