package ArrayECollection;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de alunos: ");
		int numeroAlunos = entrada.nextInt();
		
		System.out.print("Digite a quantidade de notas para cada aluno: ");
		int numeroNotas = entrada.nextInt();
		
		double[][] notasTurma = new double[numeroAlunos][numeroNotas];
		
		double totalNota = 0;
		
		for (int i = 0; i < numeroAlunos ; i++) {
			for (int j = 0; j < numeroNotas ; j++) {
				System.out.print("Digite a nota " + (j + 1) + "° do " + (i + 1) + "° aluno(a): ");
				notasTurma[i][j] = entrada.nextDouble();
				totalNota += notasTurma[i][j];
			}
		}
		
		double media = totalNota / (numeroAlunos * numeroNotas);
		
		System.out.println(Arrays.deepToString(notasTurma));
		System.out.printf("Média da turma é de %.2f", media);
		

		
		entrada.close();
	}

}
