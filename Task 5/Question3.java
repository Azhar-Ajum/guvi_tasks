package task5;

import java.util.ArrayList;
import java.util.List;

public class Question3 {

	public static void main(String[] args) {


		List<String> name = new ArrayList<>();
		name.add("azhar");
		name.add("ajum");
		name.add("hanifa");
		name.add("taj");
		
		name.stream().filter(a -> a.startsWith("a")).forEach(System.out::println);

	}

}
