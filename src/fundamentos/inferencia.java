package fundamentos;

public class inferencia {
	public static void main(String[] args) {
		double a = 4.5; // declaração e inicialização
		System.out.println(a);
		
		a = 12;
		System.out.println(a);
		
		// a = '...'
		// A variavel, quando declarada não pode mudar seu tipo
		
		var b = 4.5;
		System.out.println(b);
		
		// var entende qual o tipo da variavel a partir do valor atribuido a ela
		// var tem que ser declarada e inicializada na mesma linha
		
		var c = "Texto";
		System.out.println(c);
		
		c = "Outro Texto";
		System.out.println(c);
		
		// c = 4.5;
		
		double d; // variável foi declarada
		d = 123.65; // variável foi inicializada
		System.out.println(d);
		
		// Java é uma linguaquem que os tipos são fortes
	}
}
