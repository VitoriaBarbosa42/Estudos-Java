package oo.heranca.teste;

import oo.heranca.Direcao;
import oo.heranca.Heroi;
import oo.heranca.Jogador;
import oo.heranca.Monstro;

public class Jogar {
	
	public static void main(String[] args) {
		
		Jogador monstro = new Monstro();
		monstro.x = 10;
		monstro.y = 10;

		
		Jogador heroi = new Heroi();
		heroi.x = 10;
		heroi.y = 11;
		
		System.out.println("Vidas monstro => " + monstro.vida);
		System.out.println("Vidas monstro => " + heroi.vida);
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		System.out.println("Vidas monstro => " + monstro.vida);
		System.out.println("Vidas monstro => " + heroi.vida);
		
		monstro.andar(Direcao.NORTE);
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		System.out.println("Vidas monstro => " + monstro.vida);
		System.out.println("Vidas monstro => " + heroi.vida);
	}
}
