package br.com.alura.loja.pedido;

import java.time.LocalDateTime;

import br.com.alura.loja.orcamento.Orcamento;

public class Pedido {

	private String cliente;
	private LocalDateTime data;
	private Orcamento orcamento;

	public Pedido(String cliente, LocalDateTime data, Orcamento orcamento) {
		this.cliente = cliente;
		this.data = data;
		this.orcamento = orcamento;
	}

	public String getCliente() {
		return cliente;
	}

	public LocalDateTime getData() {
		return data;
	}

	public Orcamento getOrcamento() {
		return orcamento;
	}

}
