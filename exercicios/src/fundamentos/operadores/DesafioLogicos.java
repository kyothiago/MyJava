package fundamentos.operadores;

public class DesafioLogicos {
	public static void main(String[] args) {
		//trabalho na ter?a (V ou F)
		//Trabalho na quinta (V ou F)
		//se os 2 verdadeiros = comprar televis?o 50";
		//se um deles for verdadeiro televis?o 32";
		//nos 2 vai tomar sorvete;
		//se nenhum for certo, vai n?o vai tomar sorvete;
		
		boolean trabalho1 = true;
		boolean trabalho2 = true;
		boolean televisao50 = trabalho1 && trabalho2;
		boolean televisao32 = trabalho1 ^ trabalho2;
		boolean tomarSorvete = trabalho1 || trabalho2;
		
		System.out.println("Televis?o de 50\"? " + televisao50);
		System.out.println("Televis?o de 32\"? " + televisao32);
		System.out.println("Tomou sorvete? " + tomarSorvete);
		System.out.println("Ficou em casa? " + !tomarSorvete);
		
	}
}
