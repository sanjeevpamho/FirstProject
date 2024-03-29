package code.bind.immutable;

import java.util.HashMap;

class Course implements Cloneable{

	String subject1,subject2;

	public Course(String subject1, String subject2) {

		this.subject1 = subject1;
		this.subject2 = subject2;
	}

	/*	public Course() {
		// TODO Auto-generated constructor stub
	}
	 */
	public String getSubject2() {
		return subject2;
	}
	public void setSubject2(String subject2) {
		this.subject2 = subject2;
	}
	public String getSubject1() {
		return subject1;
	}
	public void setSubject1(String subject1) {
		this.subject1 = subject1;
	}
	public Object clone() {
		Course course = null;
		try{
			course=(Course) super.clone();
		}
		catch(Exception e){

		}
		return course;
	}
}
public final class Student implements Cloneable{


	private final String name;
	private final Course orgCourse;
	public String getName(){
		return name;
	}
	public Course getOrgCourse(){
		return (Course) orgCourse.clone();
	}
	/*	deep copy */
	public Student(String name,Course course){
		this.name=name;
		Course tmp=new Course(course.getSubject1(),course.getSubject2());
		this.orgCourse=tmp;
	}
	/* shallow copy */ 
	/*
	 public Student(String name,Course course){
		this.name=name;
		this.orgCourse=course;
	}
	 */
	public Object clone() throws CloneNotSupportedException{
		Student cloneStudent=new Student(this.name, this.orgCourse);
		return cloneStudent;
		
		
	}
	public static void main(String[] args) throws CloneNotSupportedException {

		Course course=new Course("Physics", "Chemistry");
		String name="Sanjeev";
		Student student=new Student(name, course);
		System.out.println(student.getName()+" :: "+student.getOrgCourse().getSubject1()+" : "+student.getOrgCourse().getSubject2());

		name="modified";
		course.setSubject2("Math");
		System.out.println(student.getName()+" :: "+student.getOrgCourse().getSubject1()+" : "+student.getOrgCourse().getSubject2());
		
		Course course1=new Course("History", "Eco");
		Student student1=new Student("Mohit", course1);
		Student student2=(Student) student1.clone();
		student2.orgCourse.subject2="Geo";
		
		System.out.println(student2.orgCourse.subject2);
		System.out.println(student1.orgCourse.subject2);
	}

}
