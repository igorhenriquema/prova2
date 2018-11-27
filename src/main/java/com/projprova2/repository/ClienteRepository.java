package com.projprova2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.projprova2.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository <Cliente,Integer> { }
