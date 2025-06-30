package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Digite o primero numero: ");
		String arg1 = entrada.next().replace(",", ".");
		Double num1 = Double.parseDouble(arg1);
		
		System.out.print("Digite o segundo numero: ");
		String arg2 = entrada.next().replace(",", ".");
		Double num2 = Double.parseDouble(arg2);
		
		System.out.print("Digite o operador da conta: ");
		String operador = entrada.next();
		
		boolean soma = "+".equals(operador);
		double resultadoSoma = num1 + num2;
		boolean sub = "-".equals(operador);
		double resultadoSub = num1 - num2;
		boolean mult = "*".equals(operador);
		double resultadoMult = num1 * num2;
		boolean div = "/".equals(operador);
		double resultadoDiv = num1 / num2;
		
		System.out.println(soma ? resultadoSoma : "...");
		System.out.println(sub ? resultadoSub : "...");
		System.out.println(mult ? resultadoMult : "...");
		System.out.println(div ? resultadoDiv : "...");
		
		entrada.close();
	}

}
