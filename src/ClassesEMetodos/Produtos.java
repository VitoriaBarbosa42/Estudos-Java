package classesEMetodos;

public class Produtos {

	String nome;
	double preco;
	static double desconto = 0.25;
	
	// Método construtos padrão do java sem uso de parametros
	Produtos() {
		
	}
	
	// Criando um método construtos com parametros
	Produtos(String nomeInicial, double precoInicial) {
		nome = nomeInicial;
		preco = precoInicial;
	}
	
	double precoComDesconto() {
		return preco * (1 - desconto);	
	}
		
	double precoComDesconto(double descontoDoGerente) {
			return preco * (1 - desconto + descontoDoGerente);
	}	
}
