package no03.peek;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PeekSideEffect {
	
	public static void main(String[] args) {
		 AtomicInteger counter = new AtomicInteger();
	        Stream.of("A", "B", "C")
	              .peek(x -> counter.incrementAndGet())
	              .forEach(System.out::println);
	        System.out.println("Total elements processed: " + counter.get());
//	        
//	        
//	        
//	        // 2️⃣
	        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
	        AtomicInteger sum = new AtomicInteger();
	        numbers.stream()
	               .peek(n -> sum.addAndGet(n))
	               .forEach(System.out::println);
	        
	        System.out.println(sum.get());
//	        
//	        
//	        
//
//	     // 3️⃣
//	     List<String> words = List.of("apple", "banana", "cherry");
//	     List<String> log = new ArrayList<>();
//	     words.stream()
//	          .peek(log::remove)
//	          .toList();
//	     System.out.println(log);
//	     
//	     
//
//	  // 4️⃣
//	  AtomicInteger oddCount = new AtomicInteger();
//	  IntStream.rangeClosed(1, 10)
//	           .peek(i -> { if (i % 2 != 0) oddCount.incrementAndGet(); })
//	           .forEach(System.out::println);
//	
//	// 5️⃣
//	  List<String> data = List.of("Thiru", "Hari", "Ravi");
//	  AtomicInteger len = new AtomicInteger();
//	  data.stream()
//	      .peek(s -> len.addAndGet(s.length()))
//	      .toList();
	  
	  
	// 6️⃣
//	  List<Double> salary = List.of(1000.0, 2000.0, 3000.0);
//	  AtomicReference<Double> total = new AtomicReference<>(0.0);
//	  salary.stream()
//	        .peek(s -> total.updateAndGet(v -> v + s))
//	        .toList();
		
		
		
	}

}
