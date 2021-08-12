package fundamentos.operadores;

public class DesafioAritmetico {
	public static void main(String[] args) {
		int a = 6 * (3+2);
		int b = (int) Math.pow(a, 2);
		int c = 3 *2;
		int d = (1 - 5) * (2 - 7);
		int e = 2;
		int f = d / e;
		int g = (int) Math.pow(f, 2);
		int h = b / c;
		int i = h - g;
		int j = (int) Math.pow(10, 3);
		int k = (int) Math.pow(i, 3);
		int l = k/j;
	
		System.out.println(l); 
		
	}
}
