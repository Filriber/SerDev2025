package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioArray {

	public static void main(String[] args) {
		System.out.println("Deseja implementar quantas notas no array? ");
		Scanner input = new Scanner(System.in);

		int qntNotas = input.nextInt();
		double[] mediaAluno = new double[qntNotas];

		for (int i = 0; i < mediaAluno.length; i++) {
			System.out.print("Digite a: " + (i + 1) + "ª nota: ");
			double nota = input.nextDouble();
			mediaAluno[i] = nota;

		}

		System.out.println(Arrays.toString(mediaAluno));

		double total = 0;
		for (double nota : mediaAluno) {
			total += nota;

		}
		double media = total / mediaAluno.length;
		System.out.println("A média é: " + (media));
		input.close();
	}

}
