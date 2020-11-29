package br.com.alura.loja.imposto;

import java.math.BigDecimal;

import br.com.alura.loja.Orcamento;

public interface Imposto {

	BigDecimal calcular(Orcamento orcamento);

}
