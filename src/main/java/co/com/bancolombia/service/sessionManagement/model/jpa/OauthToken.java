package co.com.bancolombia.service.sessionManagement.model.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "oauth2_tokens")
public class OauthToken {

	@Id
	@Column(name = "id")
	private String id;
	
	@Column(name = "credential_id")
    private String credentialId;
	
	@Column(name = "access_token")
    private String accessToken;
	
	@Column(name = "token_type")
    private String tokenType;

	@Column(name = "refresh_token")
    private String refreshToken;

	@Column(name = "expires_in")
    private String expiresIn;

	@Column(name = "authenticated_userid")
    private String authenticatedUserid;

	@Column(name = "scope")
    private String scope;

	@Column(name = "created_at")
    private String createdAt;

	@Column(name = "api_id")
    private String apiId;

	@Column(name = "service_id")
    private String serviceId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCredentialId() {
		return credentialId;
	}

	public void setCredentialId(String credentialId) {
		this.credentialId = credentialId;
	}

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public String getTokenType() {
		return tokenType;
	}

	public void setTokenType(String tokenType) {
		this.tokenType = tokenType;
	}

	public String getRefreshToken() {
		return refreshToken;
	}

	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}

	public String getExpiresIn() {
		return expiresIn;
	}

	public void setExpiresIn(String expiresIn) {
		this.expiresIn = expiresIn;
	}

	public String getAuthenticatedUserid() {
		return authenticatedUserid;
	}

	public void setAuthenticatedUserid(String authenticatedUserid) {
		this.authenticatedUserid = authenticatedUserid;
	}

	public String getScope() {
		return scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public String getApiId() {
		return apiId;
	}

	public void setApiId(String apiId) {
		this.apiId = apiId;
	}

	public String getServiceId() {
		return serviceId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}
}
