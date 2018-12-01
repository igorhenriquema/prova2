package com.projprova2.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name="tb_fornecedor")
public class Fornecedor implements Serializable {

	private static final long serialVersionUID = -7363943922210692608L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = false, length = 20)
	@NotBlank(message = "CNPJ é uma informação Obrigatória!")
	private String cnpj;
	
	@Column(nullable = false, length = 20)
	@NotBlank(message = "Telefone é uma informação Obrigatória!")
	private String telefone;
	
	@Column(nullable = false, length = 255)
	@NotBlank(message = "Razão Social é uma informação Obrigatória!")
	private String razaosocial;
	
	@Column(nullable = false, length = 255)
	@NotBlank(message = "Endereço é uma informação Obrigatória!")
	private String endereco;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getRazaosocial() {
		return razaosocial;
	}
	public void setRazaosocial(String razaosocial) {
		this.razaosocial = razaosocial;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}	

}
