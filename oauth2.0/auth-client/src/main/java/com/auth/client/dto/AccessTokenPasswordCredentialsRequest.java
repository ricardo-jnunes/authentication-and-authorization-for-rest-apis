package com.auth.client.dto;

import com.fasterxml.jackson.annotation.JsonAlias;

import jakarta.validation.constraints.NotBlank;

public class AccessTokenPasswordCredentialsRequest {

	@NotBlank
	@JsonAlias("grant_type")
	private String grantType;

	@NotBlank
	@JsonAlias("username")
	private String username;

	@NotBlank
	@JsonAlias("password")
	private String password;

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

	public String getScope() {
		return scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

}
