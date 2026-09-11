package no03.peek;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PeekDebuggingExample {
	public static void main(String[] args) {
		
		
		method1();
		
		
//		method2();
		
		
//		method3();
		
		
//		method4();
		
		
//		method5();
		
		
//		method6();
		
		
//		method7();
		
		
//		method8();
		
		
//		method9();
		

//		method10();

	}

	private static void method10() {
		// 🔟
		List<String> langs = List.of("Java", "Python", "Go");
		langs.stream()
		     .peek(l -> System.out.println("Lang: " + l))
		     .filter(l -> l.length() > 3)
		     .peek(l -> System.out.println("Filtered: " + l))
		     .toList();
	}

	private static void method9() {
		// 9️⃣
		Stream.of(5, 10, 15)
		      .peek(n -> System.out.println("Input: " + n))
		      .map(n -> n + 1)
		      .peek(n -> System.out.println("After +1: " + n))
		      .forEach(System.out::println);
	}

	private static void method8() {
		// 8️⃣
		Stream.of("dog", "cat", "rat")
		      .peek(s -> System.out.println("Check: " + s))
		      .map(String::toUpperCase)
		      .peek(s -> System.out.println("Upper: " + s))
		      .count();
	}

	private static void method7() {
		// 7️⃣
		Stream.of("alpha", "beta", "gamma")
		      .peek(s -> System.out.println("Before Trim: " + s))
		      .map(String::trim)
		      .peek(s -> System.out.println("After Trim: " + s))
		      .toList();
	}

	private static void method6() {
		// 6️⃣
		List<Double> prices = List.of(100.0, 200.0, 300.0);
		prices.stream()
		      .peek(p -> System.out.println("Original: " + p))
		      .map(p -> p * 0.9)
		      .peek(p -> System.out.println("After Discount: " + p))
		      .toList();
	}

	private static void method5() {
		// 5️⃣
		IntStream.range(1, 6)
		         .peek(i -> System.out.println("Before Square: " + i))
		         .map(i -> i * i)
		         .peek(i -> System.out.println("After Square: " + i))
		         .sum();
	}

	private static void method4() {
		// 4️⃣
		List<String> users = List.of("Ram", "Ravi", "Raju");
		users.stream()
		     .peek(u -> System.out.println("User: " + u))
		     .map(String::toUpperCase)
		     .peek(u -> System.out.println("Upper: " + u))
		     .toList();
	}

	private static void method3() {
		// 3️⃣
		Stream.of(10, 20, 30, 40)
		      .peek(n -> System.out.println("Original: " + n))
		      .map(n -> n + 5)
		      .peek(n -> System.out.println("After Add: " + n))
		      .map(n -> n * 2)
		      .peek(n -> System.out.println("After Multiply: " + n))
		      .toList();
	}

	private static void method2() {
		// 2️⃣
		Stream.of("one", "two", "three", "four")
		      .peek(s -> System.out.println("Initial: " + s))
		      .filter(s -> s.length() > 3)
		      .peek(s -> System.out.println("Filtered: " + s))
		      .map(String::toUpperCase)
		      .peek(s -> System.out.println("Mapped: " + s))
		      .toList();
	}

	private static void method1() {
		List<Integer> list = List.of(2, 4, 6, 8, 10);

		// 1️⃣
		List<Integer> list2 = list.stream()
		    .peek(x -> System.out.println("Before filter: " + x))
		    .filter(x -> x > 5)
		    .peek(x -> System.out.println("After filter: " + x))
		    .map(x -> x * 2)
		    .peek(x -> System.out.println("After map: " + x))
		    .toList();
		
		
		

		
//		System.out.println(list2);
	}

}
