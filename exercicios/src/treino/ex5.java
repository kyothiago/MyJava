package treino;

import java.util.Scanner;

public class ex5 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira a altura do tri�ngulo: ");
		double altura = entrada.nextDouble();
		System.out.println("Insira a base do tri�ngulo: ");
		double base = entrada.nextDouble();
		double area = base * altura / 2;
		System.out.println("A �rea do tri�ngulo �: " + area);
		
		entrada.close();
	}
}
