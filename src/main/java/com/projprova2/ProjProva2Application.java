package com.projprova2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class ProjProva2Application {

	//Inicializa a aplicação
	public static void main(String[] args) {
		SpringApplication.run(ProjProva2Application.class, args);
	}
}
