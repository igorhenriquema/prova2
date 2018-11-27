package com.projprova2.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projprova2.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto,Integer> {
	
	List<Produto> findByEstoque(int codigo);
	
}
