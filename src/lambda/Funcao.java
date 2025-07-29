package lambda;

import java.util.function.Function;

public class Funcao {
	
	public static void main(String[] args) {
		
		Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "Par" : "Ímpar";
		
		System.out.println(parOuImpar.apply(32));
		
		Function<String, String> oResultadoE = valor -> "O resultado é: " + valor; 
		
		Function<String, String> empolgado = valor -> valor + "!!!";
		
		String resultadoFinal = parOuImpar.andThen(oResultadoE)
				.andThen(empolgado).apply(32); // Concatenando funções
		// A saida da função anterios tem que ser do mesmo tipo de entrada da proxima função para
		//que seja possivel realizar a composição das funções
		System.out.println(resultadoFinal);
 	}

}
