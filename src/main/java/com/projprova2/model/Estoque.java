package com.projprova2.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.persistence.Column;


@Entity
@Table(name="tb_estoque")
public class Estoque implements Serializable {

	private static final long serialVersionUID = 7053670868708239495L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(nullable = false, length = 11)
	@NotNull(message = "Código é uma informação Obrigatória!")
	private int codigo;
	
	@Column(nullable = false, length = 50)
	@NotNull(message = "Quantidade total deve ser informada!")
	private double qtd_total;
	
	@Column(nullable = false, length = 50)
	@NotNull(message = "Quantidade minima deve ser informada!")
	private double qtd_min;
	
	@Column(nullable = false, length = 50)
	@NotNull(message = "Quantidade máxima deve ser informada!")
	private double qtd_max;
	

	
	public int getCodigo() {
		return codigo;
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
	public double getQtd_total() {
		return qtd_total;
	}
	public void setQtd_total(double qtd_total) {
		this.qtd_total = qtd_total;
	}
	public double getQtd_min() {
		return qtd_min;
	}
	public void setQtd_min(double qtd_min) {
		this.qtd_min = qtd_min;
	}
	public double getQtd_max() {
		return qtd_max;
	}
	public void setQtd_max(double qtd_max) {
		this.qtd_max = qtd_max;
	}
	
}
