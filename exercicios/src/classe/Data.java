package classe;

public class Data {
	
	int dia;
	int mes;
	int ano;
	Data(){
		dia = 1;
		mes = 1;
		ano = 1970;
	}
	Data(int dia, int mesInicial, int anoInicial){
		
		this.dia = dia;
		mes = mesInicial;
		ano = anoInicial;
	}
	
	String obterDataFormatada(){
		return String.format("%d/%d/%d\n", dia, mes, ano) ;
	}

}
