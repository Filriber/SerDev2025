package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();

		// Offer e ADD -> Adcionam elementos na fila
		// Diferenca e o comportamento quando a fila esta cheia!

		fila.add("Ana"); // lanca uma excessao
		fila.offer("Bia");// retorna falso
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");

		// Peek e Element -> obter o proximo elemento da fila (sem remover)

		// pool e remove -> obtem o proximo elemento da fila e remove!

		// Diferenca e o comportamento ocorre quando a fila esta vazia!

		System.out.println(fila.peek()); // retorna null
		System.out.println(fila.peek());
		System.out.println(fila.element()); // lanca uma excecao
		System.out.println(fila.element());

		// fila.size()
		// fila.clear();
		// fila.isEmpty()
		// fila.contains(...)

		System.out.println(fila.poll()); // retorna null
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove());// lanca uma excecao
	}

}
