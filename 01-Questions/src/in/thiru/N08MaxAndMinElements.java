package in.thiru;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/*
 8) Given a list of integers, find maximum and minimum of those numbers?
 
 Note:: we can find max values and min values 2 ways
       1] i)using  ==> Collectors.minBy(Comparator.naturalOrder() 	==> only min
  		  ii)using  ==> Collectors.minBy(Comparator.reverseOrder() 	==> only max
  	   2]i)using ==> sorted(Comparator.reverseOrder()).findFirst()  ==> we can find 1st,2nd,3rd,4th....values max values, just sort and skip
  	   2]i)using ==> sorted(Comparator.naturalOrder()).findFirst()  ==> we can find 1st,2nd,3rd,4th....values max values, just sort and skip
 
  

 */
public class N08MaxAndMinElements {
	
	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(10,20,5,2,10,80); //2,5,10,10,20,80==> 80,20,10,10,5,2
		
		//Method-1
		Optional<Integer> min = asList.stream().collect(Collectors.minBy(Comparator.naturalOrder()));
		Optional<Integer> max = asList.stream().collect(Collectors.maxBy(Comparator.naturalOrder()));
		System.out.println(min.get());
		System.out.println(max.get());
		
		//Method-2
		Optional<Integer> min1 = asList.stream().sorted().findFirst();
		Optional<Integer> max1 = asList.stream().sorted(Comparator.reverseOrder()).findFirst();
		System.out.println(min1.get());
		System.out.println(max1.get());
		
	}

}
