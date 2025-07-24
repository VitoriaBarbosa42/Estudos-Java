package oo.heranca.desafio;

public class Carro {
	
	int velocidade = 0;
	
	boolean acelerar() {
		if (this.velocidade < 200) {
			this.velocidade += 5;
			return true;
		} else {
			return false;
		}	
	}
	
	boolean frear() {
		if(this.velocidade > 0) {
			this.velocidade -= 5;
			return true;
		} else {
			return false;
		}
	}

}
