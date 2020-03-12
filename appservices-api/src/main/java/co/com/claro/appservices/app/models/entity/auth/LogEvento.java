package co.com.claro.appservices.app.models.entity.auth;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "SERV_LOG_EVENTO_OAUTH")
public class LogEvento implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seqLogEvento")
    @SequenceGenerator(name = "seqLogEvento", sequenceName = "SEQ_LOG_EVENTO", initialValue = 1, allocationSize = 1)
    private Long id;
    private String username;
    private String msg;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_evento")
    private Date fechaEvento;

    @PrePersist()
    public void prePersist() {
        fechaEvento = new Date();
    }

    public LogEvento() {

    }

    public LogEvento(String username, String msg) {
        this.username = username;
        this.msg = msg;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Date getFechaEvento() {
        return fechaEvento;
    }

    public void setFechaEvento(Date fechaEvento) {
        this.fechaEvento = fechaEvento;
    }
}
