package arrayECollection;

import java.util.Scanner;

public class DesafioArray {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite quantas notas irá acrescentar: ");
		String quantidadeNotasStr = entrada.next();
		int quantidadeNotas = Integer.parseInt(quantidadeNotasStr);
		
		double[] notaAluno = new double[quantidadeNotas];
		
		for (int i = 0 ; i < notaAluno.length ; i++) {
			System.out.printf("%nDigita a nota %d: ", i);
			String notaStr = entrada.next().replace(",", ".");
			notaAluno[i] = Double.parseDouble(notaStr);
		}
		
		double totalNotas = 0;
		
		for (double nota : notaAluno) {
			totalNotas += nota;
		}
		
		double media = totalNotas / quantidadeNotas;
		
		System.out.printf("Média de nota: %.2f", media);
		
		entrada.close();
	}

}
