package EstruturaDeControle;

import java.util.Scanner;

public class WhileIndeterminado {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String valor = "";
		int repeticao = 0;
		
		while(!valor.equalsIgnoreCase("sair")) {		
			repeticao++;
			System.out.print("Você diz: ");
			valor = entrada.nextLine();
			System.out.println(repeticao);
		}
		
		entrada.close();
	}

}
