package task4;

import java.util.HashMap;

public class StudentGradeSystem {
	
	HashMap<String, Integer> grade ;
	
	public StudentGradeSystem() {
		this.grade = new HashMap<>();
	}
	
	public void addstudent(String name , int grades) {
		grade.put(name,grades);
		
		System.out.println("student name and garde successfully added for student "+ name);
	}
	
	public void remove(String name) {
		if(grade.containsKey(name)) {
			grade.remove(name);
			System.out.println("Student  "+ name +"  removed sucessfully");
		}
		else {
			System.out.println("Name not found");
		}
		
	}
	
	public void display(String name) {
		if(grade.containsKey(name)) {
			System.out.println("Student name : "+ name + "  garde : "+ grade.get(name));
		}
		else {
			System.out.println("Name not found");
		}
	}

	public static void main(String[] args) {
		
		StudentGradeSystem g = new StudentGradeSystem();
		g.addstudent("azhar", 1);
		g.addstudent("Ajum", 2);
		
		g.remove("Ajum");
		
		g.display("azhar");
		

	}

}
