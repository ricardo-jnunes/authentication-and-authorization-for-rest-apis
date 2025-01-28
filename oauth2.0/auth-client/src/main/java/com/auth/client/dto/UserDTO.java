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

}
