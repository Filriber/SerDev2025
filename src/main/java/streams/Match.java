package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Luna", 6.1);
		Aluno a3 = new Aluno("Gui", 8.1);
		Aluno a4 = new Aluno("Ana", 10);

		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		Predicate<Aluno> reprovado = aprovado.negate();
		
		//retornara verdadeiro caso todos os alunos estiverem dentro da condicao de aprovado
		System.out.println(alunos.stream().allMatch(aprovado));
		
		//retornara verdadeiro caso algum deles tenha sido aprovado	
		System.out.println(alunos.stream().anyMatch(aprovado));
		
		//retornara verdadeiro caso nenhum dos alunos tenha sido aprovado (no caso esta ao contrario)
		System.err.println(alunos.stream().noneMatch(reprovado));
	}
}
