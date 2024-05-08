package tasks1;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter three numbers");
		
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		
		if((a<b)&&(a<c)) {
			System.out.println("smallest number is "+ a);
		}
		else if((b<a)&&(b<c)) {
			System.out.println("smallest number is "+ b);
		}else {
			System.out.println("smallest number is "+ c);
		}
		

	}

}
