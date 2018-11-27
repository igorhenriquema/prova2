package com.projprova2.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.projprova2.model.Fornecedor;
import com.projprova2.repository.FornecedorRepository;

@Service
public class FornecedorService {
	@Autowired
	private FornecedorRepository repository;

	public List<Fornecedor> findAll() {
		return repository.findAll();
	}

	public Fornecedor findOne(int id) {
		return repository.findOne(id);
	}

	public Fornecedor save(Fornecedor post) {
		return repository.saveAndFlush(post);
	}

	public void delete(int id) {
		repository.delete(id);
	}
}
