package fundamentos;

public class DesafioAritmetico {
	public static void main(String[] args) {
		
		double parte1 = Math.pow((6 * (3 + 2)), 2) / (3 * 2);
		double parte2 = Math.pow(((1 - 5) * (2 - 7) / 2), 2);
		double parte3 = parte1 - parte2;
		double resultado = Math.pow((parte3 / 10), 3);
		
		
		System.out.println(parte1);
		System.out.println(parte2);
		System.out.println(parte3);
		System.out.println(resultado);
	}
}
