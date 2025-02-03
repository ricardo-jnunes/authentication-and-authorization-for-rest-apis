package com.auth.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.auth.server.dto.AccessTokenPasswordCredentialsValidateRequest;
import com.auth.server.dto.AccessTokenPasswordCredentialsValidateResponse;
import com.auth.server.services.AuthorizationServices;

@RestController
@RequestMapping("/auth")
public class ResourceValidationController {

	@Autowired
	AuthorizationServices authServices;
	
	@PostMapping("/validate")
	public AccessTokenPasswordCredentialsValidateResponse validate(
			@RequestBody AccessTokenPasswordCredentialsValidateRequest request) {
		return authServices.validateAcessTokenPasswordCredentials(request);
	}

}
