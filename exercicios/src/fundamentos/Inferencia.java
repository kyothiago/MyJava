package fundamentos;

public class Inferencia {
	public static void main(String[] args) {
		
		double a = 4.5;
		System.out.println(a);
		
		var b = 4.5;
		System.out.println(b);
		
		var c = "texto";
		System.out.println(c);
		
		c = "outro texto";
		System.out.println(c);
		
		double d; //vari�vel foi declarada
		d = 123.65; //vari�vel foi inicializada
		System.out.println(d); //usada
		
		//var n�o consegue ser inicializado depois de declarado.
	}
}
