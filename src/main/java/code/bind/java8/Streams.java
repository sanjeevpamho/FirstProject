package code.bind.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Streams {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(0);al.add(1);al.add(2);al.add(3);al.add(4);al.add(5);al.add(6);al.add(7);al.add(8);
		
		List<Integer> l=al.stream().filter(num-> num%2==0).collect(Collectors.toList());
		System.out.println(l);
		
		List<Integer> l1=al.stream().map(num->num*2).collect(Collectors.toList());
		System.out.println(l1);
		
		List<Integer> list = Arrays.asList(12,13,14,15,16,17,18,19,20);
		List<Integer> l2 = list.stream().map(num -> num * 2).collect(Collectors.toList());
		System.out.println("l2 : " + l2);
		
		//flatMap
		List<Integer> P1 = Arrays.asList(1,2,3,4,5);
		List<Integer> P2 = Arrays.asList(6,7,8,9,10);
		List<Integer> P3 = Arrays.asList(11,12,13,14,15);
		List<List<Integer>> allP = new ArrayList<List<Integer>>();
		allP.add(P1); allP.add(P2); allP.add(P3);
		
		List<Integer> l3 = allP.stream().flatMap(myList -> myList.stream().map(num -> num * 2)).collect(Collectors.toList());
		System.out.println("l3 : " + l3);
		
		System.out.println("*************************************************************************");
		
		//print the elements of stream in reverse order 
		List<Integer> listToPrint = Arrays.asList(2, 4, 6, 8, 10); 
		System.out.println("Array sorted in reverse");
		listToPrint.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println); 
		List<Integer> reverseSortedArray = listToPrint.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println("reverseSortedArray : " + reverseSortedArray);
		System.out.println("*************************************************************************");
		
		//remove duplicated
		System.out.println("1st approach to remove duplicated elements");
		List<Integer> listwithDup	= Arrays.asList(1,2,3,2,1,3,4,5);
		listwithDup.stream()
		.collect(Collectors.groupingBy(s->s))
		.forEach(
				(k,v)-> {
					if(v.size()==1) System.out.println(k+" "+v.size()) ;
					}
				);
		
		System.out.println("*************************************************************************");
		System.out.println("2nd approach to remove duplicated elements");
		List<Integer> listwithDupNumber = Arrays.asList(1, 2, 3, 6, 2, 1, 3, 4, 5);
		
		Map<Integer, Long> mapWithNumberFrequency = 
				 listwithDupNumber.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		List<Integer> listAfterRemoveRuplicateNumbers = 
				 mapWithNumberFrequency.entrySet().stream()
				.filter(entry -> entry.getValue() == 1L)
				.map(entry -> entry.getKey())
				.collect(Collectors.toList());
		System.out.println("listAfterRemoveRuplicateNumbers :  " + listAfterRemoveRuplicateNumbers);
	}

}
