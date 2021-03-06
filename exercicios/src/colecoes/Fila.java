package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		//Offer e Add -> adicionam elementos na fila
		//Diferen?a ? o comportamento quando a fila est? cheia!
		
		fila.add("Ana");
		fila.offer("Gustavo");
		fila.offer("Carlos");
		fila.offer("Daniel");
		fila.offer("Rafael");
		fila.offer("Gui");
		
		//peek e element -> obtem o elementos da fila mas n?o o remove
		//Diferen?a ? o comportamento quando a fila est? vazia!
		System.out.println(fila.peek()); //retorna valor nulo
		System.out.println(fila.element()); //retorna erro
		
		//fila.size(); tamanho da fila
		//fila.clear(); esvazia a fila
		//fila.isEmpty(); retorna se a fila est? vazia
		//fila.contains(...);
		
		//poll e remove -> obtem o elementos da fila e o remove
		//Diferen?a ? o comportamento quando a fila est? vazia!
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove()); //lan?a exce??o
		System.out.println(fila.poll());	//retorna vazia
		
	}
}
