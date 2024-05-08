package task2;

import java.util.Scanner;

public class XYZ {

	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		 
		
		Product[] products = new Product[5];
	        for (int i = 0; i < 5; i++) {
	            System.out.println("Please Enter information for product " + (i+1) + ":");
	            System.out.print("Product ID: ");
	            int pid = s.nextInt();
	            System.out.print("Price: ");
	            double price = s.nextDouble();
	            System.out.print("Quantity: ");
	            int quantity = s.nextInt();
	            products[i] = new Product(pid, price, quantity);
	        }
	        
	        int highPricePid = highestpriceproductpid(products);
	        System.out.println("PID of the product with the highest price: " + highPricePid);
	        
	        
	        double totalAmountSpent = totalamountspent(products);
	        System.out.println("Total amount spent on all products: " + totalAmountSpent);
	        
	        
	        s.close();
	}
	
	 private static int highestpriceproductpid(Product[] products) {
	        double maxPrice = Double.MIN_VALUE;
	        int highestPricePid = 0;
	        for (Product product : products) {
	            if (product.price > maxPrice) {
	                maxPrice = product.price;
	                highestPricePid = product.pid;
	            }
	        }
	        return highestPricePid;
	    }
	 
	 
	 private static double totalamountspent(Product[] products) {
	        double totalamountspent = 0;
	        for (Product product : products) {
	            totalamountspent += product.price * product.quantity;
	        }
	        return totalamountspent;
	    }
	

}
