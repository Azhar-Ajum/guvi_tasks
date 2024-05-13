package task5;

import java.util.Arrays;
import java.util.List;

public class Question2 {

	public static void main(String[] args) {
		
		
		List<String> liststrings = Arrays.asList("abc","","bc","efg","abcd","","jkI");
		
		liststrings.stream().filter(str -> !str.isEmpty()).forEach(System.out::println);
		
	}

}
