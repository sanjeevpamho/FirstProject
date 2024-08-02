package code.bind.java8;

import java.util.ArrayList;
import java.util.List;

public class EmpUtility {

	public static List<Emp> getEmpList() {

		List<Emp> empList = new ArrayList<>();
		empList.add(new Emp(1, "Rohit", 28, 123, "F", "HR", "Blore", 2020));
		empList.add(new Emp(2, "Virat", 29, 120, "F", "HR", "Hyderabad", 2015));
		empList.add(new Emp(3, "Hardik", 30, 115, "M", "HR", "Chennai", 2014));
		empList.add(new Emp(4, "Surya", 32, 175, "F", "HR", "Chennai", 2013));

		empList.add(new Emp(5, "David", 22, 150, "F", "IT", "Noida", 2013));
		empList.add(new Emp(6, "Marsh", 27, 140, "M", "IT", "Gurugram", 2017));
		empList.add(new Emp(7, "Steve", 26, 130, "F", "IT", "Pune", 2016));
		empList.add(new Emp(8, "Zampa", 23, 145, "M", "IT", "Trivandam", 2015));
		empList.add(new Emp(9, "Stonis", 25, 175, "M", "IT", "Blore", 2010));
		
		empList.add(new Emp(10, "Root", 37, 170, "F", "Finance", "Noida", 2010));
		empList.add(new Emp(11, "Stokes", 27, 180, "M", "Finance", "Gurugram", 2012));
		empList.add(new Emp(12, "Jimmy", 35, 190, "F", "Finance", "Pune", 2011));
		empList.add(new Emp(13, "Jony", 28, 175, "M", "Finance", "Trivandam", 2013));
		empList.add(new Emp(9, "Pope", 28, 197, "M", "IT", "Blore", 2010));
		
		return empList;
	}
}
