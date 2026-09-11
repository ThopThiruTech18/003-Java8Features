package in.thiru;

import java.util.Arrays;
import java.util.List;

public class Demo3 {

//	✅ Example 3: Reference to an instance method of an arbitrary object
	 public static void main(String[] args) {
	        List<String> names = Arrays.asList("thiru", "hello", "guru");
	        names.forEach(String::toUpperCase); // invalid (doesn't print)
	        names.forEach(System.out::println); // valid reference
	    }

}
