package classesEMetodos;

public class ValorNulo {
	public static void main(String[] args) {
		
		String s1 = "";
		System.out.println(s1.concat("!!!!!"));
		
		ClasseData d1 = Math.random() > 0.5 ? new ClasseData() : null;
		
		if (d1 != null) {
			d1.mes = 3;
			System.out.println(d1.dataFormatada());			
		}
		
		String s2 = Math.random() > 0.5 ? "Opa" : null;
		
		if (s2 != null) {
			System.out.println(s2.concat("????"));
		}
 	}

}
