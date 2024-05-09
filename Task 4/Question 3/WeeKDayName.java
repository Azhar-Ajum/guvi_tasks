package task4;

import java.util.Scanner;

public class WeeKDayName {
	
	

	public static void main(String[] args) {
		
		String[] weekday = {"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter day from 0-6");
		int day = s.nextInt();
		
		try {
			String name = getday(weekday , day);
			System.out.println("Day name "+ name);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Error please enter number between 0 -6");
			
		}
		s.close();



	}
	
	public static String getday(String[] weekday,int index) {
		return weekday[index];
	}

}
