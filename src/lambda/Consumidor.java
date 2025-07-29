package lambda;

import java.util.function.Consumer;

public class Consumidor {
	
	public static void main(String[] args) {
		
		Consumer<Produto> imprimir = p -> System.out.println(p.nome);

		Produto p1 = new Produto("Caneta", 12.34, 0.09);
		
		imprimir.accept(p1);;
	}

}
