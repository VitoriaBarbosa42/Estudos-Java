package oo.heranca.desafio;

public class PistaDeCorrida {
	public static void main(String[] args) {
		
		Carro ferrari = new Ferrari(200);
		Carro corola = new Corola(100);
		Carro civic = new Civic(150);
		
		System.out.println(ferrari.velocidadeAtual);
		System.out.println(corola.velocidadeAtual);
		System.out.println(civic.velocidadeAtual);
		
		ferrari.frear();
		ferrari.acelerar();
		corola.acelerar();
		civic.acelerar();
		System.out.println(ferrari.velocidadeAtual);
		System.out.println(corola.velocidadeAtual);
		System.out.println(civic.velocidadeAtual);
		ferrari.frear();
		ferrari.velocidadeAtual = 200;
		ferrari.acelerar();
		System.out.println(ferrari.velocidadeAtual);
		System.out.println(corola.velocidadeAtual);
		System.out.println(civic.velocidadeAtual);
		
		
		System.out.println(ferrari.velocidadeAtual);
		System.out.println(corola.velocidadeAtual);
		System.out.println(civic.velocidadeAtual);
	}
	
}
