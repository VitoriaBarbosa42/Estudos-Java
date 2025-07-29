package classesEMetodos;

public class ValorvsReferencia {
	
	public static void main(String[] args) {
		
		// Atribuição por valor -> tipos primitivos
		// Atribuição por referencia -> objetos
		
		// Quando o valor b recebe o valor a, ele esta recebendo uma copia do valor
		//atribuido a a, sendo assim, a manipulação do valor b, não altera o valor de a
		double a = 2;
		double b = a; // atribuição por valor (Tipo primitivo)

		a++;
		b--;
		
		System.out.println(a + " " + b);
		
		ClasseData a1 = new ClasseData(1, 6, 2022);
		ClasseData a2 = a1; //atribuição por refêrencia (Objeto)
		
		/*Quando uma variavel é atribuida a um objeto, o valor dela é um endereço de 
		 * memoria que aponta para um espaço de memoria no qual o objeto está guardado
		 *Desse modo, quando a2 = a1, a2 passa a ter o mesmo endereço e apontar para o
		 *mesmo local da memoria, sendo assim, a2 consegue fazer alterações no objeto
		 *a1
		 */
		
		a1.dia = 31;
		a2.mes = 12;
	
		a1.ano = 2025;
		
		System.out.println(a1.dataFormatada());
		System.out.println(a2.dataFormatada());
		
		voltarDataParaValorPadrao(a1);
		
		System.out.println(a1.dataFormatada());
		System.out.println(a2.dataFormatada());
		
		int c = 5;
		alterarPrimitivo(c);
		System.out.println(c);	
		
	}

	static void voltarDataParaValorPadrao(ClasseData a) {
		a.dia = 1;
		a.mes = 1;
		a.ano = 1970;
	}
	static void alterarPrimitivo(int a) {
		a++;
	}
	
}
