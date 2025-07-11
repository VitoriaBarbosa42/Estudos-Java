package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	public static void main(String[] args) {
		
		Queue <String> fila = new LinkedList<String>();
		
		// Adiciona na fila e caso não consiga, retorna um erro
		fila.add("Ana");
		// Retorna verdadeiro ou falso de for adicionado na fila ou não
		fila.offer("Bia");
		fila.offer("Carlos");
		fila.offer("Daniel");
		fila.offer("Rafaela");
		fila.offer("Gui");
		
		// Retorna o primeiro elemento da fila sem remove-lo
		/* Peek - Retorna null se a fila estiver vazia
		 * Element - Gera um erro se a fila estiver vazia 
		 */
		System.out.println(fila.peek());
		System.out.println(fila.peek());
		System.out.println(fila.element());
		System.out.println(fila.element());
		
		// fila.size(); - Retorna a quantidade de elementos na fila
		// fila.clear - Limpa a fila
		// fila.isEmpty(); - Verifica se a fila esta vazia
		// fila.conteins(...); Retorna true ou false se tiver o item na fila
		
		// Retorna o primeiro elemento da fila ja removendo
		// se a lista estiver vazia, ele retorna nulo
		System.out.println(fila.poll());
		System.out.println(fila.remove()); // Lença uma exceção se a fila estiver vazia
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
	}

}
