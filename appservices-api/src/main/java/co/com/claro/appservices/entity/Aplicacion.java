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
	@OneToMany(mappedBy="aplicacionConsumo")
	private List<Appservicio> appserviciosConsumo;

	//bi-directional many-to-one association to Appservicio
	@OneToMany(mappedBy="aplicacionProvee")
	private List<Appservicio> appserviciosProvee;

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

	public List<Appservicio> getAppserviciosConsumo() {
		return this.appserviciosConsumo;
	}

	public void setAppserviciosConsumo(List<Appservicio> appserviciosConsumo) {
		this.appserviciosConsumo = appserviciosConsumo;
	}

	public Appservicio addAppserviciosConsumo(Appservicio appserviciosConsumo) {
		getAppserviciosConsumo().add(appserviciosConsumo);
		appserviciosConsumo.setAplicacionConsumo(this);

		return appserviciosConsumo;
	}

	public Appservicio removeAppserviciosConsumo(Appservicio appserviciosConsumo) {
		getAppserviciosConsumo().remove(appserviciosConsumo);
		appserviciosConsumo.setAplicacionConsumo(null);

		return appserviciosConsumo;
	}

	public List<Appservicio> getAppserviciosProvee() {
		return this.appserviciosProvee;
	}

	public void setAppservicios2(List<Appservicio> appserviciosProvee) {
		this.appserviciosProvee = appserviciosProvee;
	}

	public Appservicio addAppserviciosProvee(Appservicio appserviciosProvee) {
		getAppserviciosProvee().add(appserviciosProvee);
		appserviciosProvee.setAplicacionProvee(this);

		return appserviciosProvee;
	}

	public Appservicio removeAppserviciosProvee(Appservicio appserviciosProvee) {
		getAppserviciosProvee().remove(appserviciosProvee);
		appserviciosProvee.setAplicacionProvee(null);

		return appserviciosProvee;
	}

}