package excontrole;

import java.util.Random;
import java.util.Scanner;

public class ex6 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int continuar;
		int numeroSorteado;
		int tentativas;
		int numero;
		
		do {
			System.out.println("Sorteando numero entre 0 e 100...");
			Random numeroAleatorio = new Random();
			numeroSorteado = numeroAleatorio.nextInt(101);
			System.out.println("Come�ou o jogo, consegue me vencer?");
			tentativas = 0;
			do {
				tentativas++;
				System.out.println("Tentativa "+ tentativas);
				numero = entrada.nextInt();
				if (numero > numeroSorteado) {					
					System.out.println("O n�mero sorteado � menor que " + numero);
				}
				else if (numero < numeroSorteado) {
					System.out.println("O n�mero sorteado � maior que " + numero);	
				}
				else {
					System.out.println("Parab�ns, voc� acertou o n�mero em " + tentativas + "tentativas");
				}
				
			}while(numero != numeroSorteado);
			System.out.println("Digite 0 para sair ou qualquer outro n�mero para continuar");
			continuar = entrada.nextInt();
			
		} while (continuar != 0);
		entrada.close();
	}
}
