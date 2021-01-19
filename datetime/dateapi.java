package datetime;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

public class dateapi {
      public static void main(String args[]) {
    	  //present date
    	  LocalDate d = LocalDate.now();
    	  System.out.println(d);
    	  
    	  //specific date
    	  LocalDate e = LocalDate.of(1990,Month.DECEMBER,21);
    	  System.out.println(e);
    	  
    	  //local time
    	  LocalTime t = LocalTime.now();
    	  System.out.println(t);
    	  
    	  //local time based on zone id
    	  LocalTime r = LocalTime.now(ZoneId.of("Asia/Kolkata"));
    	  System.out.println(r);
    	  
    	  //using both date and time
    	  LocalDateTime s = LocalDateTime.now();
    	  System.out.println(s);
      }
}
