package excontrole;

import java.util.Scanner;

public class ex3 {
	public static void main(String[] args) {
		
	Scanner entrada = new Scanner(System.in);
	System.out.println("Digite a 1ª nota");
	double nota = entrada.nextDouble();
	if (nota >10 || nota <0)
		System.out.println("Nota inválida!");
	else
		System.out.println("Digite a 2ª nota");
		double nota1 = entrada.nextDouble();
	double media = (nota + nota1) / 2;
		if(media >= 7.0 && media <= 10.0)
			System.out.println("Aprovado");
		else if(media > 4.0)
			System.out.println("Recuperação");
		else
			System.out.println("Reprovado");
	entrada.close();
	}
}
