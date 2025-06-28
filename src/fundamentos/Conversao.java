package fundamentos;


public class Conversao {
	public static void main(String[] args) {
		
		//double a = 1; //Conversão implícita
		
		double b = (float) 1.12345678888888; //Cast | Conversão explícita
		System.out.println(b);
		
		int c = 240;
		byte d = (byte) c;
		System.out.println(d);
		
		double e = 1.9999999;
		int f = (int) e;
		System.out.println(f);
		
		// Conversão de strings
		
		// De número para String
		
		Integer num1 = 10000;
		System.out.println(num1.toString().length());
		
		int num2 = 100000;
		System.out.println(Integer.toString(num2).length());
		System.out.println(("" + num2).length());
		
	}
}

/*
 * Se uma variavel para a outra houver a possibilidade de perda de informações
 * a converção deve ser feita de forma explicita, caso contrario, de forma implicita
 * Evite fazer cast
 */
