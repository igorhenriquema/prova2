package com.projprova2.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name = "tb_produto")
public class Produto implements Serializable {
	private static final long serialVersionUID = -5691864547321203913L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(nullable = false, length = 255)
	@NotBlank(message = "Nome é uma informação Obrigatória!")
	private String nome;

	@Column(nullable = false, length = 255)
	@NotBlank(message = "Descrição é uma informação Obrigatória!")
	private String descricao;

	@Column(nullable = false)
	@NotNull(message = "Código é uma informação Obrigatória!")
	private int codigo;

	@Column(nullable = false)
	@NotNull(message = "Preço de Custo é uma informação Obrigatória!")
	private float preco_custo;

	@Column(nullable = false)
	@NotNull(message = "Preço de Venda é informação Obrigatória!")
	private float preco_venda;

	public int getCodigo() {
		return codigo;
	}

	@ManyToOne
	private Estoque estoque;

	public Estoque getEstoque() {
		return estoque;
	}

	public void setProduto(Estoque estoque) {
		this.estoque = estoque;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getPreco_custo() {
		return preco_custo;
	}

	public void setPreco_custo(float preco_custo) {
		this.preco_custo = preco_custo;
	}

	public float getPreco_venda() {
		return preco_venda;
	}

	public void setPreco_venda(float preco_venda) {
		this.preco_venda = preco_venda;
	}

}
