package com.auth.client.services;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.auth.client.dto.AccessTokenPasswordCredentialsRequest;
import com.auth.client.dto.AccessTokenPasswordCredentialsResponse;

@Service
public class UserServices {

	private final WebClient authorizationServer = WebClient.create("http://localhost:8091");
	
	public AccessTokenPasswordCredentialsResponse authorizeWithPasswordCredentials(AccessTokenPasswordCredentialsRequest request) {
		AccessTokenPasswordCredentialsResponse responseSync = this.authorizationServer.post()
	        .uri("/auth/login")
	        .bodyValue(request)
	        .retrieve()
	        .bodyToMono(AccessTokenPasswordCredentialsResponse.class)
	        .block(); // Block to get the response synchronously
		
		return responseSync;
	}

}
