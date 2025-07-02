package EstruturaDeControle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		boolean condicao = true;
		while (condicao) {
			System.out.print("Digite algo: ");
			String palavra = entrada.nextLine();
			
			if ("sair".equalsIgnoreCase(palavra)) {
				condicao = false;
			} else {
				System.out.printf("Palavra digitada : %s%n", palavra);
			}
		}
		System.out.println("Saindo :)");
		entrada.close();
	}

}

