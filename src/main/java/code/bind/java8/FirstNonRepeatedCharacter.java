package code.bind.java8;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacter {
	public static void main(String[] args) {
		System.out.println("First Problem");
		
		String input = "abacbcade";
		Character firstNonRepeatedChar = logic(input);
		System.out.println("firstNonRepeatedChar : " + firstNonRepeatedChar);
		
		System.out.println("Second Problem");
		String CitiesInCommaSeperated = "Mumbai,Chennai,Ahmedabad,Delhi,Kolkatta";
		String[] citiesArray = CitiesInCommaSeperated.split(",");
		countsOfRepeatedCharBasedOnCities(citiesArray);
		
		
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
	
	public static TreeMap<String, Map<Character, Integer>> countsOfRepeatedCharBasedOnCities(String[] citiesArray) {
		TreeMap<String, Map<Character, Long>> citiesMap = new TreeMap<String, Map<Character, Long>>();

		for (String city : citiesArray) {

			Map<Character, Long> hm = city.toLowerCase().chars().mapToObj(ch -> (char) ch)
					.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
					.entrySet().stream()
					.filter(entry -> entry.getValue() != 1L)
					.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

			citiesMap.put(city, hm);

		}

		System.out.println(citiesMap);
		return null;

	}
	
}
