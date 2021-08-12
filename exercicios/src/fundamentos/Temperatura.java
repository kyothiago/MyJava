package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		final int AJUSTE = 32;
		final double MULTIPLICADOR = 5/9.0;
		double temperatura = 80;
		double resultado = (temperatura - AJUSTE) * MULTIPLICADOR;
		System.out.println("A temperatura em Celsius é: " + resultado + "ºC");
		temperatura = 150;
		resultado = (temperatura - AJUSTE) * MULTIPLICADOR;
		System.out.println("A temperatura em Celsius é: " + resultado + "ºC");
		
	}
}
