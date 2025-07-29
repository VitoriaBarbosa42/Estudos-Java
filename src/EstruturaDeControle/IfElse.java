package estruturaDeControle;

import javax.swing.JOptionPane;

public class IfElse {
	public static void main(String[] args) {
		
		String valor = JOptionPane.showInputDialog("informa o numero:");
		
		int numero = Integer.parseInt(valor);

		if (numero % 2 == 0)
			System.out.printf("%nO numero %d é par", numero);
		else
			System.out.printf("%nO numero %d é impar", numero);
					
		}
	}

