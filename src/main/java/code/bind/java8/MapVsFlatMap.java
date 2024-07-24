package code.bind.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MapVsFlatMap {
	public static void main(String[] args) {
        List<String> citiesWorkedIn1 = new ArrayList<String>();
        citiesWorkedIn1.add("Pune");
        citiesWorkedIn1.add("Mumbai");
        citiesWorkedIn1.add("Noida");
        citiesWorkedIn1.add("Bangalore");
        
        Employee e1 = new Employee(1, "Code", citiesWorkedIn1);
        
        List<String> citiesWorkedIn2 = new ArrayList<String>();
        citiesWorkedIn2.add("Pune");
        citiesWorkedIn2.add("Nagpur");
        citiesWorkedIn2.add("Indore");
        
        Employee e2 = new Employee(2, "Decode", citiesWorkedIn2);
        
        List<String> citiesWorkedIn3 = new ArrayList<String>();
        citiesWorkedIn3.add("Pune");
        citiesWorkedIn3.add("Bangalore");
        
        Employee e3 = new Employee(3, "Code Decode", citiesWorkedIn3);
        
        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        
        System.out.println(employeeList);
        System.out.println("************************************************************************");
        
        
        List<Integer> ids = employeeList.stream().map(emp -> emp.getId()).collect(Collectors.toList());
        System.out.println(ids);
        
        Set<List<String>> citiesWorkedIn = employeeList.stream().map(emp -> emp.getCitiesWorkedIn()).collect(Collectors.toSet());
        System.out.println("citiesWorkedIn : " + citiesWorkedIn);
        
        Set<String> citiesWorkedInFlattened = employeeList.stream().flatMap(emp -> emp.getCitiesWorkedIn().stream()).collect(Collectors.toSet());
        System.out.println("citiesWorkedInFlattened : " + citiesWorkedInFlattened);
        
        
	}
}
