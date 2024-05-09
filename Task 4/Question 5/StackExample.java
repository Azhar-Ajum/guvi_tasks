package task4;

import java.util.Iterator;
import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		
		
        Stack<Integer> s = new Stack<Integer>();
		
		s.push(10);
		s.push(11);
		s.push(12);
		s.push(13);
		s.push(14);
		s.push(15);
		s.push(16);
		
		s.pop();
		s.pop();
		
		System.out.println(s.isEmpty())
		;
		Iterator i = s.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
