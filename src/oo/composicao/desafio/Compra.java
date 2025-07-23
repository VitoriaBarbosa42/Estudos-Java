package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	
	List<Item> compra = new ArrayList<Item>();
	
	void adicionarItem (Item item) {
		compra.add(item);
		System.out.println(item.produto.nome + " adicionado");
	}
	
	double totalCompra() {
		double total = 0;
		if (compra.size() > 0) {
			for(Item item: this.compra) {
				total += item.totalPorItem();
				}		
			}
		return total;
	}
}
