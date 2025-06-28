package fundamentos;

public class Wrappers {
	public static void main(String[] args) {
		
		// byte
		Byte b = 100;
		Short s = 1000;
		// Integer.parseInt(entrada.next());
		Integer i = 10000; // int
		Long l = 100000L;
		
		// passando o valor de dentro de 'b'
		System.out.println(b.byteValue());
		// convertendo para o tipo String
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 3);
		
		Float f = 123.10F;
		System.out.println(f);
		
		Double d = 1234.5678;
		System.out.println(d);
		// convertendo string para boolean
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		// Convertendo boolean para string
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#'; // char
		System.out.println(c + "...");
	}
}

// Wrappers são a versão objeto dos tipos primitivos
// Wrappers envolve os tipos primitivos em um objeto, fazendo com que passem a ter metodos