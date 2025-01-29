package com.auth.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.auth.client.dto.AccessTokenPasswordCredentialsRequest;
import com.auth.client.dto.AccessTokenPasswordCredentialsResponse;
import com.auth.client.services.UserServices;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	UserServices userServices;

	@PostMapping("/login")
	public AccessTokenPasswordCredentialsResponse authorize(
			@RequestBody AccessTokenPasswordCredentialsRequest request) {
		return userServices.authorizeWithPasswordCredentials(request);
	}

}
