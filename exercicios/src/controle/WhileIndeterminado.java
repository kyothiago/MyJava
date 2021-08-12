package controle;

import java.util.Scanner;

public class WhileIndeterminado {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String valor = "";
		while (!valor.equalsIgnoreCase("Sair")) {
			System.out.println("Você diz: ");
			valor = entrada.nextLine();
			System.out.println("Digite sair para finalizar o programa");
		}
		
		entrada.close();
	}
}
