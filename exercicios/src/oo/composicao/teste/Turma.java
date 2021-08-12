package oo.composicao.teste;

import java.util.ArrayList;

public class Turma {
	
	String classe;
	ArrayList<Aluno> alunos = new ArrayList<>();
	
	Turma(String classe, ArrayList<Aluno> alunos){
		this.classe = classe;
		this.alunos = alunos;
		
	}
}
