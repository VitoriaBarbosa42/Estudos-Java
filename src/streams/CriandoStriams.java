package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStriams {
	
	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print;
//		Consumer<Integer> println = System.out::println;
		
		Stream<String> langs = Stream.of("Java", "Lua", "JS\n");
		langs.forEach(print);
		
		String[] maisLangs = {"Prython ", "Lisp ", "Perl ", "Go\n"};
		
		Stream.of(maisLangs).forEach(print);
		Arrays.stream(maisLangs).forEach(print);
		//Ele imprime do indice 1 ao 3, pois o 4 não entra no for
		Arrays.stream(maisLangs, 1, 4).forEach(print);
		
		List<String> outrasLangs = Arrays.asList("C ", "PHP ", "Kotlin\n");
		outrasLangs.stream().forEach(print);
		System.out.println();
		outrasLangs.parallelStream().forEach(print);
		
		//Gera de forma indefinida os valores definidos
//		Stream.generate(() -> "a").forEach(print);
//		Stream.iterate(0, n -> n + 1).forEach(println);
	}

}
