package com.auth.client.dto;

import com.fasterxml.jackson.annotation.JsonAlias;

public class RefreshTokenRequest {

	@JsonAlias("grant_type")
	private String grantType;

	@JsonAlias("refresh_token")
	private String refreshToken;

	@JsonAlias("scope")
	private String scope;

	public String getGrantType() {
		return grantType;
	}

	public void setGrantType(String grantType) {
		this.grantType = grantType;
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
