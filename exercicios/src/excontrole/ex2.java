package excontrole;

import java.util.Scanner;

public class ex2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o ano para saber se � bissexto:");
		double ano = entrada.nextDouble();
		String bissexto = " n�o";
			if (ano %4 == 0 && ano %100 != 0 || ano % 400 == 0) {
					bissexto = "";
					
			}
		System.out.println("O ano informado" + bissexto + " � bissexto");
		
		entrada.close();
	}
}
