package treino;

import java.util.Scanner;

public class ex2 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira a temperatura em �F: ");
		double fahrenheit = entrada.nextDouble();
		double celsius = (fahrenheit - 32) *5/9;
		System.out.println("A temperatura em �C �: " + celsius);
		
		entrada.close();
		
	}
}
