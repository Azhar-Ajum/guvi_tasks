package task5;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {


		Scanner s = new Scanner(System.in);
		System.out.println("please enter your date of birth in yyyy/mm/dd");
		
		String date = s.nextLine();
		
		LocalDate birthdate = LocalDate.parse(date);
		
		LocalDate now = LocalDate.now();
		
		Period age = Period.between(birthdate, now);
		
		System.out.println("Your age is "+age.getYears()+" years " + age.getMonths()+" months "+age.getDays()+" 1days " );
		
		s.close();
	}

}
