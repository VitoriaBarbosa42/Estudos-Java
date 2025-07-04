package DesafioPessoa;

public class Jantar {
	
	public static void main(String[] args) {
		
		Pessoa jaci = new Pessoa ("Jaci", 58.50);	
		Pessoa jeff = new Pessoa ("Jeff", 70.50);	
		
		Comida feijao = new Comida ("Feijão", 0.3);
		Comida arroz = new Comida ("Arroz", 1.5);
		
		jeff.comer(feijao);
		jeff.comer(arroz);
		
		System.out.println(jeff.apresentar());
		System.out.println(jaci.apresentar());
		
		jaci.comer(arroz);
		
		System.out.println(jaci.apresentar());
	}

}
