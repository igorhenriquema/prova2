package com.projprova2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.projprova2.model.Funcionario;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario,Integer> { }

