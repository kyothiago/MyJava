package excontrole;

import java.util.Scanner;

public class ex5 {
	public static void main(String[] args) {
		int contadorDeDivisores = 0;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o n�mero para verificar se � primo: ");
		int numero = entrada.nextInt();
		for (int i = 2; i < numero; i++) {
			if (numero %i == 0) {
				contadorDeDivisores ++;
			}
		}
		
		switch(contadorDeDivisores) {
		case 0:
			System.out.println("O n�mero " + numero + " � primo");
			break;
		default:
			System.out.println("O n�mero " + numero + " n�o � primo");
		
		}
			
		entrada.close();
	}

}