package com.auth.client.dto;

import com.fasterxml.jackson.annotation.JsonAlias;

public class AccessTokenRequest {

	@JsonAlias("grant_type")
	private String grantType;

	@JsonAlias("code")
	private String code;

	@JsonAlias("redirect_uri")
	private String redirectUri;

	@JsonAlias("client_id")
	private String clientId;

	public String getGrantType() {
		return grantType;
	}

	public void setGrantType(String grantType) {
		this.grantType = grantType;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getRedirectUri() {
		return redirectUri;
	}

	public void setRedirectUri(String redirectUri) {
		this.redirectUri = redirectUri;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	
	
}
