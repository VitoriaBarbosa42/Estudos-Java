package fundamentos;

public class DesafioOperadoresLogicos {
	public static void main(String[] args) {
		boolean trabalho1 = true;
		boolean trabalho2 = false;
		boolean sorvete = trabalho1 || trabalho2;
		
		System.out.println("Comprou a TV de 50 polegadas: " + (trabalho1 && trabalho2));
		System.out.println("Comprou a TV de 32 podegadas:" + (trabalho1 ^ trabalho2));
		System.out.println("Tomou sorvete: " + sorvete);
		System.out.println("Esta mais saudável, mas ficou em casa: " + !sorvete);
		
	}

}

// Se os dois trabalhos derem certos, compra de uma tv de 50 podegasdas no fim de semana e tomar sorvete
// Se apenas um trabalho der certo, tv de 32 polegadas e tomar sorvete
// Se nenhum trabalho der certo, a familia vai ficar em casa, porem mais saudáveis pois não vão ingerir doces