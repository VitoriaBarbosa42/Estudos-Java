package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// Informações do funcionario
		
		// Tipos númericos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L;
		// Quando o numero do tipo long ultrapassar a capacidade do int, para o Java ententer
		// que é um long, é necessario colocar um L no final para haver o entendimento.
		// o mesmo se aplica para numeros float
		
		// Tipos numéricos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
				
		// Tipo booleano
		boolean estaDeFerias = false; //true
		
		// Tipo caractere
		char status = 'A';
		System.out.println(anosDeEmpresa * 365);
		
		// Dias de empresa
		System.out.println(numeroDeVoos / 2);
		
		// Pontos po real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("Férias: " + estaDeFerias);
		System.out.println("Status: " + status);
		
	}
}
