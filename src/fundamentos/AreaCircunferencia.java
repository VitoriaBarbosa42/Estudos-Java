package fundamentos;

public class AreaCircunferencia {
	
	public static void main(String[] args) {
		double raio = 3.4;
/* Para declarar uma constante, se coloca final no inicio da variavel, dessa forma, a
 * variavel não poderar alterar o valor */
		final Double PI = 3.14159;
		Double area = PI * raio * raio;
		
		System.out.println(area);

		raio = 10;
		area = PI * raio * raio;
		System.out.println(area);
	}

}
