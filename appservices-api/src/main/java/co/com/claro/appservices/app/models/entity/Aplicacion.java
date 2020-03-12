package co.com.claro.appservices.app.models.entity;

import javax.persistence.*;

@Entity
@Table(name = "SERV_APLICACION")
public class Aplicacion {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seqAplicacion")
    @SequenceGenerator(name = "seqAplicacion", sequenceName = "SEQ_APLICACION", initialValue = 1, allocationSize = 1)
    @Column(name = "ID_APLICACION")
    private Long idAplicacion;
    @Column(name = "NOMBRE_APLICACION")
    private String nombreAplicacion;
    private String descripcion;
    private String operacion;

    public Aplicacion() {

    }

    public Long getIdAplicacion() {
        return idAplicacion;
    }

    public void setIdAplicacion(Long idAplicacion) {
        this.idAplicacion = idAplicacion;
    }

    public String getNombreAplicacion() {
        return nombreAplicacion;
    }

    public void setNombreAplicacion(String nombreAplicacion) {
        this.nombreAplicacion = nombreAplicacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }
}
