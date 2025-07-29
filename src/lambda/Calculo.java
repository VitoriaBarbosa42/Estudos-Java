package lambda;


@FunctionalInterface // Pode ter somente um metodo
public interface Calculo {
	
	double executar(double a, double b);
	
	default String legal() {
		return "legal";
	} // A partir daqui, pode-se acessar o metodo statico
	
	static String muitoLegal() {
		return "Muito legal";
	}

}

//Para utilizar lambda, a interface não pode ter mais de um metodo abstrato, caso contrario da erro.