package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		//%n pode ser usado para quebra de linha dentro do texto.
		Scanner entrada = new Scanner(System.in);
		System.out.printf("Insira seu nome: ");
		String nome = entrada.nextLine();
		System.out.println("Nome = " + nome);
		//nextLine para strings, nextInt para inteiros
		
		entrada.close();
		
	}
}
