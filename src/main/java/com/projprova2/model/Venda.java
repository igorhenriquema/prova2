package com.projprova2.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="tb_venda")
public class Venda {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = false)
	@NotNull(message = "ID do Cliente é uma informação Obrigatória!")
	private int id_cliente;
	
	@Column(nullable = false)
	@NotNull(message = "ID do Funcionário é uma informação Obrigatória!")
	private int id_funcionario;
	
	private Date dt_venda;
	
	@Column(nullable = false)
	@NotNull(message = "Valor Total é uma informação Obrigatória!")
	private float val_total;
	
	private Produto produtos;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId_cliente() {
		return id_cliente;
	}
	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}
	public int getId_funcionario() {
		return id_funcionario;
	}
	public void setId_funcionario(int id_funcionario) {
		this.id_funcionario = id_funcionario;
	}
	public Date getDt_venda() {
		return dt_venda;
	}
	public void setDt_venda(Date dt_venda) {
		this.dt_venda = dt_venda;
	}
	public float getVal_total() {
		return val_total;
	}
	public void setVal_total(float val_total) {
		this.val_total = val_total;
	}
	public Produto getProdutos() {
		return produtos;
	}
	public void setProdutos(Produto produtos) {
		this.produtos = produtos;
	}
}
