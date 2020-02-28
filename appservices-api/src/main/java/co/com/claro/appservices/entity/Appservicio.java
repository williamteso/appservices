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
	private Aplicacion aplicacionConsumo;

	//bi-directional many-to-one association to Aplicacion
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_APLICACION_PROVEE")
	private Aplicacion aplicacionProvee;

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

	public Aplicacion getAplicacionConsumo() {
		return this.aplicacionConsumo;
	}

	public void setAplicacionConsumo(Aplicacion aplicacionConsumo) {
		this.aplicacionConsumo = aplicacionConsumo;
	}

	public Aplicacion getAplicacionProvee() {
		return this.aplicacionProvee;
	}

	public void setAplicacionProvee(Aplicacion aplicacionProvee) {
		this.aplicacionProvee = aplicacionProvee;
	}

	public Servicio getServicio() {
		return this.servicio;
	}

	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}

}