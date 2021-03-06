package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;
//import java.util.Iterator;

public class Pilha {
	
	//last in first out
	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<String>();
		livros.add("O Pequeno Pr?ncipe");
		livros.push("Don Quixote");
		livros.push("O Hobbit");
		
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		for(String livro: livros) {
			System.out.println("A sequ?ncia ?: " + livro);
		}
		
		System.out.println(livros.pop());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		
	}

}
