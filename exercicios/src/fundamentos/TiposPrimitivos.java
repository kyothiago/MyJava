package fundamentos;

public class TiposPrimitivos {
	//byte(1)-128 - +127/short(2)-32768-32767/int(4)/long(8)(inteiros)
	//float(4)double(8)(decimais)
	//char (1 letra)/boolean (verdadeiro/falso)
	//double a = 3; o java considera do tipo int, pois não tem casa decimal
	public static void main(String[] args) {
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L;
		
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		boolean estaDeFerias = false; //true
		char status = 'A'; //ativo
		
		
		System.out.println(anosDeEmpresa * 365);
		System.out.println(numeroDeVoos / 2);
		System.out.println(pontosAcumulados / vendasAcumuladas);
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("Férias? " + estaDeFerias);
		System.out.println("Status: " + status);
		
	}
}
