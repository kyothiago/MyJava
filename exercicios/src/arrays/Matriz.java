package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantos alunos existem na classe?");
		
		int qtdeAlunos = entrada.nextInt();
		
		System.out.println("Quantas notas por aluno?");
		
		int qtdeNotas = entrada.nextInt();
		
		double[][] classe = new double[qtdeAlunos][qtdeNotas];
		double total = 0;
				
		for (int i = 0; i < classe.length; i++) {
			for (int j = 0; j < classe[i].length; j++) {
				
				System.out.printf("Informe a nota %d do aluno %d \n" , (j + 1), (i + 1));
				
				classe[i][j] = entrada.nextDouble();
				total+= classe[i] [j];
				
			}	
		}
		
		double media = total / (qtdeAlunos * qtdeNotas);
		System.out.println("M?dia da turma ? " + media);
		
		for(double[] notasDoAluno: classe) {
		
		System.out.println(Arrays.toString(notasDoAluno));
		
		}
		
		
		entrada.close();
	}
}
