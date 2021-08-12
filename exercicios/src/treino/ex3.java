package treino;

import java.util.Scanner;

public class ex3 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira seu peso: ");
		
		double peso = entrada.nextDouble();
		
		System.out.println("Digite a altura:");
		
		String altura = entrada.next().replace("," , ".");
		
		double numero = Double.parseDouble(altura);
		
		double imc = peso / (numero * numero);
		
		System.out.println("Seu IMC é: " + imc);
		
		entrada.close();
	}
}
