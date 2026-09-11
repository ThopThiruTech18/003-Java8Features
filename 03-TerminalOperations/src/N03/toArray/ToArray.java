package N03.toArray;

import java.util.Arrays;
import java.util.List;

public class ToArray {

	public static void main(String[] args) {
		
		String[] names=new String[] {};
		List<String> words = Arrays.asList("apple", "banana", "cherry");
		String[] wordArray = words.stream().toArray(String[]::new);
		System.out.println(Arrays.toString(wordArray));

		Object[] array = words.stream().toArray();
		for (Object object : array) {
			System.out.println(object);
		}

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		Integer[] numberArray = numbers.stream().toArray(Integer[]::new);
		System.out.println(Arrays.toString(numberArray));

		List<Double> prices = Arrays.asList(10.5, 20.0, 15.75);
		Double[] priceArray = prices.stream().toArray(Double[]::new);
		System.out.println(Arrays.toString(priceArray));

		List<Character> chars = Arrays.asList('a', 'b', 'c');
		Character[] charArray = chars.stream().toArray(Character[]::new);
		System.out.println(Arrays.toString(charArray));
		
		List<String> name1 = Arrays.asList("Alice", "Bob", "Charlie");
		String[] nameArray = name1.stream().toArray(String[]::new);
		System.out.println(Arrays.toString(nameArray));

	}

}
