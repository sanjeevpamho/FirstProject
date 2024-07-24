package code.bind.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Java8ArrayProblems {
	public static void main(String[] args) {
		int[] numbers = { 5, 2, 8, 3, 1, 1 };
		fetchSecondSmallest(numbers);

		System.out.println("*************************************");
		
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {4,5,6,7,8,1};
		fetchCommonElements(arr1, arr2);
		
		System.out.println("*************************************");
		int[] arrToReverse = {1,2,3,4,5};
		reverseArrayInPlace(arrToReverse);
		System.out.println("*************************************");
		fetchLengthOfLongestStringInArray(new String[] {"Apple","Apricot","Avacado","Watermelon","Mango"});
		System.out.println("*************************************");
		fetchDuplicateElements(new String[] {"code_Decode_Updated1","code_Decode_Updated2","code","decode","code","decode"});
		System.out.println("*************************************");
		int[] arr5 = {1,2,3,4,5};
		calculateSumOfNumbers(arr5);
		System.out.println("*************************************");
		String stringWithDupWords = "Welcome To India Welcome To Mumbai Welcome To Delhi";
		countWordsInString(stringWithDupWords);
	}

	private static void fetchSecondSmallest(int[] numbers) {
		int secondSmallestElement = Arrays.stream(numbers).distinct().sorted().skip(1).findFirst()
				.orElseThrow(() -> new IllegalArgumentException("Array doesn't have second smallest element"));
		System.out.println("secondSmallestElement : " + secondSmallestElement);

	}
	
	private static void fetchCommonElements(int[] arr1 , int[] arr2) {
		List<Integer> commonElements = Arrays.stream(arr1)
				.filter(number -> Arrays.stream(arr2).anyMatch(arr2Number -> arr2Number==number))
				.boxed().collect(Collectors.toList());
		System.out.println("commonElements : " + commonElements);
	}
	
	private static void reverseArrayInPlace(int[] arr) {
		IntStream.range(0, arr.length/2).forEach(i -> {
			int temp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = temp;
		});
        System.out.println("Reversed Array : " + Arrays.toString(arr));
	}
	
	private static void fetchLengthOfLongestStringInArray(String[] stringArray) {
	//	int maxLen = Arrays.stream(stringArray).mapToInt(string -> string.length()).max().orElse(0);
	    int maxLen = Arrays.stream(stringArray).mapToInt(String::length).max().orElse(0);
		System.out.println("maxLen : " + maxLen);
	}
	
	private static void fetchDuplicateElements(String[] stringArray) {
		List<String> stringList =Arrays.stream(stringArray).collect(Collectors.toList());
		// 1st Approach 
		Set<String> uniqueNames = new HashSet<String>();
		Set<String> duplicateNames = stringList.stream().filter(name -> !uniqueNames.add(name)).collect(Collectors.toSet());
		System.out.println(" 1st Approach : "+duplicateNames);
		
		// 2nd Approach 
		Map<String, Long> mapOfNames = stringList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		Set<String> uniqueNameSet=mapOfNames.entrySet().stream()
				.filter(entry -> entry.getValue()>1)
				.map(entry -> entry.getKey()).collect(Collectors.toSet());		
		System.out.println(" 2nd Approach : "+uniqueNameSet);
		
		// 3rd Approach 
		Set<String> uniqueNamesUsingFrequency = stringList.stream().
				filter(name -> Collections.frequency(stringList, name)>1 )
				.collect(Collectors.toSet());
		System.out.println(" 3rd Approach : "+uniqueNamesUsingFrequency);
	}
	
	private static void calculateSumOfNumbers(int[] arr) {
		int sum = Arrays.stream(arr).reduce((o1,o2) -> (o1+o2)).getAsInt();
		System.out.println("sum :" + sum);
	}
	
	private static void countWordsInString(String str) {
		Map<String , Long> wordsMap = Arrays.asList(str.split(" ")).stream()
				.collect(Collectors.groupingBy(Function.identity(), TreeMap::new, Collectors.counting()));
		System.out.println("wordsMap : " + wordsMap);
	}
	
}
