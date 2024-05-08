package task2;

public class Q4Employee extends Q4Person {
	
	 int eid;
	 int salary;
	
	
	 public Q4Employee(String name, int age, int eid, int salary) {
	        super(name , age);
	        this.eid = eid;
	        this.salary = salary;
	    }
	 
	 public void displayemplyeedetails() {
		 super.displaydetails();
		 System.out.println("Employee id : "+ eid);
		 System.out.println("salary : "+ salary);
	 }

	public static void main(String[] args) {
		
		
		Q4Employee e1 = new Q4Employee("Azhar",26,12,20000);
		e1.displayemplyeedetails();
		
		

	}

}
