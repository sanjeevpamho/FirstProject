package code.bind;
import java.util.HashMap;
public class Employee {
	Integer Roll;
	String Name;
	public Employee(Integer Roll, String Name) {
		this.Roll = Roll;
		this.Name = Name;
	}
	public Integer getRoll() {
		return Roll;
	}
	public void setRoll(Integer roll) {
		Roll = roll;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public boolean equals(Object obj){
		return true;
	}
	public int hashCode(){
		int hashcode = 0;
		hashcode = Roll*20;
		hashcode += Name.hashCode();
	//	System.out.println("hashcode:"+hashcode);
		return hashcode;
	}

	public static void main(String[] args) {
		HashMap<Employee, Integer> hm=new HashMap<Employee, Integer>();

		Employee e1 = new Employee(10, "Samad");
		Employee e2 = new Employee(50, "Sahar");
		hm.put(e1, 10);
		hm.put(e2, 20);
		e2.setRoll(40);
		System.out.println("HashMap compare="+(e1.equals(e2)));
		System.out.println("e2.getRoll()::"+e2.getRoll());
		System.out.println("hm.size::"+hm.size());
		System.out.println("HashMap Value="+hm.get(e1));
		System.out.println("HashMap Value="+hm.get(e2));
	}
}
