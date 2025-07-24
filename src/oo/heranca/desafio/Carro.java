package oo.heranca.desafio;

public class Carro {
	
	final int VELOCIDADE_MAXIMA;
	int velocidadeAtual;
	int delta = 5;
	
	Carro(int velocidadeMaxima) {
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	boolean acelerar() {
		if (this.velocidadeAtual + delta > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
			return false;
		} else {
			this.velocidadeAtual += 5;
			return true;
		}	
	}
	
	boolean frear() {
		if(this.velocidadeAtual >= 5) {
			this.velocidadeAtual -= 5;
			return true;
		} else {
			return false;
		}
	}

}
