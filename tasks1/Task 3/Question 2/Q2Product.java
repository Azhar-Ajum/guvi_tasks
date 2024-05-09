package task3;

public class Q2Product implements Q2Taxable {

	int pid;
	double price;
	int quantity;

	public Q2Product(int pid, double price , int quantity) {
		this.pid=pid;
		this.price=price;
		this.quantity=quantity;
	}
	
	
	public double calctax() {
		
		return (quantity*price)*salestax;
	}
	

}
