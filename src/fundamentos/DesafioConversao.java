package fundamentos;

import javax.swing.JOptionPane;

public class DesafioConversao {
	public static void main(String[] args) {
		
		System.out.println("Calculando a média dos seus ultimos três");
		System.out.println("-----------------------------------------" );

		String salario1 = JOptionPane.showInputDialog("Informe o primeiro salaria");
		salario1 = salario1.replace(",", ".");
		Double numero1 = Double.parseDouble(salario1);	
		String salario2 = JOptionPane.showInputDialog("Informe o segundo salaria");
		salario2 = salario2.replace(",", ".");
		Double numero2 = Double.parseDouble(salario2);
		String salario3 = JOptionPane.showInputDialog("Informe o terceiro salaria");
		salario3 = salario3.replace(",", ".");
		Double numero3 = Double.parseDouble(salario3);	
				
		double soma = numero1 + numero2 + numero3;
		double media = soma / 3;
		
		System.out.printf("Sua média salarial dos ultimos 3 salarios é: R$%.2f", media);
	}

}

/*
 * Solicite ao usuario os ultimos tres salarios e mostre a media salarial
 * O usuario deve ter a liberdade de separar a parte decimal com virgula ou com ponto
*/