package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o primeiro sal�rio:");
		String salario1 = entrada.nextLine().replace(",", ".");
		System.out.println("Digite o segundo sal�rio:");
		String salario2 = entrada.nextLine().replace(",", ".");
		System.out.println("Digite o terceiro sal�rio:");
		String salario3 = entrada.nextLine().replace(",", ".");
		double valor1 = Double.parseDouble(salario1);
		double valor2 = Double.parseDouble(salario2);
		double valor3 = Double.parseDouble(salario3);
		
		double media = (valor1 + valor2 + valor3) /3;
		System.out.println("A m�dia salarial foi: " + media);
		
		entrada.close();
	}
}
