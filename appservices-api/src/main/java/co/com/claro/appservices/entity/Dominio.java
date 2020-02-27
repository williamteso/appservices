package co.com.claro.appservices.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the DOMINIO database table.
 * 
 */
@Entity
@NamedQuery(name="Dominio.findAll", query="SELECT d FROM Dominio d")
public class Dominio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_DOMINIO")
	private long idDominio;

	@Column(name="DOMINIO_DESPLIEGUE")
	private Object dominioDespliegue;

	@Column(name="NOMBRE_DOMINIO")
	private Object nombreDominio;

	//bi-directional many-to-one association to Area
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_AREA")
	private Area area;

	public Dominio() {
	}

	public long getIdDominio() {
		return this.idDominio;
	}

	public void setIdDominio(long idDominio) {
		this.idDominio = idDominio;
	}

	public Object getDominioDespliegue() {
		return this.dominioDespliegue;
	}

	public void setDominioDespliegue(Object dominioDespliegue) {
		this.dominioDespliegue = dominioDespliegue;
	}

	public Object getNombreDominio() {
		return this.nombreDominio;
	}

	public void setNombreDominio(Object nombreDominio) {
		this.nombreDominio = nombreDominio;
	}

	public Area getArea() {
		return this.area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

}