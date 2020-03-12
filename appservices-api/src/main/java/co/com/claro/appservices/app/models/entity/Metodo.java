package co.com.claro.appservices.app.models.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "SERV_METODO")
public class Metodo {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seqMetodo")
    @SequenceGenerator(name = "seqMetodo", sequenceName = "SEQ_METODO", initialValue = 1, allocationSize = 1)
    @Column(name = "ID_METODO")
    private Long idMetodo;
    @Column(name = "NOMBRE_METODO")
    private String nombreMetodo;
    private String descripcion;
    @JoinColumn(name = "ID_SERVICIO")
    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Servicio.class)
    private List<Servicio> servicios;

    public Metodo() {
        this.servicios = new ArrayList<>();
    }

    public Long getIdMetodo() {
        return idMetodo;
    }

    public void setIdMetodo(Long idMetodo) {
        this.idMetodo = idMetodo;
    }

    public String getNombreMetodo() {
        return nombreMetodo;
    }

    public void setNombreMetodo(String nombreMetodo) {
        this.nombreMetodo = nombreMetodo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(List<Servicio> servicios) {
        this.servicios = servicios;
    }
}
