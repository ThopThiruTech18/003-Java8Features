package N02.forEachOrder;

import java.util.Arrays;
import java.util.List;

public class ForEachOrder {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banana", "cherry");
		words.stream().forEachOrdered(System.out::println);

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		numbers.stream().forEachOrdered(n -> System.out.print(n + " "));
		

		List<Double> prices = Arrays.asList(10.5, 20.0, 15.75);
		prices.stream().forEachOrdered(price -> System.out.printf("%.2f ", price));
		
		List<Character> chars = Arrays.asList('a', 'b', 'c');
		chars.stream().forEachOrdered(c -> System.out.print(c + " "));
		
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
		names.stream().forEachOrdered(name -> System.out.println("Hello, " + name + "!"));
	}

}
