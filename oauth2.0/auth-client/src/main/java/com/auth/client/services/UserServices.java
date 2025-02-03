package com.auth.client.services;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.auth.client.dto.AccessTokenPasswordCredentialsRequest;
import com.auth.client.dto.AccessTokenPasswordCredentialsResponse;
import com.auth.client.dto.AccessTokenPasswordCredentialsValidateRequest;
import com.auth.client.dto.ProductDTO;

@Service
public class UserServices {

	private final WebClient authorizationServer = WebClient.create("http://localhost:8091");
	private final WebClient resourceServer = WebClient.create("http://localhost:8092");

	
	public AccessTokenPasswordCredentialsResponse authorizeWithPasswordCredentials(AccessTokenPasswordCredentialsRequest request) {
		AccessTokenPasswordCredentialsResponse responseSync = this.authorizationServer.post()
	        .uri("/auth/login")
	        .bodyValue(request)
	        .retrieve()
	        .bodyToMono(AccessTokenPasswordCredentialsResponse.class)
	        .block(); // Block to get the response synchronously
		
		return responseSync;
	}
	
	public List<ProductDTO> listProducts(String accessToken) {
		AccessTokenPasswordCredentialsValidateRequest request = new AccessTokenPasswordCredentialsValidateRequest();
		request.setAccessToken(accessToken);
		
		List<ProductDTO> responseSync = this.resourceServer.post()
	        .uri("/resource/products")
	        .bodyValue(request)
	        .retrieve()
	        .bodyToMono(new ParameterizedTypeReference<List<ProductDTO>>() {})
	        .block(); // Block to get the response synchronously
		
		return responseSync;
	}

}
