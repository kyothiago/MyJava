package treino;

import java.util.Scanner;

public class ex6 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira o valor de a: ");
		double a = entrada.nextDouble();
		System.out.println("Insira o valor de b: ");
		double b = entrada.nextDouble();
		System.out.println("Insira o valor de c: ");
		double c = entrada.nextDouble();
		
		double delta = Math.pow(b, 2) - 4 * a * c;
		
		System.out.printf("\nA equa��o � : %.2fx� + %.2fx + %.2f = 0", a, b, c);
		System.out.println("O valor de delta �: " + delta);
		
		double num1 = -b + Math.sqrt(delta);
		double den = 2*a;
		double res1 = num1/den;
		System.out.println("A primeira resposta �: " + res1);
		double num2 = -b - Math.sqrt(delta);
		double res2 = num2/den;
		
		System.out.println("A segunda resposta �: " + res2);
		
		entrada.close();
	}
}
