package com.auth.server.dto;

import com.fasterxml.jackson.annotation.JsonAlias;

import jakarta.validation.constraints.NotBlank;

public class AccessTokenPasswordCredentialsRequest {

	@JsonAlias("grant_type")
	private String grantType;

	@NotBlank
	@JsonAlias("username")
	private String username;

	@NotBlank
	@JsonAlias("password")
	private String password;

	@JsonAlias("client_id")
	private String clientId;

	@JsonAlias("client_secret")
	private String clientSecret;

	@JsonAlias("scope")
	private String scope;

	public String getGrantType() {
		return grantType;
	}

	public void setGrantType(String grantType) {
		this.grantType = grantType;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
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

}
