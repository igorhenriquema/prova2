package com.projprova2.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.projprova2.model.Cliente;
import com.projprova2.repository.ClienteRepository;

@Service
public class ClienteService {
	@Autowired
	private ClienteRepository repository;

	public List<Cliente> findAll() {
		return repository.findAll();
	}

	public Cliente findOne(int id) {
		return repository.findOne(id);
	}

	public Cliente save(Cliente post) {
		return repository.saveAndFlush(post);
	}

	public void delete(int id) {
		repository.delete(id);
	}
}
