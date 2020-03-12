package co.com.claro.appservices.app.models.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "SERV_TIPO_METODO")
public class TipoMetodo {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seqTipoMetodo")
    @SequenceGenerator(name = "seqTipoMetodo", sequenceName = "SEQ_TIPO_METODO", initialValue = 1, allocationSize = 1)
    @Column(name = "ID_TIPO_METODO")
    private Long idTipoMetodo;
    @Lob
    private Byte[] request;
    @Lob
    private Byte[] response;
    @JoinColumn(name = "ID_METODO")
    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Metodo.class)
    private List<Metodo> metodos;

    public TipoMetodo() {
        this.metodos = new ArrayList<>();
    }

    public Long getIdTipoMetodo() {
        return idTipoMetodo;
    }

    public void setIdTipoMetodo(Long idTipoMetodo) {
        this.idTipoMetodo = idTipoMetodo;
    }

    public Byte[] getRequest() {
        return request;
    }

    public void setRequest(Byte[] request) {
        this.request = request;
    }

    public Byte[] getResponse() {
        return response;
    }

    public void setResponse(Byte[] response) {
        this.response = response;
    }

    public List<Metodo> getMetodos() {
        return metodos;
    }

    public void setMetodos(List<Metodo> metodos) {
        this.metodos = metodos;
    }
}
