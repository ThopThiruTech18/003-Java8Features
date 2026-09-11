package in.thiru;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
  6) Given a list of strings, join the strings with ‘[‘ as prefix, ‘]’ as suffix and ‘,’ as delimiter?
  O/P==> [thiru,charan,vinay,chandu,raju]
 */
public class N06JoinStringPrifixAndSuffixUsingStringJoiner {
	
	public static void main(String[] args) {
		practice1();
		
		
		
		
		
	}

	private static void practice1() {
		List<String> asList = Arrays.asList("thiru","charan","vinay","chandu","raju");
		String joining = asList.stream().collect(Collectors.joining(",", "[", "]"));
		System.out.println(joining);
		
		String collect2 = asList.stream().collect(Collectors.joining(",", "{", "}"));
		System.out.println(collect2);
		
		String collect3 = asList.stream().collect(Collectors.joining(",", "(", ")"));
		System.out.println(collect3);
		
		String collect4 = asList.stream().collect(Collectors.joining(",", "<", ">"));
		System.out.println(collect4);
	}

}
