package task2;

public class Account {

	 private double balance;


	      public Account() {
		        this.balance = 0;
		    }
		    
		   
		    public Account(double intbalance) {
		        this.balance = intbalance;
		    }
		    
		    
		    public void deposit(double amount) {
		        if (amount > 0) {
		            balance += amount;
		            System.out.println("You amount deposited successfully.");
		        } else {
		            System.out.println("Invalid amount. Please enter correct amount");
		        }
		    }
		    
		   
		    public void withdraw(double amount) {
		        if (amount > 0 && amount <= balance) {
		        	balance = balance - amount;
		            System.out.println(amount + " Your amount withdrawn successfully.");
		            
		        } else {
		            System.out.println("Insufficient balance");
		        }
		    }
		    
		   
		    public void display() {
		        System.out.println("Current Balance: " + balance);
		    }
		    
		    
		    public static void main(String[] args) {
		    	
		    	
		    	Account a1 = new Account();
		    	
		    	a1.deposit(5000);
		    	a1.display();
		    	a1.withdraw(1000);
		    	
		    	Account a2 = new Account(3000.00);
		    	
		    	a2.display();
		    	a2.withdraw(2000);
		    	a2.display();
		    	
		
		
	}
}

