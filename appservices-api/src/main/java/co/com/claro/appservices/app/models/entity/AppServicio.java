package co.com.claro.appservices.app.models.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "APP_SERVICIO")
public class AppServicio {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seqAppServicio")
    @SequenceGenerator(name = "seqAppServicio", sequenceName = "SEQ_APP_SERVICIO", initialValue = 1, allocationSize = 1)
    @Column(name = "ID_APPSERV")
    private Long idAppServ;
    @JoinColumn(name = "ID_SERVICIO")
    @ManyToOne(fetch = FetchType.LAZY)
    private List<Servicio> servicios;
    @JoinColumn(name = "ID_APLICACION_PROVEE")
    @ManyToOne(fetch = FetchType.LAZY)
    private List<Aplicacion> aplicacionesProvee;
    @JoinColumn(name = "ID_APLICACION_CONSUMO")
    @ManyToOne(fetch = FetchType.LAZY)
    private List<Aplicacion> aplicacionesConsumo;

    public AppServicio() {

    }

    public Long getIdAppServ() {
        return idAppServ;
    }

    public void setIdAppServ(Long idAppServ) {
        this.idAppServ = idAppServ;
    }

    public List<Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(List<Servicio> servicios) {
        this.servicios = servicios;
    }

    public List<Aplicacion> getAplicacionesProvee() {
        return aplicacionesProvee;
    }

    public void setAplicacionesProvee(List<Aplicacion> aplicacionesProvee) {
        this.aplicacionesProvee = aplicacionesProvee;
    }

    public List<Aplicacion> getAplicacionesConsumo() {
        return aplicacionesConsumo;
    }

    public void setAplicacionesConsumo(List<Aplicacion> aplicacionesConsumo) {
        this.aplicacionesConsumo = aplicacionesConsumo;
    }
}
