package oo.polimorfismo;

public class Pessoa extends Peso{
	
	public Pessoa(double peso) {
		super(peso);
	}
	public void comer(Peso alimento) {
		this.peso += alimento.getPeso();
	}
}
