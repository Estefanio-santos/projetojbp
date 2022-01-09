package com.javabank.power.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
 

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.javabank.power.dao.BaseContaDao;

import com.javabank.power.dto.OperacaoSaldoDto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javabank.power.dao.BaseContaDao;
import com.javabank.power.dto.OperacaoSaldoDto;

import com.javabank.power.model.BaseConta;

@RestController
public class BaseContaController {
	@Autowired
	private BaseContaDao dao;

	@GetMapping("/contas")
	public List<BaseConta> listarContas() {
		return (List<BaseConta>) dao.findAll();





	}

	@GetMapping("/contas/{numero}")
	public BaseConta listarPeloNumero(@PathVariable int numero) {
		return dao.findById(numero).orElse(null);
	}

	@GetMapping("/contas/saldo/{numero}")
	public OperacaoSaldoDto consultarSaldo(@PathVariable int numero) {
		OperacaoSaldoDto consultaOperacao = new OperacaoSaldoDto();
		BaseConta conta = listarPeloNumero(numero);
		consultaOperacao.setSaldo(conta.getSaldo());
		return consultaOperacao;
	}

	@PostMapping("/contas")
	public void cadastrarConta(@RequestBody BaseConta cadastrar) {
		dao.save(cadastrar);
	}

	@PostMapping("/contas/deposito/{numero}")
	public void depositarValor(@RequestBody OperacaoSaldoDto depositarValor, @PathVariable int numero) {
		BaseConta conta = listarPeloNumero(numero);
		conta.setSaldo(conta.getSaldo() + depositarValor.getSaldo());
		dao.save(conta);
	}

	@PostMapping("/contas/saque/{numero}")
	public void sacarValor(@RequestBody OperacaoSaldoDto sacarValor, @PathVariable int numero) {
		BaseConta conta = listarPeloNumero(numero);
		if (conta.getSaldo() >= sacarValor.getSaldo()) {
			conta.setSaldo(conta.getSaldo() - sacarValor.getSaldo());
			dao.save(conta);
		}
	}

}
