package colecoes;

import java.util.ArrayList;

public class Lista {
	
	public static void main(String[] args) {
		
		ArrayList<Usuario> lista = new ArrayList<>();
		Usuario u1 = new Usuario ("Ana");
		lista.add(u1);
		lista.add(new Usuario ("Carlos"));
		lista.add(new Usuario ("Thiago"));
		lista.add(new Usuario ("Lia"));
		lista.add(new Usuario ("Manu"));
		
		System.out.println(lista.get(2).nome); //acessar pelo índice
		lista.remove(1);
		System.out.println(lista.remove(new Usuario("Lia"))); // é possível remover pelo id ou pelo objeto
		for (Usuario u: lista) { 
			System.out.println(u.nome);
		}
		//System.out.println(lista.contains("Thiago"));
		System.out.println("Tem? " + lista.contains(new Usuario("Thiago")));

	}
}
