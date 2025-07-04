package ClassesEMetodos;

public class DataTeste {
	
	public static void main(String[] args) {
		
		ClasseData dia1 = new ClasseData();
			dia1.dia = 5;
			dia1.mes = 05;
			dia1.ano = 2025;
			
			
		ClasseData dia2 = new ClasseData(15, 01, 2000);
		
		ClasseData dia3 = new ClasseData();			

			System.out.println(dia1.dataFormatada());
			System.out.println(dia2.dataFormatada());
			System.out.println(dia3.dataFormatada());
		
	}

}
