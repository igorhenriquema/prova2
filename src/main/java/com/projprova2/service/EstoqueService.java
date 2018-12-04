package com.projprova2.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.projprova2.model.Estoque;
import com.projprova2.repository.EstoqueRepository;

@Service
public class EstoqueService {

	@Autowired
	private EstoqueRepository repository;

	public List<Estoque> findAll() {
		return repository.findAll();
	}

	public Estoque findOne(int id) {
		return repository.findOne(id);
	}

	public Estoque save(Estoque post) {
		return repository.saveAndFlush(post);
	}

	public void delete(int id) {
		repository.delete(id);
	}
}