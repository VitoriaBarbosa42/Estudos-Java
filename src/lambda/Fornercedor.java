package lambda;


import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornercedor {
	
	public static void main(String[] args) {
		
		//Não recebe nenhum paramentro
		Supplier<List<String >> umaLista = () -> Arrays.asList("Ana", "Bia", "Lia", "Gui");
										//Colocar o parentes pois não tem parametro
		System.out.println(umaLista.get());
	}

}
