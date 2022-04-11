

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;


public class Homage {
	

	public static void main(String[] args) {
	    

		LocalDate birthDate = LocalDate.of(2002, 6, 11);
		LocalDate today = LocalDate.now();
		int years = Period.between(birthDate ,today  ).getYears() ;
		int Months = Period.between(birthDate ,today  ).getMonths() ;
		int Days = Period.between(birthDate ,today  ).getDays() ;
		
		
		
		System.out.println("Today :"+today);
		System.out.println("BirthDate :"+birthDate);
		System.out.println("Years:"+years +" Months:" + Months + " Days:" + Days );
	
		

		
	}

}
