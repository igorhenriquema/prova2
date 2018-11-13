package com.projprova2.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="tb_cliente")
public class Cliente extends Pessoa implements Serializable {

	private static final long serialVersionUID = -5691864547321203913L;
	
	private String login;
	private String passowrd;
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassowrd() {
		return passowrd;
	}
	public void setPassowrd(String passowrd) {
		this.passowrd = passowrd;
	}
}
