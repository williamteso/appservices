package co.com.claro.appservices.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the TIPO_SERVICIO database table.
 * 
 */
@Entity
@Table(name="TIPO_SERVICIO")
@NamedQuery(name="TipoServicio.findAll", query="SELECT t FROM TipoServicio t")
public class TipoServicio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_TIPO_SERVICIO")
	private long idTipoServicio;

	private Object estado;

	private Object modelo;

	private Object prefijo;

	private Object protocolo;

	//bi-directional many-to-one association to Servicio
	@OneToMany(mappedBy="tipoServicio")
	private List<Servicio> servicios;

	public TipoServicio() {
	}

	public long getIdTipoServicio() {
		return this.idTipoServicio;
	}

	public void setIdTipoServicio(long idTipoServicio) {
		this.idTipoServicio = idTipoServicio;
	}

	public Object getEstado() {
		return this.estado;
	}

	public void setEstado(Object estado) {
		this.estado = estado;
	}

	public Object getModelo() {
		return this.modelo;
	}

	public void setModelo(Object modelo) {
		this.modelo = modelo;
	}

	public Object getPrefijo() {
		return this.prefijo;
	}

	public void setPrefijo(Object prefijo) {
		this.prefijo = prefijo;
	}

	public Object getProtocolo() {
		return this.protocolo;
	}

	public void setProtocolo(Object protocolo) {
		this.protocolo = protocolo;
	}

	public List<Servicio> getServicios() {
		return this.servicios;
	}

	public void setServicios(List<Servicio> servicios) {
		this.servicios = servicios;
	}

	public Servicio addServicio(Servicio servicio) {
		getServicios().add(servicio);
		servicio.setTipoServicio(this);

		return servicio;
	}

	public Servicio removeServicio(Servicio servicio) {
		getServicios().remove(servicio);
		servicio.setTipoServicio(null);

		return servicio;
	}

}