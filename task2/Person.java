package task2;

public class Person {
	
	int age =18;
	String name;
	
	public Person(String name) {
		this.name =name;
		this.age =18;
	}
	
	public Person(String name, int age) {
		this.age = age;
		this.name = name;
	}
      
      public void display() {
 		 System.out.println("Name and Age of person  " + name+ "  "  + age);
 	 }
     

	public static void main(String[] args) {
		
		Person p = new Person("azhar", 27);
		Person q = new Person("ajum");
		
		p.display();
		q.display();
		
		
		
		
		
		
		
	}

}
