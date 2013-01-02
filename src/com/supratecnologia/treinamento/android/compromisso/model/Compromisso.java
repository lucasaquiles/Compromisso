package com.supratecnologia.treinamento.android.compromisso.model;

import java.io.Serializable;
import java.util.Date;

public class Compromisso implements Serializable{
	
	private String titulo;
	private String descricao;
	
	private Date dataInicio;
	private Date dataFim;
	private boolean status;
	
	public Compromisso(){
		
	}
	
	public Compromisso(String titulo, String descricao, Date dataInicio, Date dataFim, boolean status, Usuario usuario) {
		super();
		this.titulo = titulo;
		this.descricao = descricao;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.status = status;
		this.usuario = usuario;
	}



	private Usuario usuario;
	
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Date getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	public Date getDataFim() {
		return dataFim;
	}
	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getTitulo();
	}
}
