package com.auth.client.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.auth.client.dto.UserDTO;

@RestController
public class UserController {

	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

	@GetMapping("/users/{id}")
	public UserDTO retornaUsuario() {
		return UserDTO.build(1L, "User");
	}
}
