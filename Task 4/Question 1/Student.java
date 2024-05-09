package task4;

public class Student {
	
	int rollno;
	String name;
	int age;
	String course;
	
	public  Student(int rollno, String name, int age, String course) throws AgeNotWithinRangeExeption, NameNotValidException {
		this.rollno=rollno;
		if(!isvalidname(name)){
			throw new NameNotValidException("Name is not valid");
			
		}
		
		this.name=name;
		if(!isvalidage(age)) {
			throw new AgeNotWithinRangeExeption("Age is not valid");
		}
		this.age=age;
		this.course=course;
	}
	
	boolean isvalidage(int age) {
		return age >=15 && age<=21;
	}
	
	boolean isvalidname(String name) {
		return name.matches("[a-zA-Z]+");
	}
	
	public void displayinfo() {
		System.out.println("Student name : "+ name);
		System.out.println("Student roll number : "+ rollno);
		System.out.println("Student age :"+ age);
		System.out.println("Student course :"+ course);
	}

	

}
