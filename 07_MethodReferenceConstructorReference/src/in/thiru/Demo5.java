package in.thiru;

import java.util.Arrays;


//✅ Example 5: Reference to an instance method of an arbitrary type
public class Demo5 {
	public static void main(String[] args) {
		String[] names = { "Thiru", "Hello", "Guru" };
		Arrays.sort(names, String::compareToIgnoreCase); // Method reference
		for (String n : names)
			System.out.println(n);
	}

}
