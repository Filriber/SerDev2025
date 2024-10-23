package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioMeu {

	public static void main(String[] args) {
		Estado es1 = new Estado("Sao Paulo", true, 2000000);
		Estado es2 = new Estado("Minas Gerais", false, 1750001);
		Estado es3 = new Estado("Rio de Janeiro", true, 948000);
		Estado es4 = new Estado("Espirito Santo", true, 1110034);
		Estado es5 = new Estado("Goias", false, 405000);

		List<Estado> estados = Arrays.asList(es1, es2, es3, es4, es5);

		Predicate<Estado> estadoTemPraia = e -> e.temPraia == true;
		Predicate<Estado> estadoHaMuitosHab = e -> e.nHabitantes >= 1000000;
		Function<Estado, String> conhecerOMar = e -> "Em " + e.nome + " ha praias para conhecer\n";
		Function<Estado, String> muitoHabitantes = e -> "Em " + e.nome + " ha uma grande quantidade de habitantes, ha: " + e.nHabitantes +" Habitantes\n"; 
		
		estados.stream()
			.filter(estadoTemPraia)
			.map(conhecerOMar)
			.forEach(System.out::print);;
		
			System.out.println("");
		List<Estado> estados2 = Arrays.asList(es1, es2, es3, es4 ,es5);
		
		estados2.stream()
			.filter(estadoHaMuitosHab)
			.map(muitoHabitantes)
			.forEach(System.out::print);
	}

}
