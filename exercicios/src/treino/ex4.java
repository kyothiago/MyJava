package treino;

import java.util.Scanner;

public class ex4 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira o valor: ");
		double valor = entrada.nextDouble();
		System.out.println("Valor ao quadrado é: " + Math.pow(valor, 2));
		System.out.println("Valor ao cubo é: " + Math.pow(valor, 3));
		
		entrada.close();
	}
}
