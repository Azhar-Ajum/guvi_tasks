package task4;

public class Voter {
	int voterid;
	String name;
	int age;
	
	
	public Voter(int voterid, String name, int age) throws InvalidVoterAgeException {
		
		this.voterid=voterid;
		
		this.name=name;
		if(age<18) {
			throw new InvalidVoterAgeException("Invalid Age for Voter "+ name);
		}
		this.age= age;
		}
	
	public void displayinfo() {
		System.out.println("Voter name : "+ name);
		System.out.println("Voter id : "+ voterid);
		System.out.println("voter age : "+ age);
	}

}
