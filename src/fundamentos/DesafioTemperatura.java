package fundamentos;

public class DesafioTemperatura {
	public static void main(String[] args) {
		
		double fahrenheit = 32.0;
		final double ajuste = 32;
		final double fatos = 5/9.0;
		double celcius = (fahrenheit - ajuste) * fatos;
		String celciusFormatado = String.format("%.2f", celcius);
		System.out.println(celciusFormatado + " °C");
		
		fahrenheit = 45.0;
		celcius = (fahrenheit - ajuste) * fatos;
		celciusFormatado = String.format("%.2f", celcius);
		System.out.println(celciusFormatado + " °C");
		
	}	
}

// utilizar duas contantes - 32 - Ajuste e 5/9 - Fator
// (°F -32) x 5/9 = °C