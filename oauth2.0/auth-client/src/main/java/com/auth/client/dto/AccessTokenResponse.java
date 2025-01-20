package com.auth.client.dto;

import com.fasterxml.jackson.annotation.JsonAlias;

public class AccessTokenResponse {

	@JsonAlias("access_token")
	private String accessToken;

	@JsonAlias("token_type")
	private String tokenType;

	@JsonAlias("expires_in")
	private String expiresIn;

	@JsonAlias("refresh_token")
	private String refreshToken;

	@JsonAlias("scope")
	private String scope;

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

	public String getExpiresIn() {
		return expiresIn;
	}

	public void setExpiresIn(String expiresIn) {
		this.expiresIn = expiresIn;
	}

	public String getRefreshToken() {
		return refreshToken;
	}

	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}

	public String getScope() {
		return scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

}
