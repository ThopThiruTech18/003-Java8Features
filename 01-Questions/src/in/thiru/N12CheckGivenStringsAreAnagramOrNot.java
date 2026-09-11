package in.thiru;

import java.util.List;
import java.util.stream.Collectors;

public class N12CheckGivenStringsAreAnagramOrNot {
	
	public static void main(String[] args) {
		String name1="listen";
		String name2="silent";
	    
		List<Integer> collect1 = name1.chars().sorted().boxed().collect(Collectors.toList());
		
		List<Integer> collect2 = name2.chars().sorted().boxed().collect(Collectors.toList());
		
		
		
		if(collect1.equals(collect2))
		{
			System.out.println("anagram");
		}
		else
		{
			System.out.println("not anagram");
		}
	}

}
