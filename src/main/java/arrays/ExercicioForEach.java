package arrays;

import java.util.Arrays;

public class ExercicioForEach {

	public class Exercicio {
		public static void main(String[] args) {

			double[] notasAlunoA = new double[3];
			System.out.println(Arrays.toString(notasAlunoA));

			notasAlunoA[0] = 7.9;
			notasAlunoA[1] = 8;
			notasAlunoA[2] = 6.7;

			System.out.println(Arrays.toString(notasAlunoA));
			System.out.println(notasAlunoA[0]);
			System.out.println(notasAlunoA[notasAlunoA.length - 1]);
			// System.out.println(notasAlunoA[4]); ERRO!

			for (double nota : notasAlunoA) {
				System.out.println(nota + " ");
			}

			final double notaArmazenada = 5.9;
			double[] notasAlunoB = { 6.9, 8.9, notaArmazenada, 10 };

			for (double nota : notasAlunoB) {
				System.out.println(nota + " ");
			}

		}
	}

}
