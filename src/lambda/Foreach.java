package lambda;

import java.util.Arrays;
import java.util.List;

public class Foreach {
	
	public static void main(String[] args) {
		
		List <String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");
		
		System.out.println("Forma tradicional...");
		for(String nome: aprovados) {
			System.out.println(nome);
		}
		
		System.out.println("\nLambda #01...");
		
		aprovados.forEach(nome -> System.out.println(nome + "!!!"));
//		aprovados.forEach((nome) -> {System.out.println(nome + "!!!");});
		// Se tem somente um paramentro, não ha necessidade de ter os parentes
		// Se tem somente uma sentença de codigo, pode tirar o par de chaves
		
		System.out.println("\nMethod Reference #01...");
		aprovados.forEach(System.out::println);
		// Menos flexivel
		
		System.out.println("\nLambda #02...");
		aprovados.forEach(nome -> meuImprimir(nome));
		
		System.out.println("\nMethod Reference #02...");
		aprovados.forEach(Foreach::meuImprimir);
	}
	
	static void meuImprimir(String nome) {
		System.out.println("Oi! Meu nome é " + nome);
	}
}
