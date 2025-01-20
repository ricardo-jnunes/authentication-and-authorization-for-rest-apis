package com.auth.client.dto;

public class UserDTO {
	private Long id;
	private String name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static UserDTO build(Long idParam, String nameParam) {
		UserDTO user = new UserDTO();
		user.setId(idParam);
		user.setName(nameParam);
		return user;
	}
}
