package tasks1;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("please enter the number");
		int a = s.nextInt();
		
		if(a<0) {
			System.out.println("Entered number is negative "+ a);
		}
		else {
			System.out.println("Entered number is positive "+a);
		}

	}

}
