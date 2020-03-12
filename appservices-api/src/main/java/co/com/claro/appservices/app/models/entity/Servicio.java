package co.com.claro.appservices.app.models.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "SERV_SERVICIO")
public class Servicio {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seqServicio")
    @SequenceGenerator(name = "seqServicio", sequenceName = "SEQ_SERVICIO", initialValue = 1, allocationSize = 1)
    @Column(name = "ID_SERVICIO")
    private Long idServicio;
    @Column(name = "NOMBRE_SERVICIO")
    private String nombreServicio;
    private String descripcion;
    @Column(name = "URL_PROD")
    private String urlProd;
    @Column(name = "URL_QA")
    private String urlQa;
    @Column(name = "URL_DES")
    private String urlDes;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FECHA_CREACION")
    private Date fechaCreacion;

    public Servicio() {

    }

    @PrePersist
    public void prePersist() {
        this.fechaCreacion = new Date();
    }

    public Long getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(Long idServicio) {
        this.idServicio = idServicio;
    }

    public String getNombreServicio() {
        return nombreServicio;
    }

    public void setNombreServicio(String nombreServicio) {
        this.nombreServicio = nombreServicio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUrlProd() {
        return urlProd;
    }

    public void setUrlProd(String urlProd) {
        this.urlProd = urlProd;
    }

    public String getUrlQa() {
        return urlQa;
    }

    public void setUrlQa(String urlQa) {
        this.urlQa = urlQa;
    }

    public String getUrlDes() {
        return urlDes;
    }

    public void setUrlDes(String urlDes) {
        this.urlDes = urlDes;
    }
}
