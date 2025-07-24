package oo.heranca.desafio;

public class PistaDeCorrida {
	public static void main(String[] args) {
		
		Carro ferrari = new Ferrari();
		Carro corola = new Corola();
		Carro civic = new Civic();
		
		System.out.println(ferrari.velocidade);
		System.out.println(corola.velocidade);
		System.out.println(civic.velocidade);
		
		ferrari.frear();
		ferrari.acelerar();
		corola.acelerar();
		civic.acelerar();
		System.out.println(ferrari.velocidade);
		System.out.println(corola.velocidade);
		System.out.println(civic.velocidade);
		ferrari.frear();
		ferrari.velocidade = 200;
		ferrari.acelerar();
		System.out.println(ferrari.velocidade);
		System.out.println(corola.velocidade);
		System.out.println(civic.velocidade);
		
		
		System.out.println(ferrari.velocidade);
		System.out.println(corola.velocidade);
		System.out.println(civic.velocidade);
	}
	
}
