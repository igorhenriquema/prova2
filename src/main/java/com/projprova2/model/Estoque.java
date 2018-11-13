package com.projprova2.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_estoque")
public class Estoque implements Serializable {

	private static final long serialVersionUID = 7053670868708239495L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String endereco;
	private double qtd_total;
	private double qtd_min;
	private double qtd_max;

}
