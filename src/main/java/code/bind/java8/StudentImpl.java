package code.bind.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class StudentImpl {
	public static void main(String[] args) {
        List<Student> studentList  = new ArrayList<Student>();
        studentList.add(new Student(1, "Rohan", 20));
        studentList.add(new Student(1, "Mohan", 21));
        studentList.add(new Student(1, "Sohan", 20));
        studentList.add(new Student(1, "Rahul", 23));
        studentList.add(new Student(1, "Shankar", 21));
        studentList.add(new Student(1, "Shivam", 19));
        
        //Group student by age;
        groupStudentByAge(studentList);
		
	}

	private static void groupStudentByAge(List<Student> studentList) {
		Map<Integer, List<Student>> studentMap=studentList.stream().collect(Collectors.groupingBy(student -> student.getAge()));
		System.out.println("studentMap : " );
		System.out.println(studentMap);
		
		Map<Integer, Set<Student>> studentMapWithSet = studentList.stream().collect(Collectors.groupingBy(student -> student.getAge(),Collectors.toSet()));
		
		Map<Integer, Set<Student>> studentMapWithSetWithKeySorting = studentList.stream().collect(Collectors.groupingBy(student -> student.getAge(),TreeMap::new,Collectors.toSet()));
	}
	
	
}