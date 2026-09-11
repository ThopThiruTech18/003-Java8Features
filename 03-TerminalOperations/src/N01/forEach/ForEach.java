package N01.forEach;

import java.util.Arrays;
import java.util.List;

public class ForEach {
	
	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banana", "cherry");
		words.stream().forEach(System.out::println);
		words.stream().forEach(a->System.out.println(a));
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		numbers.stream().forEach(n -> System.out.println(n + " "));
		
		List<Double> prices = Arrays.asList(10.5, 20.0, 15.75);
		prices.stream().forEach(price -> System.out.printf("%.3f ", price));
		
		List<Character> chars = Arrays.asList('a', 'b', 'c');
		chars.stream().forEachOrdered(c -> System.out.print(c + " "));
		
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
		names.stream().forEach(name -> System.out.println("Hello, " + name + "!"));
	}

}
