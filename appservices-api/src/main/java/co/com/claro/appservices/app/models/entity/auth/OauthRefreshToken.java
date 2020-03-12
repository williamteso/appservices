package co.com.claro.appservices.app.models.entity.auth;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table( name = "SERV_OAUTH_REFRESH_TOKEN")
public class OauthRefreshToken implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "token_id")
    private String tokenId;
    @Lob
    private Byte[] token;
    @Lob
    private Byte[] authentication;

    public OauthRefreshToken() {

    }

    public String getTokenId() {
        return tokenId;
    }

    public void setTokenId(String tokenId) {
        this.tokenId = tokenId;
    }

    public Byte[] getToken() {
        return token;
    }

    public void setToken(Byte[] token) {
        this.token = token;
    }

    public Byte[] getAuthentication() {
        return authentication;
    }

    public void setAuthentication(Byte[] authentication) {
        this.authentication = authentication;
    }
}
