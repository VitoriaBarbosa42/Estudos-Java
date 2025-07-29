package estruturaDeControle;

import java.util.Scanner;

public class DesafioDiaSemana {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Digite o dia da semana: ");
		String dia = entrada.nextLine();
		System.out.println(dia);
		
		if ("domingo".equalsIgnoreCase(dia)) {
			System.out.printf("%s | 1", dia);
		} else if ("segunda".equalsIgnoreCase(dia)) { 
			System.out.printf("%s | 2", dia);
		} else if ("terça".equalsIgnoreCase(dia) || "terca".equalsIgnoreCase(dia)) {
			System.out.printf("%s | 3", dia);
		} else if ("quarta".equalsIgnoreCase(dia)) {
		System.out.printf("%s | 4", dia);
		} else if ("quinta".equalsIgnoreCase(dia)) {
			System.out.printf("%s | 5", dia);
		} else if ("sexta".equalsIgnoreCase(dia)) {
			System.out.printf("%s | 6", dia);
		} else if ("sábado".equalsIgnoreCase(dia) || "sabado".equalsIgnoreCase(dia)) {
			System.out.printf("%s | 7", dia);
		} else {
			System.out.println("Valor inválido");
		}
		
		
		
		entrada.close();
		
	}
}
