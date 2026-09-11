package in.thiru;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class N04FreqOfEachElementInArrayList {
	
	public static void main(String[] args) {
		
		List<Integer> asList = Arrays.asList(10,20,30,40,80,10);
		Map<Integer, Long> collect = asList.stream().collect(Collectors.groupingBy(z->z,HashMap::new,Collectors.counting()));
		System.out.println(collect);
		
	}

}
