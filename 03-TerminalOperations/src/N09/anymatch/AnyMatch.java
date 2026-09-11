package N09.anymatch;

import java.util.Arrays;
import java.util.List;

public class AnyMatch {
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 7, 3, 9, 8);
		boolean anyEven = numbers.stream().anyMatch(n -> n % 2 == 0);
		System.out.println("Any Even Number: " + anyEven);
		
		
		List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
		boolean anyLongWord = words.stream().anyMatch(s -> s.length() > 8);
		System.out.println("Any Long Word: " + anyLongWord);
		
		
		List<Double> prices = Arrays.asList(10.5, 20.0, 15.75, 30.0, 25.5);
		boolean anyExpensive = prices.stream().anyMatch(p -> p > 25.0);
		System.out.println("Any Expensive Price: " + anyExpensive);
		
		List<Character> chars = Arrays.asList('a', 'b', 'c', 'd', 'e');
		boolean anyVowel = chars.stream().anyMatch(c -> "aeiou".indexOf(c) != -1);
		System.out.println("Any Vowel: " + anyVowel);
		
		List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
		boolean anyStartsWithA = strings.stream().anyMatch(s -> s.startsWith("a"));
		System.out.println("Any String Starts with 'a': " + anyStartsWithA);
	}

}
