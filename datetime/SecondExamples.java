package datetime;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class SecondExamples {
	
	public boolean isTodayAfterTomorrow(){
		LocalDate today = LocalDate.now();
		LocalDate tomorrow = today.plusDays(1);
		return tomorrow.isAfter(today);
	}
	
	public int howManyDaysUntilLongestDayOfTheYear() {
		LocalDate today = LocalDate.now();
		LocalDate longestDay = today.with(Month.JUNE).withDayOfMonth(21);
		return Period.between(today, longestDay).getDays();
		
	}
	//Some date formatting
	public String formatSimpleDate() {
		return LocalDate.now().format(DateTimeFormatter.ISO_DATE);
		
	}
	//mm/dd/yy format
	public String formatMonthDayYear() {
		return LocalDate.now().format(DateTimeFormatter.ofPattern("MM/DD/yyyy"));
	}
	
    public void printdata() {
    	System.out.println(isTodayAfterTomorrow());
		System.out.println(howManyDaysUntilLongestDayOfTheYear());
		System.out.println(formatSimpleDate());
		System.out.println(formatMonthDayYear());
	}
}
