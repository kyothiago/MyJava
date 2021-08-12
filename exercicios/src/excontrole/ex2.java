package excontrole;

import java.util.Scanner;

public class ex2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o ano para saber se é bissexto:");
		double ano = entrada.nextDouble();
		String bissexto = " não";
			if (ano %4 == 0 && ano %100 != 0 || ano % 400 == 0) {
					bissexto = "";
					
			}
		System.out.println("O ano informado" + bissexto + " é bissexto");
		
		entrada.close();
	}
}
