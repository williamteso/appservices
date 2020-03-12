package co.com.claro.appservices.app.models.entity.auth;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "SERV_OAUTH_CLIENT_DETAILS")
public class OauthClientDetail implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "client_id")
	private String clientId;
	@Column(name = "resource_ids")
	private String resourceIds;
	@Column(name = "client_secret")
	private String clientSecret;
	private String scope;
	@Column(name = "authorized_grant_types")
	private String authorizedGrantTypes;
	@Column(name = "web_server_redirect_uri")
	private String webServerRedirectURI;
	private String authorities;
	@Column(name = "access_token_validity")
	private Integer accessTokenValidity;
	@Column(name = "refresh_token_validity")
	private Integer refreshTokenValidity;
	@Column(name = "additional_information")
	private String additionalInformation;
	private String autoapprove;
	
	public OauthClientDetail() {
		
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getResourceIds() {
		return resourceIds;
	}

	public void setResourceIds(String resourceIds) {
		this.resourceIds = resourceIds;
	}

	public String getClientSecret() {
		return clientSecret;
	}

	public void setClientSecret(String clientSecret) {
		this.clientSecret = clientSecret;
	}

	public String getScope() {
		return scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public String getAuthorizedGrantTypes() {
		return authorizedGrantTypes;
	}

	public void setAuthorizedGrantTypes(String authorizedGrantTypes) {
		this.authorizedGrantTypes = authorizedGrantTypes;
	}

	public String getWebServerRedirectURI() {
		return webServerRedirectURI;
	}

	public void setWebServerRedirectURI(String webServerRedirectURI) {
		this.webServerRedirectURI = webServerRedirectURI;
	}

	public String getAuthorities() {
		return authorities;
	}

	public void setAuthorities(String authorities) {
		this.authorities = authorities;
	}

	public Integer getAccessTokenValidity() {
		return accessTokenValidity;
	}

	public void setAccessTokenValidity(Integer accessTokenValidity) {
		this.accessTokenValidity = accessTokenValidity;
	}

	public Integer getRefreshTokenValidity() {
		return refreshTokenValidity;
	}

	public void setRefreshTokenValidity(Integer refreshTokenValidity) {
		this.refreshTokenValidity = refreshTokenValidity;
	}

	public String getAdditionalInformation() {
		return additionalInformation;
	}

	public void setAdditionalInformation(String additionalInformation) {
		this.additionalInformation = additionalInformation;
	}

	public String getAutoapprove() {
		return autoapprove;
	}

	public void setAutoapprove(String autoapprove) {
		this.autoapprove = autoapprove;
	}
	
	

}
