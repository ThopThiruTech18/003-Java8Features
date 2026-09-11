package in.thiru;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
 1) Given a list of integers, separate odd and even numbers?
 */
public class N01SeperateEvenOddNos {

	public static void seperateOddAndEven() {

		List<Integer> asList = Arrays.asList(12, 13, 15, 17, 22);

//		List<Integer> even = asList.stream().filter(f -> f % 2 == 0).collect(Collectors.toList());
//		List<Integer> odd = asList.stream().filter(f -> f % 2 != 0).collect(Collectors.toList());
//		System.out.println(even);
//		System.out.println(odd);

		Map<Boolean, List<Integer>> map = asList.stream().collect(Collectors.partitioningBy(s -> s % 2 == 0));

		System.out.println(map.get(true));
		System.out.println(map.get(false));

	}

	public static void main(String[] args) {

		seperateOddAndEven();
	}

}
