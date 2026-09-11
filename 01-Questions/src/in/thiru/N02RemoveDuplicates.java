package in.thiru;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

/*
  2) How do you remove duplicate elements from a list using Java 8 streams?
  
 1]using distinct method
 2]Collectors.toCollection(LinkedHashSet :: new)
 3]Collectors.toCollection(TreeSet :: new)
 */
public class N02RemoveDuplicates {

	public static void main(String[] args) {

//		practice1();

		List<Integer> asList = Arrays.asList(10, 20, 50, 22, 23, 23, 10);
		List<Integer> collect = asList.stream().distinct().collect(Collectors.toList());
		
		
		System.out.println("using distinct :: " + collect);
		LinkedHashSet<Integer> collect2 = asList.stream().collect(Collectors.toCollection(LinkedHashSet::new));
		
		
		System.out.println("using LinkedHashSet :: " + collect2);
		TreeSet<Integer> collect3 = asList.stream().collect(Collectors.toCollection(TreeSet::new));
		System.out.println("using TreeSet :: " + collect3);

	}

	private static void practice1() {
		// method-1
		System.out.println("method-1");
		List<Integer> asList = Arrays.asList(10, 20, 50, 22, 23, 23, 10);
		List<Integer> unique = asList.stream().distinct().collect(Collectors.toList());
		System.out.println(unique);

		// method-2
		System.out.println("method-2");
		List<Integer> asList2 = Arrays.asList(11, 11, 22, 33, 44, 55, 22);
		LinkedHashSet<Integer> collect = asList2.stream().collect(Collectors.toCollection(LinkedHashSet::new));
		System.out.println(collect);

		// method-3
		System.out.println("method-3");
		TreeSet<Integer> collect2 = asList2.stream().collect(Collectors.toCollection(TreeSet::new));
		System.out.println(collect2);
	}

}
