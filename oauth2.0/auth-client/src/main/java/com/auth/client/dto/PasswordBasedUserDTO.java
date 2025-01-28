package com.auth.client.dto;

import java.util.ArrayList;
import java.util.List;

import com.auth.client.contants.AuthenticationMethods;
import com.auth.client.contants.Permission;

public class PasswordBasedUserDTO extends UserDTO {
	public static final AuthenticationMethods authenticationMethod = AuthenticationMethods.PASSWORDBASED_AUTHENTICATION;

	private String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public static UserDTO build(Long idParam, String nameParam, String pwdParam) {
		PasswordBasedUserDTO user = new PasswordBasedUserDTO();
		List<Permission> permissions = new ArrayList<Permission>();

		user.setId(idParam);
		user.setName(nameParam);
		user.setPassword(pwdParam);

		permissions.add(Permission.READ);
		permissions.add(Permission.WRITE);
		user.setPermissions(permissions);

		return user;
	}

}
