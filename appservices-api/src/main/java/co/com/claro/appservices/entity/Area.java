package co.com.claro.appservices.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the AREA database table.
 * 
 */
@Entity
@NamedQuery(name="Area.findAll", query="SELECT a FROM Area a")
public class Area implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_AREA")
	private long idArea;

	@Column(name="AREA_RESPONSABLE")
	private Object areaResponsable;

	private Object gerencia;

	@Column(name="NOMBRE_AREA")
	private Object nombreArea;

	private Object responsable;

	//bi-directional many-to-one association to Dominio
	@OneToMany(mappedBy="area")
	private List<Dominio> dominios;

	public Area() {
	}

	public long getIdArea() {
		return this.idArea;
	}

	public void setIdArea(long idArea) {
		this.idArea = idArea;
	}

	public Object getAreaResponsable() {
		return this.areaResponsable;
	}

	public void setAreaResponsable(Object areaResponsable) {
		this.areaResponsable = areaResponsable;
	}

	public Object getGerencia() {
		return this.gerencia;
	}

	public void setGerencia(Object gerencia) {
		this.gerencia = gerencia;
	}

	public Object getNombreArea() {
		return this.nombreArea;
	}

	public void setNombreArea(Object nombreArea) {
		this.nombreArea = nombreArea;
	}

	public Object getResponsable() {
		return this.responsable;
	}

	public void setResponsable(Object responsable) {
		this.responsable = responsable;
	}

	public List<Dominio> getDominios() {
		return this.dominios;
	}

	public void setDominios(List<Dominio> dominios) {
		this.dominios = dominios;
	}

	public Dominio addDominio(Dominio dominio) {
		getDominios().add(dominio);
		dominio.setArea(this);

		return dominio;
	}

	public Dominio removeDominio(Dominio dominio) {
		getDominios().remove(dominio);
		dominio.setArea(null);

		return dominio;
	}

}