package co.com.claro.appservices.app.models.entity.auth;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "SERV_OAUTH_CODE")
public class OauthCode implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String code;

    private Byte authentication;

    public OauthCode() {

    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Byte getAuthentication() {
        return authentication;
    }

    public void setAuthentication(Byte authentication) {
        this.authentication = authentication;
    }
}
