package task3;

import java.util.Scanner;

public class Q2DriverMain {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter employee imformation : \n");
		
		System.out.println("enter employee id :");
		int eid =s.nextInt();
		
		System.out.println("enter employee name :");
		String name =s.next();
		
		System.out.println("enter employee salary : ");
		double salary = s.nextDouble();
		
		Q2Employee e = new Q2Employee(eid,name,salary);
		double itax = e.calctax();
		
		
		System.out.println("Enter product imformation \n");
		
		System.out.println("enter product id :");
		int pid =s.nextInt();
		
	    System.out.println("Enter price of the product : ");
	    double price = s.nextDouble();
	    
	    System.out.println("Enter quanity of the product : ");
	    int quantity = s.nextInt();
	    
	    Q2Product p = new Q2Product(pid,price,quantity);
	   double stax = p.calctax();
	   
	   System.out.println("Income tax :"+ itax);
	   System.out.println("Sales tax :"+ stax);
	   s.close();
		
		
	}

}
