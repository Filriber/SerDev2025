package classe;

import java.util.Scanner;

public class ProdutoTeste {

	public static void main(String[] args) {

		int a = 3;
		Scanner entrada = new Scanner(System.in);

		Produto p1 = new Produto("Notebook ", 4686.44);
		// p1.nome = "Notebook";
		// p1.preco = 4686.44;
		// p1.desconto = 0.24;

		var p2 = new Produto("Caneta Azul");
		// p2.nome = "Caneta Azul";
		p2.preco = 10.56;
		
		Produto.desconto = 0.29;
		

		System.out.println(p1.nome + "" + p1.precoComDesconto());
		System.out.println(p2.nome + "" + p2.precoComDesconto());

		// Solução antes de começar a usar métodos!
		// double precoFinal1 = p1.preco *(1-p1.desconto);
		// double precoFinal2 = p2.preco *(1-p2.desconto);

		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto();

		double mediaCarrinho = ((precoFinal1 + precoFinal2) / 2);
		System.out.printf("Media do carrinho = R$%.2f.", mediaCarrinho);
	}

}
