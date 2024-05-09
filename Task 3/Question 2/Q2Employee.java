package task3;

public class Q2Employee implements Q2Taxable {
	
	int eid;
	String name;
	double salary;
	
	public Q2Employee(int eid,String name,double salary) {
		this.eid=eid;
		this.name=name;
		this.salary=salary;
	}

	
	public double calctax() {
		
		return salary*incometax;
	}

}
