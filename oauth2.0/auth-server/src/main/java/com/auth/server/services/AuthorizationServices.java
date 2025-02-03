package com.auth.server.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.auth.server.dto.AccessTokenPasswordCredentialsRequest;
import com.auth.server.dto.AccessTokenPasswordCredentialsResponse;
import com.auth.server.dto.AccessTokenPasswordCredentialsValidateRequest;
import com.auth.server.dto.AccessTokenPasswordCredentialsValidateResponse;
import com.auth.server.entities.ClientEntity;
import com.auth.server.repositories.ClientRepository;

@Service
public class AuthorizationServices {

	@Autowired
	private ClientRepository clientRepository;

	public AccessTokenPasswordCredentialsResponse authorizeWithPasswordCredentials(
			AccessTokenPasswordCredentialsRequest request) {

		Optional<ClientEntity> clientEntityOpt = Optional
				.ofNullable(clientRepository.findByUsername(request.getUsername()));

		AccessTokenPasswordCredentialsResponse response = new AccessTokenPasswordCredentialsResponse();
		if (clientEntityOpt.isPresent()) {
			ClientEntity clientEntity = clientEntityOpt.get();
			response.setAccessToken(clientEntity.getAccessToken());
			response.setExpiresIn(clientEntity.getExpiresIn());
			response.setRefreshToken(clientEntity.getRefreshToken());
			response.setTokenType(clientEntity.getTokenType());

		}
		return response;
	}

	public AccessTokenPasswordCredentialsValidateResponse validateAcessTokenPasswordCredentials(
			AccessTokenPasswordCredentialsValidateRequest request) {

		Optional<ClientEntity> clientEntityOpt = Optional
				.ofNullable(clientRepository.findByAccessToken(request.getAccessToken()));

		AccessTokenPasswordCredentialsValidateResponse response = new AccessTokenPasswordCredentialsValidateResponse();
		if (clientEntityOpt.isPresent()) {
			ClientEntity clientEntity = clientEntityOpt.get();
			String accessToken1 = clientEntity.getAccessToken();
			String accessToken2 = request.getAccessToken();
			response.setValid(accessToken1.contentEquals(accessToken2));

		}
		return response;
	}

}
