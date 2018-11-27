package com.projprova2.repository;


//import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.projprova2.model.Estoque;
//import com.projprova2.model.Produto;

@Repository
public interface EstoqueRepository extends JpaRepository<Estoque,Integer> {
	
}
