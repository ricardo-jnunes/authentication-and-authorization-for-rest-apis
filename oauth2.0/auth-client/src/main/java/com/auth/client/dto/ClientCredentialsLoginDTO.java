package com.auth.client.dto;

import com.fasterxml.jackson.annotation.JsonAlias;

public class ClientCredentialsLoginDTO {

	@JsonAlias("client_id")
	private String clientdId;

	@JsonAlias("client_secret")
	private String clientSecret;

	public String getClientdId() {
		return clientdId;
	}

	public void setClientdId(String clientdId) {
		this.clientdId = clientdId;
	}

	public String getClientSecret() {
		return clientSecret;
	}

	public void setClientSecret(String clientSecret) {
		this.clientSecret = clientSecret;
	}

}
