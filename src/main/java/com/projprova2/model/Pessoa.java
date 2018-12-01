package com.projprova2.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.hibernate.validator.constraints.NotBlank;


@MappedSuperclass
public abstract class Pessoa implements Serializable{

	private static final long serialVersionUID = -1036238487151963790L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = false, length = 16)
	@NotBlank(message = "CPF é uma informação Obrigatória!")
	private String CPF;
	
	@Column(nullable = false, length = 13)
	@NotBlank(message = "RG é uma informação Obrigatória!")
	private String RG;
	
	@Column(nullable = false, length = 255)
	@NotBlank(message = "Nome é uma informação Obrigatória!")
	private String nome;
	
	@Column(nullable = false, length = 9)
	@NotBlank(message = "Sexo é uma informação Obrigatória!")
	private String sexo;
	
	@Column(nullable = false, length = 255)
	@NotBlank(message = "Endereço é uma informação Obrigatória!")
	private String endereco;
	
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getRG() {
		return RG;
	}
	public void setRG(String rG) {
		RG = rG;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
}
