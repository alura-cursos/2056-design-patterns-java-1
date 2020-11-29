package br.com.alura.loja;

import java.math.BigDecimal;

import br.com.alura.loja.pedido.GeraPedido;
import br.com.alura.loja.pedido.GeraPedidoHandler;

public class TestesPedidos {

	public static void main(String[] args) {
		String cliente = "Ana da Silva";
		BigDecimal valorOrcamento = new BigDecimal("745.99");
		int quantidadeItens = 3;
		
		GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
		GeraPedidoHandler handler = new GeraPedidoHandler();
		handler.executar(gerador);
	}

}
