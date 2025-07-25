package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo {
	
	public Ferrari(int velocidade){
		super(velocidade);
	}
	
	public boolean acelerar() {
		boolean acelerar1 = super.acelerar();
		boolean acelerar2 = super.acelerar();
		boolean acelerar3 = super.acelerar();
		return acelerar1 || acelerar2 || acelerar3;
	}

	@Override
	public void ligarTurbo() {
		delta = 35;
	}

	@Override
	public void desligarTurbo() {
		delta = 15;	
	}
	
}
