package com.auth.client.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.auth.client.dto.UserDTO;

@RestController
@RequestMapping("/users")
public class UserController {

	@GetMapping("/login")
	public List<UserDTO> login() {
		return UserDTO.build();
	}
	
	@GetMapping("/{id}")
	public UserDTO getUser() {
		return UserDTO.build(99L, "User");
	}

	@GetMapping("/list")
	public List<UserDTO> listUsers() {
		return UserDTO.build();
	}
}
