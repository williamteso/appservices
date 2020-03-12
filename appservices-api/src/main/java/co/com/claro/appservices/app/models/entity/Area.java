package co.com.claro.appservices.app.models.entity;

import javax.persistence.*;

@Entity
@Table(name = "SERV_AREA")
public class Area {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seqArea")
    @SequenceGenerator(name = "seqArea", sequenceName = "SEQ_AREA", initialValue = 1, allocationSize = 1)
    @Column(name = "ID_AREA")
    private Long idArea;
    @Column(name = "NOMBRE_AREA")
    private String nombreArea;
    @Column(name = "AREA_RESPONSABLE")
    private String areaResponsable;
    private String responsable;
    private String gerencia;

    public Area() {

    }

    public Long getIdArea() {
        return idArea;
    }

    public void setIdArea(Long idArea) {
        this.idArea = idArea;
    }

    public String getNombreArea() {
        return nombreArea;
    }

    public void setNombreArea(String nombreArea) {
        this.nombreArea = nombreArea;
    }

    public String getAreaResponsable() {
        return areaResponsable;
    }

    public void setAreaResponsable(String areaResponsable) {
        this.areaResponsable = areaResponsable;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public String getGerencia() {
        return gerencia;
    }

    public void setGerencia(String gerencia) {
        this.gerencia = gerencia;
    }
}
