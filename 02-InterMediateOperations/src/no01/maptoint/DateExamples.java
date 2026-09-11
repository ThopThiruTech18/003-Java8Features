package no01.maptoint;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DateExamples {
	
	
	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();
		LocalDate tomorrow = LocalDate.now().plusDays(1);
		LocalDate dayAfterTomorrow = LocalDate.now().plusDays(2);
		System.out.println(today);
		System.out.println(tomorrow);
		System.out.println(dayAfterTomorrow);
		
		List<LocalDateTime> dates = Arrays.asList(LocalDateTime.now(), LocalDateTime.now().plusDays(1), LocalDateTime.now().plusDays(2));
		List<String> formattedDates = dates.stream().map(date -> date.format(DateTimeFormatter.ISO_DATE_TIME)).collect(Collectors.toList());
		System.out.println("Formatted Dates: " + formattedDates);
		
	}

}
