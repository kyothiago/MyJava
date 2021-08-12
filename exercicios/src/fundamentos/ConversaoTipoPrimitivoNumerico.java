package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	public static void main(String[] args) {
		double a = 1; //converteu de forma implicita
		System.out.println(a);
		
		float b = (float) 1.5; //explícita (cast)
		System.out.println(b);
		
		int c = 4;
		byte d = (byte) c; //explícita só inserir o tipo novamente entre parenteses
		System.out.println(d);
		
		
	}
}
