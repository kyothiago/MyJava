package oo.composicao;

public class CursoTeste {
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Jo?o");
		Aluno a2 = new Aluno("Maria");
		Aluno a3 = new Aluno("Ana");
		
		Curso c1 = new Curso("Java Completo");
		Curso c2 = new Curso("Web 2023");
		Curso c3 = new Curso("React Native");
		
		c1.addAluno(a1);
		c1.addAluno(a2);
		
		c2.addAluno(a1);
		c2.addAluno(a3);
		
		a1.addCurso(c3);
		a2.addCurso(c3);
		a3.addCurso(c3);
		
		for(Aluno aluno: c1.alunos) {
			System.out.println("Estou matriculado no curso 1: " + c1.nome);
			System.out.println("e o meu nome ? " + aluno.nome);
		}
		for(Aluno aluno: c2.alunos) {
			System.out.println("Estou matriculado no curso 2: " + c2.nome);
			System.out.println("e o meu nome ? " + aluno.nome);
		}
		for(Aluno aluno: c3.alunos) {
			System.out.println("Estou matriculado no curso 3: " + c3.nome);
			System.out.println("e o meu nome ? " + aluno.nome);
		}
		
	}

}
