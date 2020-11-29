package br.com.alura.loja.imposto;

import java.math.BigDecimal;

import br.com.alura.loja.Orcamento;

public class CalculadoraDeImpostos {

	public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {
		return imposto.calcular(orcamento);
	}

}
