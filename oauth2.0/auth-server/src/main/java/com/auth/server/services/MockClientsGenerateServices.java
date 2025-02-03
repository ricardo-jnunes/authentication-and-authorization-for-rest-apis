package com.auth.server.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import com.auth.server.entities.ClientEntity;
import com.auth.server.repositories.ClientRepository;

@Service
public class MockClientsGenerateServices {

	@Autowired
	private ClientRepository clientRepository;

	@EventListener(ApplicationReadyEvent.class)
	public void doAfterStartup() {
		System.out.println("Application ready. Creating sample clients.");
		generateClients();
	}

	public void generateClients() {
		ClientEntity client1 = new ClientEntity();
		client1.setId(1L);
		client1.setUsername("test");
		client1.setPassword("test");
		client1.setAccessToken("1234");
		client1.setExpiresIn(3600);
		client1.setTokenType("password");
		client1.setScope("read write");
		clientRepository.save(client1);

	}

}
