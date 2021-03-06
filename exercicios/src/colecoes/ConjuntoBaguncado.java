package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		conjunto.add(1.2); //double -> Double
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add('x'); //adicionar
		
		System.out.println("Tamanho ? " + conjunto.size()); //tamanho
		
		conjunto.add("Teste");
		System.out.println("Tamanho ? " + conjunto.size());
		conjunto.remove("Teste"); //remover
		System.out.println("Tamanho ? " + conjunto.size());
		System.out.println(conjunto.contains(1.2));
		
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		//conjunto.addAll(nums); //uni?o dos dois conjuntos
		conjunto.retainAll(nums); //interse??o dois conjuntos
		System.out.println(conjunto);
		
		conjunto.clear();
		System.out.println(conjunto);
	} 
}
