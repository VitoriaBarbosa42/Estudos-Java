package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	
	public static void main(String[] args) {
		
		Map< Integer, String> usuarios = new HashMap <> ();
		
		// Put adiciona ou altera um elemento no map
		usuarios.put(1, "Roberto");
		usuarios.put(2, "Ricardo");
		usuarios.put(3, "Rafaela");
		usuarios.put(4, "Rebeca");
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		
		System.out.println(usuarios.keySet()); // Retorna o conjunto de chaves do map - Que por ser um set, não é ordenado
		System.out.println(usuarios.values()); // Retorna somente os valores do map
		System.out.println(usuarios.entrySet()); // Retorna Chave e valor do map
		
		System.out.println(usuarios.containsKey(20)); // Verifica se o valor esta contido em alguma das chaves do map
		System.out.println(usuarios.containsValue("Rebeca")); // Verifica se o valor esta contido em  um dos valores do map
		
		System.out.println(usuarios.get(2)); // Retorna o valor a partir da chave
		
		for (int chave: usuarios.keySet()) {
			System.out.println(chave);
		}
		
		for (String valor: usuarios.values()) {
			System.out.println(valor);
		}
		
		for (Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.print(registro.getKey());
			System.out.println(": " + registro.getValue());
		}
		
		System.out.println(usuarios.remove(1));
		System.out.println(usuarios.remove(4, "Gui"));
		
		for (Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.print(registro.getKey());
			System.out.println(": " + registro.getValue());
		}
 	}

}
