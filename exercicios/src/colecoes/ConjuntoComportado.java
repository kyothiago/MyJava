package colecoes;

import java.util.TreeSet;
import java.util.HashSet;
import java.util.SortedSet;

public class ConjuntoComportado {
	public static void main(String[] args) {
		
		//Set<String> lista = new HashSet<>(); //variaveis s� poder�o ser String
		SortedSet<String> lista = new TreeSet<>(); //mant�m a ordem que foi adicionado os objetos
		lista.add("Teste");
		lista.add("Thiago");
		lista.add("x");
		lista.add("teste");
		
		for(String candidato: lista) {
			System.out.println(candidato);
		}
		HashSet<Integer> nums = new HashSet<>(); // n�o mant�m a ordem que foi adicionado os objetos
		nums.add(1);
		nums.add(2);
		nums.add(6);
		nums.add(4);
		
		for(int n: nums) {
			System.out.println(n);
		}
	}
}

