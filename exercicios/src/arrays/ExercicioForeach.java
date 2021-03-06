package arrays;

import java.util.Arrays;

public class ExercicioForeach {
	public static void main(String[] args) {
		
		double[] notasAlunoA = new double[3];
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		
		System.out.println(Arrays.toString(notasAlunoA));
		
		double totalA = 0;
		
		for(double nota: notasAlunoA) {
			totalA += nota;
		}
		System.out.println(totalA);
		System.out.println(totalA/notasAlunoA.length);
		
		double[] notasAlunoB = { 6.9, 8.9, 5.5, 10 };
		
		double totalB = 0;
		for (double nota: notasAlunoB) {
			totalB += nota;
		}
		
		System.out.println("A m?dia do aluno B foi: " + totalB / notasAlunoB.length);
	}
}
