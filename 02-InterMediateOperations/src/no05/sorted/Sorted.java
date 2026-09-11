package no05.sorted;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
/*
 Sorts the elements based on a comparator or natural ordering.
 sorted(comparator)   
 */
public class Sorted {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(5, 3, 8, 1, 2);
		List<Integer> sortedNumbers = numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println("Sorted Numbers: " + sortedNumbers);
		
		
		List<String> words = Arrays.asList("banana", "cherry", "apple");
		List<String> sortedWords = words.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println("Sorted Words: " + sortedWords);
		
		
		
		List<Double> prices = Arrays.asList(15.75, 10.5, 20.0, 7.25);
		List<Double> sortedPrices = prices.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println("Sorted Prices: " + sortedPrices);
		
		List<Character> chars = Arrays.asList('c', 'a', 'b');
		List<Character> sortedChars = chars.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println("Sorted Characters: " + sortedChars);
	}

}
