package com.javabank.power.dto;

public class OperacaoSaldoDto {
	private double saldo;

	public OperacaoSaldoDto() {
	}

	public OperacaoSaldoDto(double saldo) {
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
