package com.auth.client.dto;

import java.util.ArrayList;
import java.util.List;

import com.auth.client.contants.Permission;

public class UserDTO {
	private Long id;
	private String name;
	private List<Permission> permissions;

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

	public List<Permission> getPermissions() {
		if (permissions == null || permissions.isEmpty()) {
			List<Permission> permissions = new ArrayList<Permission>();
			permissions.add(Permission.NONE);
			setPermissions(permissions);
		}
		return permissions;
	}

	public void setPermissions(List<Permission> permissions) {
		this.permissions = permissions;
	}

	public static UserDTO build(Long idParam, String nameParam) {
		UserDTO user = new UserDTO();
		user.setId(idParam);
		user.setName(nameParam);
		return user;
	}

	public static List<UserDTO> build() {
		List<UserDTO> users = new ArrayList<UserDTO>();
		for (long i = 0; i < 5; i++) {
			UserDTO user = new UserDTO();
			user.setId(i);
			user.setName("User_" + i);

			List<Permission> permissions = new ArrayList<Permission>();
			if (i % 2 == 0) {
				permissions.add(Permission.READ);
				permissions.add(Permission.WRITE);
				user.setPermissions(permissions);
			} else {
				permissions.add(Permission.READ);
				user.setPermissions(permissions);
			}
			users.add(user);
		}
		return users;
	}
}
