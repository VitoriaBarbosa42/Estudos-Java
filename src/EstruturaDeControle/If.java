package estruturaDeControle;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informa a média: ");
		double media = entrada.nextDouble();
		
		if (media <= 10 && media >= 7) {
			System.out.println("Aprovado!");
			System.out.println("Parabéns!");
		}
		
		if (media < 7 && media >= 4.5)
			System.out.println("Recuperação");
		
		boolean criterioReprovacaoAtingindo = media < 4.5 && media >= 0;
		
		if (criterioReprovacaoAtingindo) {
			System.out.println("Reprovado");
		}
		
		entrada.close();
	}

}

// Em java, usa-se blocos de codigos com chaves para associar o codigo a um if
// Estrutura de controle não terminam com ";" | Mas tem uma exceção