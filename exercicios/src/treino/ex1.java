package treino;

import java.util.Scanner;

public class ex1 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira a temperatura em Celsius: ");
		double celsius = entrada.nextDouble();
		double FA = (celsius * 9/5) +32;
		
		System.out.println("A temperatura em Fahrenheit é: " + FA + "ºF.");
				
		entrada.close();

	}
}
