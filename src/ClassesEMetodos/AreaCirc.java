package classesEMetodos;

public class AreaCirc {
	
	double raio;
	// static faz com que a variavel pertença a classe e não ao objeto, não havendo a necessidade de instanciar
	// a classe para acessar o valor. O mesmo vale para os metodos
	final static double PI = 3.1415;
	
	AreaCirc(double raioInicial) {
		raio = raioInicial;
	}
	
	double area() {
		return PI * Math.pow(raio, 2);
	}

	static double area(double raio) {
		return PI * Math.pow(raio, 2);
	}
}
