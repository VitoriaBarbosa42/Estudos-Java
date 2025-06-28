package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Olá pessoal".charAt(2));
		
		String s = "Boa tarde";
		s = s.toUpperCase();
		s = "Boa dia";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		// Começa com | Retorna true ou false
		System.out.println(s.startsWith("Boa"));
		// Converte tudo para misnusculo| Começa com | Retorna true ou false
		System.out.println(s.toLowerCase().startsWith("boa"));
		// Converte tudo para maiusculo | Termina com | Retorna true ou false
		System.out.println(s.toUpperCase().endsWith("DIA"));
		// retorna a quantidades de caracter na variavel
		System.out.println(s.length());
		// Compara e retorna true ou falce
		System.out.println(s.equals("boa dia"));
		// Compara, ignorando maiuculo e minusculo e retorna 
		System.out.println(s.equalsIgnoreCase("boa dia"));
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.987;
				
		System.out.printf("o senhor %s %s tem %d anos e ganha R$%.2f.", 
				nome, sobrenome, idade, salario);
		
		String frase = String.format("o senhor %s %s tem %d anos e ganha R$%.2f.", 
				nome, sobrenome, idade, salario);
		
		System.out.println("\n" + frase);
		
		// Contem a palavra 'qual' na frase | retorna True ou False
		System.out.println("Frase qualquer".contains("qual"));
		// retorna a partir de qual indice começa a palavra qual
		System.out.println("Frase qualquer".indexOf("qual"));
		// retorna a frase a partir do indice 6
		System.out.println("Frase qualquer".substring(6));
		// retorna a frase a partir do indice 6 ate o 9
		System.out.println("Frase qualquer".substring(6, 10));
	}
}

// Tipo String é imultavel
// Você consegue substituir o valor, mas não consegue altera-lo