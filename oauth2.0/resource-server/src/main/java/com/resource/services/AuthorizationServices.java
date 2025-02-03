package com.resource.services;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.resource.dto.AccessTokenPasswordCredentialsValidateRequest;
import com.resource.dto.AccessTokenPasswordCredentialsValidateResponse;

@Service
public class AuthorizationServices {

	private final WebClient authorizationServer = WebClient.create("http://localhost:8091");

	
	public boolean validateAccessToken(AccessTokenPasswordCredentialsValidateRequest request) {
		AccessTokenPasswordCredentialsValidateResponse responseSync = this.authorizationServer.post()
	        .uri("/auth/validate")
	        .bodyValue(request)
	        .retrieve()
	        .bodyToMono(AccessTokenPasswordCredentialsValidateResponse.class)
	        .block(); // Block to get the response synchronously
		
		return responseSync.isValid();
	}
	

}
