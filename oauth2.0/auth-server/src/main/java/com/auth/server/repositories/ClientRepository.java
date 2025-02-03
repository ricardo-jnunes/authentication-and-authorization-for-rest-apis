package com.auth.server.repositories;

import org.springframework.data.repository.CrudRepository;

import com.auth.server.entities.ClientEntity;

public interface ClientRepository extends CrudRepository<ClientEntity, Long> {

	public ClientEntity findByUsername(String username);

	public ClientEntity findByAccessToken(String accessToken);
}
