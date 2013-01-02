package com.supratecnologia.treinamento.android.compromisso.model;

import java.io.Serializable;
import java.util.ArrayList;

public class Usuario implements Serializable{
	
	private String nome;
	private String login;
	private String senha;
	private boolean status;
	
	public Usuario(){
		this.compromissos = new ArrayList<Compromisso>();
	
	}
	
	public Usuario(String nome, String login, String senha, boolean status){
		this.compromissos = new ArrayList<Compromisso>();
		this.nome = nome;
		this.login = login;
		this.senha = senha;
		this.status = status;
	}
	
	private ArrayList<Compromisso> compromissos;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public ArrayList<Compromisso> getCompromissos() {
		return compromissos;
	}

	public void setCompromissos(ArrayList<Compromisso> compromissos) {
		this.compromissos = compromissos;
	}
	
	
}
