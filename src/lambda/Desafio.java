package lambda;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Desafio {
	
	public static void main(String[] args) {
		Produto p = new Produto("ipad", 3235.89, 0.13);
		
		BinaryOperator<Double> precoComDesconto = 
				(precoBruto, porcentagemDeDesconto) -> 
				precoBruto * (1 - porcentagemDeDesconto);
		
		UnaryOperator<Double> valorImpostoMunicipal = preco -> preco > 2500 ? preco += (preco * 0.085) : preco;
		
		UnaryOperator<Double> frete = preco -> preco >= 3000.00 ? preco + 100 : preco + 50;
		
		Double resultado = precoComDesconto.andThen(valorImpostoMunicipal).andThen(frete).apply(p.preco, p.desconto);
		
		System.out.printf("Valor final do produto: %.2f R$", resultado);
	}
}
/*
	 * 1. A partir do produto calcule o preço real (com desconto)
	 * 2. Imposto Municipal: >= 2500 (8,5%) / < 2500 (isento)
	 * 3. Frete: >= 3000 (100) / < 3000 (50)
	 * 4. Arredondar: Deixar duas casas decimais
	 * 5. Formatar: R$1234,56
	 */
//		BiFunction<Double, Double, Double> impostoMunicipal = (valorBruto, porcentagemImposto) -> {
//			boolean condicao = valorBruto < 2500.00;
//			return condicao ? valorBruto * 0.0 : valorBruto * 0.085;
//		};