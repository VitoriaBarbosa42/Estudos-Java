package ClassesEMetodos;

public class AreaCircTeste {
	
	public static void main(String[] args) {
		
		AreaCirc a1 = new AreaCirc(10);
		a1.raio = 10;
		// a1.pi = 10000;
		
		// AreaCirc.PI = 3.1415;
		
		// Static não restinge que o valor da variavel da classe seja alterada
		// Para isso, deve-se torna-la uma constante
		
		// acessando o valor da contante e o metodo da classe sem instância-la
		System.out.println(AreaCirc.area(100));
		System.out.println(AreaCirc.PI);
		System.out.println(Math.PI);
	}

}
