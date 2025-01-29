package com.auth.server.services;

import org.springframework.stereotype.Service;

import com.auth.server.dto.AccessTokenPasswordCredentialsRequest;
import com.auth.server.dto.AccessTokenPasswordCredentialsResponse;

@Service
public class AuthorizationServices {

	public AccessTokenPasswordCredentialsResponse authorizeWithPasswordCredentials(
			AccessTokenPasswordCredentialsRequest value) {
		AccessTokenPasswordCredentialsResponse response = new AccessTokenPasswordCredentialsResponse();
		response.setAccessToken("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		return response;
	}

}
