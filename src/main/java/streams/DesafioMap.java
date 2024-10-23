package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {
	public static void main(String[] args) {
	
		/*
		 * 1. Numero para string binaria... 6 => "110"
		 * 2. Inverter a string... "110" => "011"
		 * 3. Converter de voltar para inteiro => "011" => 3
		 */
	
	List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
	
	
	Function<String, String> inverterString = palavra -> new StringBuilder().reverse().toString();
	System.out.println("Resolucao do problema");
	
	UnaryOperator<String> inverter = s -> new StringBuilder(s).reverse().toString();
	Function<String, Integer> binarioParaInt = s -> Integer.parseInt(s, 2);
	
	
	nums.stream()
		.map(Integer::toBinaryString)
		.map(inverter)
		.map(binarioParaInt)
		.forEach(System.out::println);
	
	
	}
	
	
}
