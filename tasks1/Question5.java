package tasks1;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("please enter your amount");
		int a=s.nextInt();
		
		if(a<=0) {
			System.out.println("enter valid amount");
		}
		else if(a<=500) {
			System.out.println("There is no discount "+a);
		}
		else if(a>500&&a<1000) {
			int d =10;
			double b =a*(d/100.0);
			double t = a-b;
			System.out.println("your amount after 10% discount "+t);
		}
		else if(a>1000) {
			int d=20;
			double b =a*(d/100.0);
			double t = a-b;
			System.out.println("your amount after 20% discount  "+t);
		}
	}

}
