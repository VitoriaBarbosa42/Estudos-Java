package arrayECollection;

import java.util.Scanner;

public class ResoluçãoDesafio {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de notas: ");
		
		int quantidadeNota = entrada.nextInt();
		
		double[] notasAluno = new double[quantidadeNota];
		
		
		
		for (int i = 0; i < quantidadeNota; i++) {
			
			System.out.print("Digite a " + (i + 1) + "° nota");
			notasAluno[i] = entrada.nextDouble();
		}
		
		double totalNotas = 0;
		
		for (double nota : notasAluno) {
			totalNotas += nota;
		}
		
		double media = totalNotas / quantidadeNota;
		
		System.out.printf("Média de notas: %.2f", media);
		
		entrada.close();
		
	}

}
