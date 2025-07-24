package oo.desafio;

public class Item {
	
	Produto produto;
	Integer quantidade;
	
	Item(Produto produto) {
		this.produto = produto;
		this.quantidade = 1;
	}
	
	Item(Produto produto, Integer quantidade) {
		this.produto = produto;
		this.quantidade = quantidade;
	}
	
	Double totalPorItem() {
		Double subtotal = produto.preco * quantidade;
		return subtotal;
	}

}
