package co.com.claro.appservices.app.models.entity;

import javax.persistence.*;

@Entity
@Table(name = "SERV_TIPO_SERVICIO")
public class TipoServicio {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seqTipoServicio")
    @SequenceGenerator(name = "seqTipoServicio", sequenceName = "SEQ_TIPO_SERVICIO", initialValue = 1, allocationSize = 1)
    @Column(name = "ID_TIPO_SERVICIO")
    private Long idTipoServicio;
    private String prefijo;
    private String estado;
    private String modelo;
    private String protocolo;

    public TipoServicio() {

    }

    public Long getIdTipoServicio() {
        return idTipoServicio;
    }

    public void setIdTipoServicio(Long idTipoServicio) {
        this.idTipoServicio = idTipoServicio;
    }

    public String getPrefijo() {
        return prefijo;
    }

    public void setPrefijo(String prefijo) {
        this.prefijo = prefijo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(String protocolo) {
        this.protocolo = protocolo;
    }
}
