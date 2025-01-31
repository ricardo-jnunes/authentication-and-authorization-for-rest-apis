package com.auth.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.auth.client.dto.AccessTokenPasswordCredentialsRequest;
import com.auth.client.dto.AccessTokenPasswordCredentialsResponse;
import com.auth.client.services.UserServices;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	UserServices userServices;

	@PostMapping(path = "/login", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public AccessTokenPasswordCredentialsResponse authorize(
			@RequestParam(name = "grant_type", required = true) String grantType,
			@RequestParam(name = "username", required = true) String username,
			@RequestParam(name = "password", required = true) String password,
			@RequestParam(name = "scope", required = true) String scope) {
		AccessTokenPasswordCredentialsRequest request = new AccessTokenPasswordCredentialsRequest();
		request.setGrantType(password);
		request.setUsername(username);
		request.setPassword(password);
		request.setScope(password);
		return userServices.authorizeWithPasswordCredentials(request);
	}

}
