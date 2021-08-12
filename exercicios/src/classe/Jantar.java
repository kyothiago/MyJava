package classe;

public class Jantar {
	public static void main(String[] args) {
		Comida c1 = new Comida("Feijão", 0.300);
		Comida c2 = new Comida("Arroz", 0.400);
	//	Pessoa p1 = new Pessoa("Antonio", 67.0);
		Pessoa p = new Pessoa("João", 99.8);
		
		System.out.println(p.apresentar());
		p.comer(c1);
		System.out.println(p.apresentar());
		p.comer(c2);
		System.out.println(p.apresentar());
	
		
		
		
	}
}
