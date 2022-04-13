package com.renault.lojacarros.model;

import java.io.Serializable;

public class Veiculo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8643860693568987119L;
	private String nome;
	private String placa;
	private String cor;
	
	
	

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Veiculo(String nome, String placa) {
		super();
		this.nome = nome;
		this.placa = placa;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

	public Veiculo() {
	}

	public Veiculo(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Veiculo [nome=" + nome + "]";
	}
	
}
