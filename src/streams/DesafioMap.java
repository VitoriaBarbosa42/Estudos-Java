package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class DesafioMap {
	
	public static void main(String[] args) {
		
	Consumer<Object> println = System.out:: println;
	
	
	List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
	
//	UnaryOperator<Integer> convercaoParaBinario = n -> Integer.toBinaryString(n);
	
	Function<String, String> inverteString = 
			n -> new StringBuilder(n).reverse().toString();
	Function<String, Integer> convercaoParaInteiro =  n -> Integer.parseInt(n, 2);
	
	System.out.println("Convertendo os numeros Inteiros para Binario");		
	nums.stream()
	.map(Integer::toBinaryString)
	.forEach(println);		
	
	System.out.println("Invertendo os números");		
	nums.stream().map(Integer::toBinaryString)
	.map(inverteString)
	.forEach(println);	
	
	System.out.println("Convertendo os numeros binarios para inteiro");		
	nums.stream()
	.map(Integer::toBinaryString)
	.map(inverteString)
	.map(convercaoParaInteiro)
	.forEach(println);		
	
	
	
	
}
}

/*
 * 1. Número para string binária... 6 => "110"
 * 2. Inverter a string... "110" => "011"
 * 3. Converter de volta para inteiro => "011" => 3
 */
//	Integer n = 25;
//	String binario = Integer.toBinaryString(n);
//	System.out.println(binario);