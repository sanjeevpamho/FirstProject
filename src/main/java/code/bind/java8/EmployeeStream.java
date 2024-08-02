package code.bind.java8;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeStream {
	public static void main(String[] args) {

		findtheNthHighestSalary();
		getDynamicNthHighestSalary();
		
		//https://medium.com/@veenaraofr/java8-stream-api-commonly-asked-questions-about-employee-highest-salary-99c21cec4d98

	}

	private static void findtheNthHighestSalary() {
		Map<String, Integer> map = new HashMap<>();
		map.put("anil", 1000);
		map.put("ankit", 1200);
		map.put("bhavna", 1300);
		map.put("james", 1400);
		map.put("micael", 1500);
		map.put("tom", 1600);
		map.put("daniel", 1700);

		int fourthHighestSalary = 4;

		Map.Entry<String, Integer> finalResult = map.entrySet().stream()
				.sorted((entry1, entry2) -> -entry1.getValue().compareTo(entry2.getValue())) // minus make it to do in
																								// desc order
				.collect(Collectors.toList()).get(fourthHighestSalary - 1); // index start from 0

		System.out.println("4th highest salary : " + finalResult.getKey() + " : " + finalResult.getValue());

	}

	public static void getDynamicNthHighestSalary() {
		int n = 3;

		Map<String, Integer> employeeSalaries = new HashMap<>();

		// Populate the HashMap with employee names and salaries
		employeeSalaries.put("Abrar", 20000);
		employeeSalaries.put("Chand", 35000);
		employeeSalaries.put("Kalam", 45000);
		employeeSalaries.put("Raheem", 35000);
		employeeSalaries.put("Kiran", 50000);
		employeeSalaries.put("Esa", 45000);

		// 1. Group employee names by their corresponding salaries
		Map.Entry<Integer, List<String>> entry = employeeSalaries.entrySet().stream()
				.collect(Collectors.groupingBy(Map.Entry::getValue, // Group by salary

						Collectors.mapping(Map.Entry::getKey, Collectors.toList()) // Collect employee names as a list
																					// for each salary

				)).entrySet().stream()
				// 2. Sort the map entries by salary in descending order
				.sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
				// 3. Collect the sorted map entries into a List
				.collect(Collectors.toList())
				// 4. Get the nth element from the list (n - 1 as list index starts from 0)
				.get(n - 1);

		System.out.println(entry);
	}
}
