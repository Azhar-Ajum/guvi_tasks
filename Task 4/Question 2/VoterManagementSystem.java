package task4;

public class VoterManagementSystem {

	public static void main(String[] args) {


		try {
			Voter v1 = new Voter(1,"Azhar",18);
			v1.displayinfo();
			
			Voter v2 = new Voter(2,"ajum",15);
			v2.displayinfo();
		}
		catch(InvalidVoterAgeException e) {
			System.out.println("Exception "+e.getMessage());
			e.printStackTrace();
		}

	}

}
