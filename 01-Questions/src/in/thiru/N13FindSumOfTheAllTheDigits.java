package in.thiru;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
/*
Find sum of all digits of a number:
 */
public class N13FindSumOfTheAllTheDigits {
	
	public static void main(String[] args) {
		
	int number=123456;
	//method-1
	IntStream map = String.valueOf(number).chars().map(Character::getNumericValue);
	System.out.println(map);
	System.out.println(map.sum());
	System.out.println(map.average());
	
	//method-2
	
	IntSummaryStatistics statistic = String.valueOf(number).chars().map(Character::getNumericValue).summaryStatistics();
	System.out.println(statistic.getSum());
	System.out.println(statistic.getAverage());
	System.out.println(statistic.getMax());
	System.out.println(statistic.getMin());
	System.out.println(statistic.getCount());
		
		
	}

}
