package tasks1;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		
		
		Scanner s =new Scanner(System.in);
		System.out.println("Please enter number to reverse");
		
		int a=s.nextInt();
		int r=0;
		
		while(a!=0) {
			int d = a%10;
			r = r*10+d;
			a= a/10;
		}
		
		System.out.println("Reversed number "+r);
	}

}
