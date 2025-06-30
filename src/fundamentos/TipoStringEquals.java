package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
	public static void main(String[] args) {
		System.out.println("2" == "2");
		
		String s1 = new String("2");
		System.out.println("2" == s1);
		// compara com o valor da variavel
		System.out.println("2".equals(s1));
		
		Scanner entrada = new Scanner (System.in);
		
		String s2 = entrada.next();
		System.out.println("2" == s2);
		// Função trim tirar os espaço, mas o next tambem tira. Somente o nextline que não tira
		System.out.println("2".equals(s2.trim()));

		
		entrada.close();
		
	}

}
