package excecao.personalizadaA;

import excecao.Aluno;

public class TersteValidacoes {

	public static void main(String[] args) {
		try {
			Aluno aluno = new Aluno("Ana", 7);
			Validar.aluno(aluno);
			
			Validar.aluno(null);
		} catch (StringVaziaException e) {
			System.out.println(e.getMessage());
		} catch (NumeroForaIntervaloException |IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
//		Outra possibilidade, usando operador Or, porem com apenas 1 traco
//		catch (StringVaziaException | NumeroForaIntervaloException e) {
//		System.out.println(e.getMessage());	
//		}
		
		System.out.println("Fim :)");

	}

}
