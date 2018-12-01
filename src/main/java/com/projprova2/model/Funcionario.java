package com.projprova2.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name="tb_funcionario")
public class Funcionario extends Pessoa implements Serializable {

	private static final long serialVersionUID = 5976075792204292664L;
	
	@Column(nullable = false, length = 50)
	@NotBlank(message = "Nome é uma informação Obrigatória!")
	private String cargo;

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
}
