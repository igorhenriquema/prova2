package com.projprova2.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name="tb_cliente")
public class Cliente extends Pessoa implements Serializable {

	private static final long serialVersionUID = -5691864547321203913L;
	
	@Column(nullable = false, length = 255)
	@NotBlank(message = "Login é uma informação Obrigatória!")
	private String login;
	
	@Column(nullable = false, length = 255)
	@NotBlank(message = "Senha é uma informação Obrigatória!")
	private String password;
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
