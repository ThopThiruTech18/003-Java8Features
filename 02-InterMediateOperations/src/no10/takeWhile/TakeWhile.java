package no10.takeWhile;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/*
The dropWhile operation removes elements from the beginning of the stream until the specified condition is false, 
and then includes the remaining elements. The outputs align with this behavior.




+-----------------+------------------------------------------------------------------------------------------+-----------------------+
|    dropWhile     | Drops elements until a specified predicate is false, then includes the remaining element| dropWhile(predicate)  | note:;take false values from starting
+-----------------+------------------------------------------------------------------------------------------+-----------------------+
|    takeWhile     | Takes elements while a specified predicate is true, then stops when it becomes false.   | takeWhile(predicate)  | note:;take true values from starting
+-----------------+-----------------------------------------------------------------------------
*/
public class TakeWhile {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 3, 5, 2, 4, 6);
		List<Integer> takenWhile = numbers.stream().takeWhile(n -> n % 2 != 0).collect(Collectors.toList());
		System.out.println("Taken While: " + takenWhile);
		
		
		String sentence = "The quick brown fox jumps over the lazy dog";
		List<String> takenWhile1 = Arrays.stream(sentence.split("\\s+")).takeWhile(word -> word.length() < 4).collect(Collectors.toList());
		System.out.println("Taken While: " + takenWhile1);
		
		List<Double> prices = Arrays.asList(10.5, 20.0, 15.75, 30.0, 25.5);
		List<Double> takenWhile2 = prices.stream().takeWhile(p -> p < 20.0).collect(Collectors.toList());
		System.out.println("Taken While: " + takenWhile2);
		
		List<Character> chars = Arrays.asList('a', 'b', 'c', 'd', 'e');
		List<Character> takenWhile3 = chars.stream().takeWhile(c -> c < 'd').collect(Collectors.toList());
		System.out.println("Taken While: " + takenWhile3);
		
		List<String> strings = Arrays.asList("elde","banan", "cherr", "date" );
		List<String> takenWhile4 = strings.stream().takeWhile(s -> s.length() < 6).collect(Collectors.toList());
		System.out.println("Taken While: " + takenWhile4);
		
	}

}
