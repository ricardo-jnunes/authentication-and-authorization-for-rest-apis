package com.auth.client.interceptor;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

import org.springframework.http.HttpHeaders;
import org.springframework.web.servlet.HandlerInterceptor;

import com.auth.client.contants.Endpoints;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class BasicAuthenticationInterceptor implements HandlerInterceptor {

	private static final String USERNAME = "admin";
	private static final String PASSWORD = "admin";

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO is calling twice
		System.out.println("1 - preHandle() : Before sending request to the Controller");
		String authHeader = request.getHeader(HttpHeaders.AUTHORIZATION);
		if (authHeader != null && authHeader.startsWith("Basic ")) {

			String base64Credentials = authHeader.substring("Basic ".length());
			byte[] decodedCredentials = Base64.getDecoder().decode(base64Credentials);
			String credentials = new String(decodedCredentials, StandardCharsets.UTF_8);

			String[] parts = credentials.split(":");
			String username = parts[0];
			String password = parts[1];

			if (USERNAME.equals(username) && PASSWORD.equals(password)) {
				return true;
			}
		}

		response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Unauthorized");
		return false;
	}

}
