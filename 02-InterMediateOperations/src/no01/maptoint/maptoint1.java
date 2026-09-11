package no01.maptoint;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;

/*
 Transforms each element to an int. 
 */
public class maptoint1 {

	/*
	 * int num = Integer.parseInt("123"); int num = Integer.parseInt("1A", 16); //
	 * Parses as hexadecimal Integer num = Integer.valueOf("123"); Integer num =
	 * Integer.valueOf("1A", 16); // Parses as hexadecimal Integer num =
	 * Integer.decode("0x1A"); // Parses as hexadecimal
	 * 
	 * 01]Convert string to integer 02]Calculate string length and max length word
	 * 03]Calculate double sum 05]Calculate ascii sum 06]Calculate double
	 * 
	 * List<String> asList = Arrays.asList("1", "2", "3", "4", "5"); List<String>
	 * words = Arrays.asList("apple", "banana", "cherry"); List<Double> doubles =
	 * Arrays.asList(1.5, 2.5, 3.5, 4.5, 5.5); List<Character> chars =
	 * Arrays.asList('a', 'b', 'c'); List<Double> asList = Arrays.asList(1.5, 2.5,
	 * 3.5, 4.5, 5.5);
	 * 
	 * int --> Integer
	 * double--> Double
	 * float-> Float
	 * 
	 * 
	 */

	public static void maptoInt1() {
		List<String> asList = Arrays.asList("1", "2", "3", "4");
		int sum = asList.stream().mapToInt(Integer::parseInt).sum(); //=> mapToInt(Integer::parseInt) => "1", "2", "3", "4", "5" => 1,2,3,4,5  =>15
		
		int min = asList.stream().mapToInt(Integer::parseInt).min().getAsInt();
		int max = asList.stream().mapToInt(Integer::parseInt).max().getAsInt();
		double average = asList.stream().mapToInt(Integer::parseInt).average().getAsDouble();
		
		long count = asList.stream().mapToInt(Integer::parseInt).count();
		
		System.out.println("sum of integers are :: " + sum);
		System.out.println("min of integers are :: " + min);
		System.out.println("max of integers are :: " + max);
		System.out.println("average of integers are :: " + average);
		System.out.println("count of integers are :: " + count);

	}

	public static void maptoInt2() {
		List<String> words = Arrays.asList("apple", "banana", "cherry");
		int orElse = words.stream().mapToInt(String::length).max().orElse(0);
		System.out.println("max length of the frout is :: " + orElse);
	}

	public static void maptoInt3() {
		List<Double> doubles = Arrays.asList(1.5, 2.5, 3.5, 4.5, 5.5);
		int sum = doubles.stream().mapToInt(Double::intValue).sum();
		
		int[] array = doubles.stream().mapToInt(Double::intValue).toArray();
		for (int i : array) {
			System.out.println(i);
		}
		System.out.println("sum of the given values are :: " + sum);
	}

	public static void maptoIntAsciiSum4() {
		List<Character> chars = Arrays.asList('a', 'b', 'c');
		int sum = chars.stream().mapToInt(c -> (char) c).sum();
		
		int[] array = chars.stream().mapToInt(c -> (char) c).toArray();
		
		for (int i : array) {
			System.out.println(i);
		}
		
		System.out.println("Sum of the ascii values are :: " + sum);
	}

	public static void maptoIntAvg5() {
		List<Double> asList = Arrays.asList(1.5, 2.5, 3.5, 4.5, 5.5);
		double avg = asList.stream().mapToInt(Double::intValue).average().orElse(0);
		System.out.println("Average of the given numbers are :: " + avg);

	}

	public static void mapToIntAll() {
		List<String> asList = Arrays.asList("1", "2", "3", "4", "5"); // 01]Convert string to integer sum/avg/max/min
		List<String> words = Arrays.asList("apple", "banana", "cherry");// 02]Calculate string length and max length
																		// word
		List<Double> doubles = Arrays.asList(1.5, 2.5, 3.5, 4.5, 5.5); // 03]Calculate double sum
		List<Character> chars = Arrays.asList('a', 'b', 'c'); // 05]Calculate ascii sum
		List<Double> asList1 = Arrays.asList(1.5, 2.5, 3.5, 4.5, 5.5);// 06]Calculate double average

		// 1st note :: summaryStatistics()
		// ==>getMax(),getMin(),getSum(),getAverage(),getCount()
		int sum = asList.stream().mapToInt(Integer::parseInt).sum();
		System.out.println("sum :: " + sum);
		double average = asList.stream().mapToInt(Integer::parseInt).summaryStatistics().getAverage();
		System.out.println("sum :: " + average);
		int max = asList.stream().mapToInt(Integer::parseInt).summaryStatistics().getMax();
		System.out.println("max :: " + max);
		int min = asList.stream().mapToInt(Integer::parseInt).summaryStatistics().getMin();
		System.out.println("min :: " + min);
		long sum2 = asList.stream().mapToInt(Integer::parseInt).summaryStatistics().getSum();
		System.out.println("sum2 :: " + sum2);
		long count = asList.stream().mapToInt(Integer::parseInt).summaryStatistics().getCount();
		System.out.println("count :: " + count);

		// 2nd note :: max(), min(), sum(), average(), count()
		int orElse = words.stream().mapToInt(String::length).max().orElse(0);			System.out.println("max length string is :: " + orElse);
		int orElse2 = words.stream().mapToInt(String::length).min().orElse(0);   		System.out.println("min length string is :: " + orElse2);
		
		
		//3rd max(), min(), sum(), average(), count()
		int sum3 = doubles.stream().mapToInt(Double::intValue).sum();System.out.println(sum3);
		
		//4th  Sum of the ascii values are  note :: max(), min(), sum(), average(), count()
		int sum4 = chars.stream().mapToInt(c->(char)c).sum();System.out.println(sum4);


	}

	public static void main(String[] args) {
//		List<String> strings = Arrays.asList("1", "2", "3", "4", "5");
//
//		strings.stream().mapToInt(Integer::parseInt).sum(); // or
//		IntSummaryStatistics statistics = strings.stream().mapToInt(Integer::parseInt).summaryStatistics();
//
//		System.out.println(statistics.getAverage());
//		System.out.println(statistics.getCount());
//		System.out.println(statistics.getMax());
//		System.out.println(statistics.getMin());
//		System.out.println(statistics.getSum());

//		maptoInt1();
//		maptoInt2();
//		maptoInt3();
		maptoIntAsciiSum4();
//		maptoIntAvg5();
//
//		System.out.println("--------------------------mapToIntAll------------------------------");
//		mapToIntAll();
	}

}
