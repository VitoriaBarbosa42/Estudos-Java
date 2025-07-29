package classesEMetodos;

public class ProdutoTeste2 {
	public static void main(String[] args) {
		
		Produtos p1 = new Produtos("Notebook", 4356.89);
		
		var p2 = new Produtos();
		p2.nome = "Caneta Preta";
		p2.preco = 12.56;
		
		Produtos.desconto = 0.50;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto();
		double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
		
		System.out.printf("Media do carrinho = R%.2f.%n", mediaCarrinho);
		
		System.out.printf("R$%.2f %n", p1.precoComDesconto());
		System.out.printf("R$%.2f", p2.precoComDesconto());
	}

}
