package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


public class DesafioFilter {
	
	public static void main(String[] args) {
		
		ClienteDesafioFilter c1 = new ClienteDesafioFilter("Marcelo", 45.90, 8);
		ClienteDesafioFilter c2 = new ClienteDesafioFilter("Carlos", 80.90, 2);
		ClienteDesafioFilter c3 = new ClienteDesafioFilter("Antonio", 20.80, 5);
		ClienteDesafioFilter c4 = new ClienteDesafioFilter("Melissa", 20.90, 3);
		ClienteDesafioFilter c5 = new ClienteDesafioFilter("Tomas", 40.08, 2);

	
	List<ClienteDesafioFilter> clientes = Arrays.asList(c1, c2, c3, c4, c5);
	
	Predicate<ClienteDesafioFilter> descontoMais40 = c -> c.totalCompra >= 40.00;
	Predicate<ClienteDesafioFilter> clientesComDesconto = c -> c.numeroPedido < 5;
	
	clientes.stream()
	.filter(clientesComDesconto)
	.filter(descontoMais40)
	.map(c ->"Parabéns " + c.nome + "!!! \nVocê acaba de ganhou 10R$ de desconto na sua compra")
	.forEach(System.out::println);
	}	
}

//O desafio pede para que eu mesma crie o meu proprio desafio, tendo que aplicar dois filter em um cenario que eu imaginei. 