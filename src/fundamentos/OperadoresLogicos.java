package fundamentos;

public class OperadoresLogicos {
	public static void main(String[] args) {
		
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		
		// and
		System.out.println(condicao1 && condicao2);
		// or
		System.out.println(condicao1 || condicao2);
		//xor
		System.out.println(condicao1 ^ condicao2);
		// Negação
		System.out.println(!condicao1);
		// negação da negação
		System.out.println(!!condicao1);

}
}
