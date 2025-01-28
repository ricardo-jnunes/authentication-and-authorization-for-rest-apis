package com.auth.client.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.auth.client.dto.PasswordBasedUserDTO;
import com.auth.client.dto.UserDTO;

@RestController
@RequestMapping("/users")
public class UserController {

	@GetMapping("/login")
	public UserDTO login() {
		return PasswordBasedUserDTO.build(1L, "Name of User", "123");
	}

}
