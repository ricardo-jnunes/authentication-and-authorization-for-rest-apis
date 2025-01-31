package com.auth.client.dto;

import com.fasterxml.jackson.annotation.JsonAlias;

public class AccessTokenPasswordCredentialsResponse {

	@JsonAlias("access_token")
	private String accessToken;

	@JsonAlias("token_type")
	private String tokenType;

	@JsonAlias("expires_in")
	private int expiresIn;

	@JsonAlias("refresh_token")
	private String refreshToken;

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

	public int getExpiresIn() {
		return expiresIn;
	}

	public void setExpiresIn(int expiresIn) {
		this.expiresIn = expiresIn;
	}

	public String getRefreshToken() {
		return refreshToken;
	}

	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}
}
