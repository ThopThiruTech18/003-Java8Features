package no11.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//map==>1d
public class FlatMap {

	public static void main(String[] args) {
		
		//collection,collection2,collection3---> collection

		long startTime1 = System.currentTimeMillis();
		List<List<Integer>> nestedList1 = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4), Arrays.asList(5, 6));
		List<Integer> flatList1 = nestedList1.stream().flatMap(List::stream).collect(Collectors.toList());
		System.out.println("Flattened List: " + flatList1);
		long endTime1 = System.currentTimeMillis();

		long startTime2 = System.currentTimeMillis();
		List<String> words1 = Arrays.asList("hello", "world");
		List<Character> distinctChars1 = words1.stream().flatMap(s -> s.chars().distinct().mapToObj(c -> (char) c))
				.collect(Collectors.toList());
		System.out.println("Distinct Characters: " + distinctChars1);
		long endTime2 = System.currentTimeMillis();

		long startTime3 = System.currentTimeMillis();
		List<List<String>> listOfLists1 = Arrays.asList(Arrays.asList("apple", "orange"),
				Arrays.asList("banana", "grape"));
		List<String> flatList2 = listOfLists1.stream().flatMap(List::stream).collect(Collectors.toList());
		System.out.println("Flattened List: " + flatList1);
		long endTime3 = System.currentTimeMillis();

		long startTime4 = System.currentTimeMillis();
		List<String> sentences1 = Arrays.asList("Hello World", "Stream API Example", "FlatMap Demo");
		List<String> words2 = sentences1.stream().flatMap(s -> Arrays.stream(s.split("\\s+")))
				.collect(Collectors.toList());
		System.out.println("Flattened Words: " + words2);
		long endTime4 = System.currentTimeMillis();

		long startTime5 = System.currentTimeMillis();
		List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4);
		List<Integer> squares1 = numbers1.stream().flatMap(n -> Stream.of(n, n * n)).collect(Collectors.toList());
		System.out.println("Squares: " + squares1);
		long endTime5 = System.currentTimeMillis();

		System.out.println("---------------------------------------------------------");
		System.out.println("total time taken for first example  :: " + (endTime1 - startTime1));
		System.out.println("total time taken for first example  :: " + (endTime2 - startTime2));
		System.out.println("total time taken for first example :: " + (endTime3 - startTime3));
		System.out.println("total time taken for first example :: " + (endTime4 - startTime4));
		System.out.println("total time taken for first example :: " + (endTime5 - startTime5));
		System.out.println("---------------------------------------------------------");

		System.out.println("==================================================================");

		long startTime6 = System.currentTimeMillis();
		List<List<Integer>> nestedList = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4), Arrays.asList(5, 6));
		List<Stream<Integer>> collect = nestedList.stream().map(List::stream).collect(Collectors.toList());
		System.out.println("Flattened List: " + collect);
		long endTime6 = System.currentTimeMillis();

		long startTime7 = System.currentTimeMillis();
		List<String> words = Arrays.asList("hello", "world");
		List<Stream<Character>> collect2 = words.stream().map(s -> s.chars().distinct().mapToObj(c -> (char) c))
				.collect(Collectors.toList());
		System.out.println("Distinct Characters: " + collect2);
		long endTime7 = System.currentTimeMillis();

		long startTime8 = System.currentTimeMillis();
		List<List<String>> listOfLists = Arrays.asList(Arrays.asList("apple", "orange"),
				Arrays.asList("banana", "grape"));
		List<Stream<String>> collect3 = listOfLists.stream().map(List::stream).collect(Collectors.toList());
		System.out.println("Flattened List: " + collect3);
		long endTime8 = System.currentTimeMillis();

		long startTime9 = System.currentTimeMillis();
		List<String> sentences = Arrays.asList("Hello World", "Stream API Example", "FlatMap Demo");
		List<Stream<String>> collect4 = sentences.stream().map(s -> Arrays.stream(s.split("\\s+"))).collect(Collectors.toList());
		System.out.println("Flattened Words: " + collect4);
		long endTime9 = System.currentTimeMillis();

		long startTime10 = System.currentTimeMillis();
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
		List<Stream<Integer>> collect5 = numbers.stream().map(n -> Stream.of(n, n * n)).collect(Collectors.toList());
		System.out.println("Squares: " + collect5);
		long endTime10 = System.currentTimeMillis();

		System.out.println("---------------------------------------------------------");
		System.out.println("total time taken for first example :: " + (endTime6 - startTime6));
		System.out.println("total time taken for first example :: " + (endTime7 - startTime7));
		System.out.println("total time taken for first example :: " + (endTime8 - startTime8));
		System.out.println("total time taken for first example :: " + (endTime9 - startTime9));
		System.out.println("total time taken for first example :: " + (endTime10 - startTime10));
		System.out.println("---------------------------------------------------------");

	}

}
