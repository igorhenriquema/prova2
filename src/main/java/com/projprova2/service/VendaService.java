package com.projprova2.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.projprova2.model.Venda;
import com.projprova2.repository.VendaRepository;

@Service
public class VendaService {
	@Autowired
	private VendaRepository repository;

	public List<Venda> findAll() {
		return repository.findAll();
	}

	public Venda findOne(int id) {
		return repository.findOne(id);
	}

	public Venda save(Venda post) {
		return repository.saveAndFlush(post);
	}

	public void delete(int id) {
		repository.delete(id);
	}
}
