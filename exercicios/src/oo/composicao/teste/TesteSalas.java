package oo.composicao.teste;

import java.util.ArrayList;

public class TesteSalas {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("jo?o", 16, 8.5);
		Turma a = new Turma("A", Aluno(a1));
		Professor p1 = new Professor("Daniel", "Java Script", a);
		
		System.out.println(p1.materia);

	}

	private static ArrayList<Aluno> Aluno(Aluno a1) {
		return null;
	}
}
