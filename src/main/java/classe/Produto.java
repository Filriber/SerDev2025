package classe;

public class Produto {

	String nome;
	double preco;
	static double desconto = 0.25;

	Produto() {

	}

	Produto(String nomeInicial) {
		nome = nomeInicial;
	}

	Produto(String nomeInicial, double precoInicial) {
		nome = nomeInicial;
		preco = precoInicial;
		//desconto = descontoInicial;
	}

	double precoComDesconto() {
		double precoFinal = preco * (1 - desconto);
		return precoFinal;
	}

}
