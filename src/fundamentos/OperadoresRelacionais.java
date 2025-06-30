package fundamentos;

public class OperadoresRelacionais {
	public static void main(String[] args) {
		
		int a = 97;
		int b = 'a';
		
		// Compacação
		System.out.println(a == b);
		//Diferença
		System.out.println(30 != 7);
		// maior que
		System.out.println(3 > 4);
		// maior ou igual
		System.out.println(3 >= 3);
		// menor que
		System.out.println(3 < 7);
		// menor ou igual
		System.out.println(30 <= 3);
		
		double nota = 9.9;
		boolean bomComportamento = false;
		boolean passouPorMedia = nota >=7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		
		System.out.println("Tem desconto? " + temDesconto);
		
		
	}

}
