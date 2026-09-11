package in.thiru;

import java.util.function.BiFunction;

public class Demo4 {

	public static int add(int a, int b) {
		return a + b;
	}

//	✅ Example 3: Reference to an instance method of an arbitrary object
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> adder = Demo4::add;
		System.out.println("Sum: " + adder.apply(10, 20));
	}

}
