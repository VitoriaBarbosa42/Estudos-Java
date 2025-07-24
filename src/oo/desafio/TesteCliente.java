package oo.desafio;

public class TesteCliente {
	
	public static void main(String[] args) {
		
		Produto boneca = new Produto("Boneca", 85.99);
		Produto carrinho = new Produto("Carrinho", 50.85);
		Produto bola = new Produto("Bola", 35.99);
		Produto lapis = new Produto("Lapis de Cor", 43.99);
		
		Produto celular = new Produto("Smartphone Samsung Galaxy S24", 4500.00);
		Produto notbook = new Produto("Notebook Dell XPS 15", 9000.00);
		Produto fone = new Produto("Fone de ouvido sem fio Sony WH-1000XM5 ", 2000.00);
		
		Produto livro = new Produto("O Senhor dos Anéis ", 79.90);
		Produto caderno = new Produto("Caderno Inteligente ", 129.90);
		Produto caneta = new Produto("Caneta Montblanc Meisterstück", 2500.00);
		
		Item brinquedos1 = new Item (boneca);
		Item brinquedos2 = new Item(carrinho);
		Item brinquedos3 = new Item(bola);
		Item brinquedos4 = new Item(lapis);
		
		Item eletronicos1= new Item(celular);
		Item eletronicos2 = new Item(notbook);
		Item eletronicos3 = new Item(fone);
		
		Item papelaria1 = new Item(livro);
		Item papelaria2 = new Item(caderno);
		Item papelaria3 = new Item(caneta);

		Compra brinquedoteca = new Compra();

		brinquedoteca.adicionarItem(brinquedos1);
		brinquedoteca.adicionarItem(brinquedos2);
		brinquedoteca.adicionarItem(brinquedos3);
		brinquedoteca.adicionarItem(brinquedos4);
		
		Compra eletronicos = new Compra();
		
		eletronicos.adicionarItem(eletronicos1);
		eletronicos.adicionarItem(eletronicos2);
		eletronicos.adicionarItem(eletronicos3);
		
		Compra livrosEPapelaria = new Compra();
		
		livrosEPapelaria.adicionarItem(papelaria1);
		livrosEPapelaria.adicionarItem(papelaria2);
		livrosEPapelaria.adicionarItem(papelaria3);
		
		Cliente cliente1 = new Cliente("Tereza");
		Cliente cliente2 = new Cliente("Carla");
		Cliente cliente3 = new Cliente("Antônia");
		
		cliente1.adicionarCompra(livrosEPapelaria);
		cliente1.adicionarCompra(brinquedoteca);

		cliente2.adicionarCompra(livrosEPapelaria);
		cliente2.adicionarCompra(eletronicos);
		
		System.out.println("Cliente: " + cliente1.nome + " Gastou: " + cliente1.totalGastoPeloCliente() + "R$");
		System.out.println("Cliente: " + cliente2.nome + " Gastou: " + cliente2.totalGastoPeloCliente() + "R$");
		System.out.println("Cliente: " + cliente3.nome + " Gastou: " + cliente3.totalGastoPeloCliente() + "R$");
	}
	

}
