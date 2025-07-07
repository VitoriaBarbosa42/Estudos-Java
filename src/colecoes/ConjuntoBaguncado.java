package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		// Não suporta tipos primitivos
		
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2);
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add('x');
		
		// Retorna o tamanho do Set
		System.out.println("Tamanho é " + conjunto.size());
		
		// Não suporta repetição
		conjunto.add("Teste");
		conjunto.add('x');
		System.out.println(conjunto.remove("teste")); // retorna True ou False se o item for removido
		System.out.println(conjunto.remove("Teste"));
		System.out.println(conjunto.remove('x'));
		
		System.out.println("Tamanho é " + conjunto.size());
		
		// Verifica se o elemento esta contido ou não dentro do conjunto
		System.out.println(conjunto.contains('x'));
		System.out.println(1);
		System.out.println(true);
		
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		// Faz a união dos dois conjuntos, alterando "conjunto"
		conjunto.addAll(nums);
		System.out.println(conjunto);
		System.out.println(nums);
		
		// Retorna somente a intercessão entre os dois conjuntos, alterando em "conjuntos"
		conjunto.retainAll(nums);
		System.out.println(conjunto);
		
		// Limpa o conjunto
		conjunto.clear();
		System.out.println(conjunto);
		
}

}
