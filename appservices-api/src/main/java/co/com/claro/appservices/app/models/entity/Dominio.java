package co.com.claro.appservices.app.models.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "DOMINIO")
public class Dominio {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seqDominio")
    @SequenceGenerator(name = "seqDominio", sequenceName = "SEQ_DOMINIO", initialValue = 1, allocationSize = 1)
    @Column(name = "ID_DOMINIO")
    private Long idDominio;
    @Column(name = "NOMBRE_DOMINIO")
    private String nombreDominio;
    @Column(name = "DOMINIO_DESPLIEGUE")
    private String dominioDespliegue;
    @JoinColumn(name = "id_area")
    @ManyToOne(fetch = FetchType.LAZY)
    private List<Area> areas;

    public Dominio() {

    }

    public Long getIdDominio() {
        return idDominio;
    }

    public void setIdDominio(Long idDominio) {
        this.idDominio = idDominio;
    }

    public String getNombreDominio() {
        return nombreDominio;
    }

    public void setNombreDominio(String nombreDominio) {
        this.nombreDominio = nombreDominio;
    }

    public String getDominioDespliegue() {
        return dominioDespliegue;
    }

    public void setDominioDespliegue(String dominioDespliegue) {
        this.dominioDespliegue = dominioDespliegue;
    }

    public List<Area> getAreas() {
        return areas;
    }

    public void setAreas(List<Area> areas) {
        this.areas = areas;
    }
}
