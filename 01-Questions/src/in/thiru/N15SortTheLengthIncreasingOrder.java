package in.thiru;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class N15SortTheLengthIncreasingOrder {
	
	public static void main(String[] args) {
		
		
		List<String> asList = Arrays.asList("sunny","bunny","chinnii","thirumala");
		
		
		List<Integer> collect = asList.stream().map(s->s.length()).sorted().collect(Collectors.toList());
		System.out.println(collect);
		
		
	//sort the string elements in ascending order
	 List<String> ascending = asList.stream().sorted(Comparator.comparingInt(String::length)).collect(Collectors.toList());
	 List<String> descending = asList.stream().sorted(Comparator.comparingInt(String::length).reversed()).collect(Collectors.toList());
	 System.out.println(ascending);
	 System.out.println(descending);
	 
	
		
		
		
	}

}
