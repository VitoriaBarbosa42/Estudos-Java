package classesEMetodos;

public class ClasseData {
	int dia;
	int mes;
	int ano;
	
	ClasseData () {
//		dia = 1;
//		mes = 1;
//		ano = 1970;
		this(1, 1, 1970);
		// Chamando um construtos a partir de outro construtos
		
	}
	
	
	//refenrenciar o objeto atual
	ClasseData (int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		
	}
	
	// É mais interessante fazer dessa forma, pois com o retorno da função eu posso fazer muito mais coisas
	String dataFormatada () {
		return String.format("%d/%d/%d", dia, mes, ano);	
	}
	// Funciona comente no terminal
	void imprimirDataFormatada() {
		System.out.println(this.dataFormatada());
		
	}
	
	}
//		String diaS = Integer.toString(dia);
//		String mesS = Integer.toString(mes);
//		String anoS = Integer.toString(ano);
//	
//		String formatacao = diaS.concat("/").concat(mesS).concat("/").concat(anoS);	
//		return formatacao;