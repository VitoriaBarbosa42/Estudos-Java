package excecao;

import java.util.Scanner;

public class Funally {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		try {
			System.out.println( 7 / entrada.nextInt());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Finally sempre sera chamado");
		}
		
		try {
			System.out.println( 7 / entrada.nextInt());
		}  finally {
			System.out.println("Mesmo se o erro não for tratado");
			entrada.close();
		}
		
		System.out.println("Fim");
		
		
	}

}
