package fundamentos;

import java.util.Scanner;

public class Wrappers {
	public static void main(String[] args) {
		//byte
		Scanner entrada = new Scanner(System.in);
		
		Byte b = 100;
		Short s = 1000;
		Integer i = Integer.parseInt(entrada.next()); //int
		Long l = 100000L;
		
		System.out.println(b.byteValue());
		System.out.println(b.doubleValue());
		System.out.println(s.toString());
		System.out.println(i *3);
		System.out.println(l / 3);
		
		Float f = 123.10F;
		Double d = 1234.565;
		System.out.println(f);
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		
		Character c = '#';
		System.out.println(c + "...");
		
		entrada.close();
	}
}
