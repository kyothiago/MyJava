package controle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int qtdeDeNotas = 0;
		double nota = 0;
		double total = 0;
		while(nota != -1) {
			
			System.out.println("Digite uma nota: ");
			nota = entrada.nextDouble();
			
			if(nota <=10 && nota >= 0) {
				total += nota;
				qtdeDeNotas++;
			

			}
		}
		double media = total/qtdeDeNotas;
		System.out.println("Mèdia: " + media);
		
		entrada.close();
	}
}
