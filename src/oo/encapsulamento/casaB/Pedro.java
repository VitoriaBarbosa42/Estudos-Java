package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana{
	
	Ana mae = new Ana();
	
	void testeAcessos() {	
//		System.out.println(segredo);
//		System.out.println(facoDentroDeCasa);
		System.out.println(formaDeFalar);
		System.out.println(todosSabem);
	}
}

// Quando é herdado, não instanciar a classe para acessar o metodo
// O metodo publico pode ser acessado tanto instanciando a classe, quanto de forma herdada