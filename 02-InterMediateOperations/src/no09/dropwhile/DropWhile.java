package no09.dropwhile;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 The dropWhile operation removes elements from the beginning of the stream until the specified condition is false, 
 and then includes the remaining elements. The outputs align with this behavior.
 



+-----------------+------------------------------------------------------------------------------------------+-----------------------+
|    dropWhile     | Drops elements until a specified predicate is false, then includes the remaining element| dropWhile(predicate)  | note:;take false values from starting
+-----------------+------------------------------------------------------------------------------------------+-----------------------+  drop false
|    takeWhile     | Takes elements while a specified predicate is true, then stops when it becomes false.   | takeWhile(predicate)  | note:;take true values from starting
+-----------------+-----------------------------------------------------------------------------                                        take true
 */

public class DropWhile {
public static void main(String[] args) {
	List<Integer> numbers = Arrays.asList(1, 3, 5, 2, 4, 6);
	List<Integer> afterDropWhile = numbers.stream().dropWhile(n -> n % 2 != 0).collect(Collectors.toList());
	System.out.println("After DropWhile: " + afterDropWhile);
	
	
	String sentence = "The h hi lo qui brown fox jumps over the lazy dog a";
	List<String> afterDropWhile1 = Arrays.stream(sentence.split("\\s+")).dropWhile(word -> word.length() < 4).collect(Collectors.toList());
	System.out.println("After DropWhile: " + afterDropWhile1);
	
	List<Double> prices = Arrays.asList(10.5, 20.0, 15.75, 30.0, 25.5);
	List<Double> afterDropWhile2= prices.stream().dropWhile(p -> p < 20.0).collect(Collectors.toList());
	System.out.println("After DropWhile: " + afterDropWhile2);
	
	
	
	List<Character> chars = Arrays.asList('a', 'b', 'c', 'd', 'e');
	List<Character> afterDropWhile3 = chars.stream().dropWhile(c -> c < 'd').collect(Collectors.toList());
	System.out.println("After DropWhile: " + afterDropWhile3);
	
	
	List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
	List<String> afterDropWhile4 = strings.stream().dropWhile(s -> s.length() < 6).collect(Collectors.toList());
	System.out.println("After DropWhile: " + afterDropWhile4);
}
}
