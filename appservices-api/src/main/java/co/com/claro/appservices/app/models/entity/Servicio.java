package co.com.claro.appservices.app.models.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "SERV_SERVICIO")
public class Servicio {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seqServicio")
    @SequenceGenerator(name = "seqServicio", sequenceName = "SEQ_SERVICIO", initialValue = 1, allocationSize = 1)
    @Column(name = "ID_SERVICIO")
    private Long idServicio;
    @NotEmpty(message = "El campo 'nombreServicio' no puede estar vacio")
    @NotBlank(message = "El campo 'nombreServicio' no puede estar en blanco")
    @NotNull(message = "El campo 'nombreServicio' no puede ser nulo")
    @Column(name = "NOMBRE_SERVICIO")
    private String nombreServicio;
    @NotEmpty(message = "El campo 'descripcion' no puede estar vacio")
    @NotBlank(message = "El campo 'descripcion' no puede estar en blanco")
    @NotNull(message = "El campo 'descripcion' no puede ser nulo")
    private String descripcion;
    @NotEmpty(message = "El campo 'urlProd' no puede estar vacio")
    @NotBlank(message = "El campo 'urlProd' no puede estar en blanco")
    @NotNull(message = "El campo 'urlProd' no puede ser nulo")
    @Column(name = "URL_PROD")
    private String urlProd;
    @NotEmpty(message = "El campo 'urlQa' no puede estar vacio")
    @NotBlank(message = "El campo 'urlQa' no puede estar en blanco")
    @NotNull(message = "El campo 'urlQa' no puede ser nulo")
    @Column(name = "URL_QA")
    private String urlQa;
    @NotEmpty(message = "El campo 'urlDes' no puede estar vacio")
    @NotBlank(message = "El campo 'urlDes' no puede estar en blanco")
    @NotNull(message = "El campo 'urlDes' no puede ser nulo")
    @Column(name = "URL_DES")
    private String urlDes;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FECHA_CREACION")
    private Date fechaCreacion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_TIPO_SERVICIO")
    @JsonIgnoreProperties(value = { "hibernateLazyInitializer" })
    private TipoServicio tipoServicio;

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

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public TipoServicio getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(TipoServicio tipoServicio) {
        this.tipoServicio = tipoServicio;
    }
}
