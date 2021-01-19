package datetime;

import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


public class FirstExamples {
  //Create a simple Date - June 5th 1988
	public LocalDate getdate() {
		return LocalDate.of(1988,Month.JUNE,5);
		
	}
	
 //create a sample time - 13:51
	public LocalTime getlocaltime() {
		return LocalTime.of(13, 51);
	}
	
//Create a sample localdate of the above
	public LocalDateTime getSampledatetime() {
		return LocalDateTime.of(getdate(), getlocaltime());
		
	}
//convert from localdatetime to localdate
	public LocalDate getTodayFromLocalDateTime() {
		return LocalDateTime.now().toLocalDate();
	}
//get difference between kolkata and paris
	public int getDifference() {
		ZonedDateTime paris = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
		ZonedDateTime kolkata = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
		return kolkata.getHour()-paris.getHour();
	}
	public void printdata() {
		System.out.println(getdate());
		System.out.println(getlocaltime());
		System.out.println(getSampledatetime());
		System.out.println(getTodayFromLocalDateTime());
		System.out.println(getDifference());
	}
}
