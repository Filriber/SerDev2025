package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
	public static void main(String[] args) {

		double precoFim = 0;
		Produto p = new Produto("iPad", 3235.89, 0.13);
		/*
		 * 1.A partir do produto, calcular o preco real (com desconto) 
		 * 2.Imposto Municipal: >= 2500 (8.5)/ < 2500 (Isento) 
		 * 3.Frete: >= 3000 (100) / < 3000(50)
		 * 4.Arredondar: Deixar duas casas decimais 
		 * 5.Formatar: R$ 1234,56
		 */
		//Minha Solução sem utilizar o video de resposta do desafio
		
		Calculo calculo = (double a, double b) -> {
			return p.preco * (1 - p.desconto);

		};
		double precoReal = calculo.executar(p.preco, p.desconto);
		System.out.println(precoReal);

		if (precoReal >= 2500) {
			UnaryOperator<Double> precoComImposto = num -> num * 0.085;
			precoFim = (precoComImposto.apply(precoReal)) + precoReal;
			System.out.println(precoFim);

		} else {
			precoFim = precoReal;
			System.out.println(precoFim);
		}

		if (precoFim >= 3000) {
			precoFim += 100;
		} else {
			precoFim += 50;
		}
		
		double valorComFrete = precoFim;
		System.out.printf("o Valor da compra e: R$%.2f%n", valorComFrete);

		// Respota do Video de resolução
		

		Function<Produto, Double> precoFinal = produto -> produto.preco * (1 - produto.desconto);
		UnaryOperator<Double> impostoMunicipal = preco -> preco >= 2500 ? preco * 1.085 : preco;
		UnaryOperator<Double> frete = preco -> preco >= 3000 ? preco + 100 : preco + 50;
		UnaryOperator<Double> arredondar = preco -> Double.parseDouble(String.format("%.2f", preco));
		Function<Double, String> formatar = preco -> ("R$" + preco);
		
		
		
		String preco = precoFinal.andThen(impostoMunicipal).andThen(frete).andThen(arredondar).andThen(formatar).apply(p);
		System.out.println("O preço final é " + preco);
	}

}
