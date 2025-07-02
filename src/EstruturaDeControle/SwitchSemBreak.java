package EstruturaDeControle;

public class SwitchSemBreak {
	public static void main(String[] args) {
		
		String faixa = "marrom";
		
		switch (faixa.toLowerCase()) {
		
		case "preto":
			System.out.println("Sei o Bassai-Dai...");
		case "marrom":
			System.out.println("Sei o Tekki Shodan...");
		case "laranja":
			System.out.println("Sei o Heian Godan...");
		case "vermelha":
			System.out.println("Sei o Heian Yodan...");
		case "amarelo":
			System.out.println("Sei o Heian Shodan...");
			break;
		default:
			System.out.println("Não sei nada");
		}
		
		System.out.println("Fim");
		
		int idade = 3;
		
		switch (idade) {
		
		case 3:
			System.out.println("Sabe falar");
		case 2:
			System.out.println("Sabe andar");
		case 1:
			System.out.println("Sabe respirar");
		}
		
		
		
	}

}
