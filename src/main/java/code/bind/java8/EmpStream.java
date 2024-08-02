package code.bind.java8;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmpStream {
	// https://medium.com/@veenaraofr/java8-stream-api-commonly-asked-questions-about-employee-highest-salary-99c21cec4d98
	public static void main(String[] args) {
		
		// groupByCity();
		
		// getCountByGender();

		 
		
		// findEmployeesInParticularCity();
		
		//   sortByAgeAndNameFields();
		
		
		// averageSalaryOfEachDepartment();

		
		// getNthHighestSalary();
		   
		   
		//   getHighestPaidSalaryBasedOnGender();
		
		highestSalaryBasedOnDepartment();
		

	}

	

	



	public static void groupByCity() {
		System.out.println("1. group by city()");
		List<Emp> empList = EmpUtility.getEmpList();
		Map<String, List<Emp>> empByCity;
		empByCity = empList.stream().collect(Collectors.groupingBy(Emp::getCity));
		System.out.println("Employees grouped by city :: \n" + empByCity);
	}

	public static void averageSalaryOfEachDepartment() {
		System.out.println("23. Print Average salary of each department.");
		List<Emp> empList = EmpUtility.getEmpList();

		Map<String, Double> avgSalary = empList.stream()
				.collect(Collectors.groupingBy(Emp::getDeptName, Collectors.averagingDouble(Emp::getSalary)));

		for (Map.Entry<String, Double> entry : avgSalary.entrySet()) {
			System.out.println(" DeptName : " + entry.getKey() + " , Average Salary : " + entry.getValue());
		}

	}

	public static void getNthHighestSalary() {
		int nthHighestSalary = 3;
		// 1st approach - if there is 1 employee with 3rd highest salary
		List<Emp> empList = EmpUtility.getEmpList();

		Emp emp = empList.stream()
				.sorted((emp1, emp2) -> (emp1.getSalary() < emp2.getSalary()) ? 1
						: (emp1.getSalary() > emp2.getSalary()) ? -1 : 0)
				.collect(Collectors.toList()).get(nthHighestSalary - 1);

		System.out.println("1st approach ");
		System.out.println("emp name : " + emp.getName() + " : emp.getSalary() , " + emp.getSalary()
				+ " emp.getDeptName() : " + emp.getDeptName());

		Entry<Long, List<String>> sortedEntry = empList.stream()
				.collect(Collectors.groupingBy(Emp::getSalary, Collectors.mapping(Emp::getName, Collectors.toList())))
				.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
				.collect(Collectors.toList()).get(nthHighestSalary - 1);

		System.out.println("2nd approach ");
		System.out.println(sortedEntry.getKey() + " : " + sortedEntry.getValue());

	}

	public static void getCountByGender() {
		
		System.out.println("3. Find the count of male and female employees present in the organization.");
		
		List<Emp> empList = EmpUtility.getEmpList();
		Map<String, Long> noOfMaleAndFemaleEmployees = empList.stream()
				.collect(Collectors.groupingBy(Emp::getGender, Collectors.counting()));

		System.out.println("count of male and female employees present in the organization.");
		System.out.println(noOfMaleAndFemaleEmployees);

	}

	private static void findEmployeesInParticularCity() {
		System.out.println("16. Find all employees who lives in ‘Blore’ city, sort them by their name");
		
		List<Emp> empList = EmpUtility.getEmpList();
		empList.stream().filter(emp -> emp.getCity().equalsIgnoreCase("Blore"))
		.sorted(Comparator.comparing(Emp::getName))
		.forEach(emp -> System.out.println(emp.getName()));	

	}
	private static void sortByAgeAndNameFields() {
		List<Emp> empList = EmpUtility.getEmpList();
		Comparator<Emp> ageComparator = Comparator.comparing(Emp::getAge);
		Comparator<Emp> nameComparator = Comparator.comparing(Emp::getName);
		
		System.out.println("20. sortByAgeAndNameFields");
		empList.stream().sorted(ageComparator.thenComparing(nameComparator)).forEach(System.out::println);
		
	} 
	
	private static void getHighestPaidSalaryBasedOnGender() {
		System.out.println("27. Find highest paid salary in the organisation based on gender.");
		
		List<Emp> empList = EmpUtility.getEmpList();
		Map<String, Optional<Emp>>  highestPaidSalaryBasedOnGender=empList.stream()
				.collect(Collectors.groupingBy(Emp::getGender, Collectors.maxBy(Comparator.comparing(Emp::getSalary))));
		                                                                      //Collectors.maxBy((t1, t2) -> (int) (t1.getSalary() - t2.getSalary()))
		System.out.println( highestPaidSalaryBasedOnGender);
	}

    private static void highestSalaryBasedOnDepartment(){
    	System.out.println("31. Highest salary based on department.");
    	List<Emp> empList = EmpUtility.getEmpList();
    	
    	Map<String, Optional<Emp>>  highestPaidSalaryBasedOnDept= empList.stream()
    	.collect(Collectors.groupingBy(Emp::getDeptName, Collectors.maxBy(Comparator.comparing(Emp::getSalary))));
    	
    	for(Map.Entry<String, Optional<Emp>> entry : highestPaidSalaryBasedOnDept.entrySet()) {
    		System.out.println(entry.getKey());
    		System.out.println(entry.getValue());
    	}
    	
    }
}
