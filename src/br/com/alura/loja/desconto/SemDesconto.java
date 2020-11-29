package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.Orcamento;

public class SemDesconto extends Desconto {
	
	public SemDesconto() {
		super(null);
	}

	public BigDecimal calcular(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}

}
