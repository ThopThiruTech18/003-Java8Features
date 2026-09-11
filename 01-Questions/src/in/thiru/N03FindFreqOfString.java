package in.thiru;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
  3) How do you find frequency of each character in a string using Java 8 streams?
 */
public class N03FindFreqOfString {

	public static void main(String[] args) {

		String str = "apple";

		// LinkedHashMap --> same order
		// TreeMap --> Ascending order
		// HashMap --> Random order

		TreeMap<Character, Long> collect = 
				 str
				.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), TreeMap::new, Collectors.counting()));

		System.out.println(collect);

	}

}
