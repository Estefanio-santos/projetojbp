package com.javabank.power.model;

import javax.persistence.*;

@Entity
@Table(name = "tbprojeto")
public class BaseConta {
	@Id
	@Column(name = "numero")
	private int numero;
	@Column(name = "agencia")
	private int agencia;
	@Column(name = "tipo")
	private int tipo;
	@Column(name = "saldo")
	private double saldo;
	@Column(name = "titular", length = 50)
	private String titular;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double d) {
		this.saldo = d;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

}