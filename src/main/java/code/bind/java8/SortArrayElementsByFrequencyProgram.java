package code.bind.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SortArrayElementsByFrequencyProgram {
	public static void main(String[] args) {
		sortArrayElementsByFrequency(new int[] { 7, 1, 3, 4, 7, 1, 7, 1, 4, 9, 1, 5, 3 });
	}

	private static void sortArrayElementsByFrequency(int[] inputArray) {

		System.out.println("Input Array :" + Arrays.toString(inputArray));
				
		Map<Integer, Long> elementCountMaps = Arrays.stream(inputArray).mapToObj(i-> (int)i)
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println("elementCountMaps : " + elementCountMaps);
		
		ArrayList<Integer> sortedElements = new ArrayList<>();

		elementCountMaps.entrySet().stream()
	//	.sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
		.sorted((o1, o2) -> (o2.getValue()<o1.getValue())?-1 : (o2.getValue()==o1.getValue())?-1:0)
		.forEach(entry -> {
					for (int i = 1; i <= entry.getValue(); i++)
						sortedElements.add(entry.getKey());
				});

		System.out.println("Sorted Array Elements In Descending Order Of their Frequency :");
		System.out.println(sortedElements);
	}
}
