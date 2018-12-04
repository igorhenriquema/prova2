package com.projprova2.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.projprova2.model.Produto;
import com.projprova2.repository.ProdutoRepository;

@Service
public class ProdutoService {
	@Autowired
	private ProdutoRepository repository;

	public List<Produto> findAll() {
		return repository.findAll();
	}

	public Produto findOne(int id) {
		return repository.findOne(id);
	}

	public List<Produto> findByEstoque(int codigo) {
		return repository.findByEstoque(codigo);
	}

	public Produto save(Produto post) {
		return repository.saveAndFlush(post);
	}

	public void delete(int id) {
		repository.delete(id);
	}
}