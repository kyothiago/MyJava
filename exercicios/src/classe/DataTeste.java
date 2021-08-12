package classe;

public class DataTeste {
	public static void main(String[] args) {

		Data d1 = new Data();
	
	/*	d1.dia = 12;
		d1.mes = 8; */
		d1.ano = 2020;
		
		Data d2 = new Data(15, 7, 1990);
		d2.dia = 15;
		d2.mes = 7;
		d2.ano = 1990;
		
		System.out.printf(d1.obterDataFormatada());
		System.out.printf("%d/%d/%d", d2.dia, d2.mes, d2.ano);

	}
}
