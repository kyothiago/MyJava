package excontrole;
import java.util.Scanner;

public class ex1 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um n�mero: ");
		int valor = entrada.nextInt();
			if (valor >= 0 && valor <= 10)
				if(valor % 2 == 0)
					System.out.println("O valor informado � par e est� entre 0-10");
				else
					System.out.println("O valor informado � �mpar");
			else
				System.out.println("O valor informado � acima de 10 ou abaixo de 0");
			
			entrada.close();
	}
}
