package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	String nome;
	List<Compra> compras = new ArrayList<Compra>();
	
	Cliente (String nome) {
		this.nome = nome;
	}

	void adicionarCompra(Compra compra) {
		compras.add(compra);
		System.out.println("Compra adicionada");
	}
	
	double totalGastoPeloCliente() {
		double total = 0;
		for (Compra compra: this.compras) {
			total += compra.totalCompra();
		}
	return total;
	}
	
	
}
