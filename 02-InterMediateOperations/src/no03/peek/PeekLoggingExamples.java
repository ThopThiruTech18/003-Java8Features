package no03.peek;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PeekLoggingExamples {

	public static void main(String[] args) {
		method1();
//
//		method2();
//
//		method3();

//		method4();

//		method5();

//		method6();

//		method7();
//
//		method8();
//
//		method10();

	}

	private static void method10() {
		// 🔟
		Stream.of("SQL", "MongoDB", "Redis").peek(db -> System.out.println("Database: " + db))
				.forEach(System.out::println);
	}

	private static void method8() {
		// 9️⃣
		List.of(10, 20, 30).stream().peek(num -> System.out.println("Number: " + num)).forEach(System.out::println);
	}

	private static void method7() {
		// 7️⃣
		Stream.of("apple", "banana", "cherry").peek(f -> System.out.println("Fruit: " + f)).count();
	}

	private static void method6() {
		// 6️⃣
		List.of("red", "green", "blue").stream().peek(c -> System.out.println("Color: " + c))
				.forEach(System.out::println);
	}

	private static void method5() {
		// 5️⃣
		IntStream.rangeClosed(1, 5).peek(System.out::println).forEach(i -> {
		});

		IntStream.rangeClosed(1, 5).peek(s -> System.out.println("Input numbers are : " + s)).forEach(i -> {
		});
	}

	private static void method4() {
		// 4️⃣
//		Stream.of(1, 2, 3, 4, 5)
//		      .peek(System.out::println)
//		      .map(n -> n * 2)
//		      .forEach(System.out::println);

		Stream.of(1, 2, 3, 4, 5).peek(s -> System.out.println("Multiplication of the 2 is : " + s)).map(n -> n * 2)
				.forEach(System.out::println);
	}

	private static void method3() {
		// 3️⃣
		List<String> names = List.of("Thiru", "Hari", "Ravi", "Sai", "Teja");
		names.stream().filter(x -> x.startsWith("T")).peek(x -> System.out.println("Filtered: " + x))
				.forEach(System.out::println);
	}

	private static void method2() {
		// 2️⃣
		List<String> names = List.of("Thiru", "Hari", "Ravi", "Sai", "Teja");
		AtomicInteger count = new AtomicInteger(0);
		names.stream().peek(x -> System.out.println((count.getAndIncrement()) + " : Name: " + x))
				.forEach(System.out::println);
	}

	private static List<String> method1() {
		List<String> names = List.of("Thiru", "Hari", "Ravi", "Sai", "Teja");

		// 1️⃣
//		names.stream().peek(System.out::println).count();

//		names.stream().peek(System.out::println).forEach(n -> {
//		}); 
		
		names.stream().peek(System.out::println).forEach(n -> System.out.println("Processed: " + n));
		return names;
	}

}
