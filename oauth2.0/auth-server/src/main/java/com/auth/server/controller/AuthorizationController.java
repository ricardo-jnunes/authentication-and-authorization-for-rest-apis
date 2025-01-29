package com.auth.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.auth.server.dto.AccessTokenPasswordCredentialsRequest;
import com.auth.server.dto.AccessTokenPasswordCredentialsResponse;
import com.auth.server.services.AuthorizationServices;

@RestController
@RequestMapping("/auth")
public class AuthorizationController {

	@Autowired
	AuthorizationServices authServices;
	
	@PostMapping("/login")
	public AccessTokenPasswordCredentialsResponse authorize(
			@RequestBody AccessTokenPasswordCredentialsRequest request) {
		return authServices.authorizeWithPasswordCredentials(request);
	}

}
