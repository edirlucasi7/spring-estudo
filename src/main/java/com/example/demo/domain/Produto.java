package com.example.demo.domain;

public class Produto {

	private String nome;
	private String sexo;
	
	public Produto() {

	}

	public Produto(String nome, String sexo) {
		this.nome = nome;
		this.sexo = sexo;
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
}
