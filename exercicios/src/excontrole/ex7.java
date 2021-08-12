package excontrole;

import java.util.Scanner;

public class ex7 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double valor = 0;
		double total = 0;
		
		while(valor >= 0) {
			System.out.println("Digite um valor ou negativo para finalizar: ");
			valor = entrada.nextDouble();
			if(valor >=0) {	
			total += valor;
			System.out.println("A soma até o momento é: " + total);
			
			}
		}
		
		entrada.close();
	}
}
