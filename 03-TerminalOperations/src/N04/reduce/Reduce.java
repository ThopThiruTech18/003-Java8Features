package N04.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reduce {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		Optional<Integer> sum = numbers.stream().reduce((a, b) -> a + b);
		System.out.println("Sum: " + sum.orElse(0));
		
		
		List<String> words = Arrays.asList("apple", "banana", "cherry");
		Optional<String> concatenated = words.stream().reduce((a, b) -> a + ", " + b);
		System.out.println("Concatenated: " + concatenated.orElse(""));
		
		List<Double> prices = Arrays.asList(1., 2., 3.);
		Optional<Double> product = prices.stream().reduce((a, b) -> a * b);
		System.out.println("Product: " + product.orElse(1.0));
		
		
		List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5);
		Integer sum1 = numbers1.stream().reduce(0, Integer::sum);
		System.out.println("Sum: " + sum1);
		
		
		List<String> words1 = Arrays.asList("apple", "banana", "cherry");
		String concatenated1 = words1.stream().reduce("  ", (a, b) -> a + ", " + b);
		System.out.println("Concatenated: " + concatenated1);
		
	}

}
