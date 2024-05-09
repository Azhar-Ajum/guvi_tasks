package task4;

public class StudentManagementSystem {

	public static void main(String[] args) {
		
		try {
			Student s1 = new Student(1,"azhar",18,"java");
			s1.displayinfo();
			
			
			Student s2 = new Student(2,"ajum",25,"c++");
			s2.displayinfo();
		}
		catch(AgeNotWithinRangeExeption  e) {
			System.out.println("Exception "+ e.getMessage());
			e.printStackTrace();
			
		}
		catch(NameNotValidException e1) {
			System.out.println("Exception "+ e1.getMessage());
			e1.printStackTrace();
		}

	}

}
