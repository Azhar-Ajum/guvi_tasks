package task4;

public class StackDataSructure {
	
	int max;
	int [] stackdata;
	int top;
	
	public StackDataSructure(int max) {
		this.max=max;
		this.stackdata=new int[max];
		this.top=-1;
		}
	
	public void push(int num) {
		if(isFull()) {
			System.out.println("Stack is full");
		}
		else {
			stackdata[++top] = num;
			System.out.println("Number added(pushed) "+ num);
		}
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}
		else {
			int num = stackdata[top--];
			System.out.println("number is poped "+ num);
			return num;
		}
		
	}
	
	public boolean isFull() {
		return (top==max-1);
	}
		
		public boolean isEmpty() {
			return (top==-1);
		}

	public static void main(String[] args) {
		
		StackDataSructure s = new StackDataSructure(3);
		
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		
		s.pop();
		
		

	}

}
