package oo.composicao.teste;

public class Professor {
	
	String nome;
	String materia;
	Turma turmas;
	
	Professor(String nome, String materia, Turma turmas){
		this.nome = nome;
		this.materia = materia;
		this.turmas = turmas;
	}
	
}
