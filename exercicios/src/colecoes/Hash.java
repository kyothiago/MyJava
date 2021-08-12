package colecoes;

import java.util.HashSet;

public class Hash {
	public static void main(String[] args) {
		
		HashSet<Usuario> usuarios = new HashSet<Usuario>();
		usuarios.add(new Usuario("Pedro"));
		usuarios.add(new Usuario("Gustavo"));
		usuarios.add(new Usuario("Rosemeire"));
		boolean resultado = usuarios.contains(new Usuario("Rosemeire"));
		System.out.println(resultado); //porém, se não tiver o hashCode no Usuário retorna false!
	}
}
