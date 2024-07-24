package code.bind.java8;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacter {
	public static void main(String[] args) {
		String input = "abacbcade";
		Character firstNonRepeatedChar = logic(input);
		System.out.println("firstNonRepeatedChar : " + firstNonRepeatedChar);
		
		
	}
	
	private static Character logic(String input) {
		  Character result =  input.chars()           // IntStream
		             .mapToObj(i -> (char) i) // convert to lowercase & then to Character object Stream
		             .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) // store in a LinkedHashMap with the count
		             .entrySet().stream()                       // EntrySet stream
		             .filter(entry -> entry.getValue() == 1L)   
		             .map(entry -> entry.getKey())              
		             .findFirst().get();                        
		        
		         return result;    
	}
	
}
