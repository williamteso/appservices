package co.com.claro.appservices.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the APPSERVICIO database table.
 * 
 */
@Entity
@NamedQuery(name="Appservicio.findAll", query="SELECT a FROM Appservicio a")
public class Appservicio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_APPSERV")
	private long idAppserv;

	//bi-directional many-to-one association to Aplicacion
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_APLICACION_CONSUMO")
	private Aplicacion aplicacion1;

	//bi-directional many-to-one association to Aplicacion
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_APLICACION_PROVEE")
	private Aplicacion aplicacion2;

	//bi-directional many-to-one association to Servicio
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_SERVICIO")
	private Servicio servicio;

	public Appservicio() {
	}

	public long getIdAppserv() {
		return this.idAppserv;
	}

	public void setIdAppserv(long idAppserv) {
		this.idAppserv = idAppserv;
	}

	public Aplicacion getAplicacion1() {
		return this.aplicacion1;
	}

	public void setAplicacion1(Aplicacion aplicacion1) {
		this.aplicacion1 = aplicacion1;
	}

	public Aplicacion getAplicacion2() {
		return this.aplicacion2;
	}

	public void setAplicacion2(Aplicacion aplicacion2) {
		this.aplicacion2 = aplicacion2;
	}

	public Servicio getServicio() {
		return this.servicio;
	}

	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}

}