package in.thiru1;

import java.util.Arrays;
import java.util.function.IntFunction;

public class Demo05 {

	public static void main(String[] args) {
		IntFunction<int[]> arrayCreator = int[]::new; // Array constructor reference
		int[] arr = arrayCreator.apply(5);
		Arrays.fill(arr, 100);
		System.out.println(Arrays.toString(arr));
	}

}
