package oo.heranca.desafio;

public class Carro {
	
	public final int VELOCIDADE_MAXIMA;
	public int velocidadeAtual;
	public int delta = 5;
	
	public Carro(int velocidadeMaxima) {
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	public boolean acelerar() {
		if (this.velocidadeAtual + delta > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
			return false;
		} else {
			this.velocidadeAtual += 5;
			return true;
		}	
	}
	
	public boolean frear() {
		if(this.velocidadeAtual >= 5) {
			this.velocidadeAtual -= 5;
			return true;
		} else {
			return false;
		}
	}

}
