package estruturaDeControle;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String texto = "";
		
		do {
			System.out.println("Voce precisa falar a palavra mágica... ");
			System.out.println("Quer sair? ");
			texto = entrada.nextLine();
			
			
		} while (!texto.equalsIgnoreCase("por favor"));
		
		System.out.println("Obrigada");
		
		entrada.close();
	}

}

// DoWhile executa o codigo pelo menos uma vez