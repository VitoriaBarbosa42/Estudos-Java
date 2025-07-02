package EstruturaDeControle;

import java.util.Scanner;

public class DesafioMediaNota {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double notaAcumulada = 0;
		int quantidadeNota = 0;
		boolean condicao = true;
		
		while (condicao) {
			
			System.out.print("Digite a nota: ");
			String notaStr = entrada.nextLine().replace(',', '.');
			double nota = Double.parseDouble(notaStr);
			
			if (nota <= 10 && nota >= 0) {
				quantidadeNota++;
				notaAcumulada += nota;
				System.out.println(notaAcumulada + " Nota numero " + quantidadeNota);
				
			} else if (nota == -1) {
				System.out.println("Calculando a média das notas...");
				condicao = false;
				
			} else {
				System.out.println("Nota invalida");
			}
		}
		
		double resultado = notaAcumulada / quantidadeNota;
		
		System.out.printf("Média total de notas: %.2f", resultado);
		
		entrada.close();
	}

}
