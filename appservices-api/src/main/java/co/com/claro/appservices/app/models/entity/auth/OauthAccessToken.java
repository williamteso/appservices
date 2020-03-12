package co.com.claro.appservices.app.models.entity.auth;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "SERV_OAUTH_ACCESS_TOKEN")
public class OauthAccessToken implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "token_id")
    private String tokenId;
    @Lob
    private Byte[] token;
    @Column(name = "authentication_id")
    private String authenticationId;
    @Column(name = "user_name")
    private String username;
    @Column(name = "client_id")
    private String clientId;
    @Lob
    private Byte[] authentication;
    @Column(name = "refresh_token",length = 6000)
    private String refreshToken;

    public OauthAccessToken() {

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

    public String getAuthenticationId() {
        return authenticationId;
    }

    public void setAuthenticationId(String authenticationId) {
        this.authenticationId = authenticationId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public Byte[] getAuthentication() {
        return authentication;
    }

    public void setAuthentication(Byte[] authentication) {
        this.authentication = authentication;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }
}
