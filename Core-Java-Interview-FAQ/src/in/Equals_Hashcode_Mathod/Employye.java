package in.Equals_Hashcode_Mathod;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;


/*HashCode:- It is used to generate the unique reference of the object

Equals:- used to compare object based on its content */

public class Employye {

	int id;
	String name;

	public Employye(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	/*
	 * @Override public int hashCode() { return id; }
	 * 
	 * @Override public boolean equals(Object obj) {
	 * 
	 * Employye emp = (Employye) obj; return id == emp.id && Objects.equals(name,
	 * emp.name); }
	 */

	@Override
	public String toString() {
		return "Employye [id=" + id + ", name=" + name + "]";
	}
	public static void main(String[] args) {
		 Employye employye1 = new Employye(1, "Akash");
		 Employye employye2 = new Employye(1, "Akash");
		 
		 System.out.println("Is hashCode :"+(employye1.hashCode()==employye2.hashCode()) );
		 System.out.println("is equals () :" +(employye1.equals(employye2)));
		 
		 //here set is allowed Duplicates values u can must declare as override the userdefined class 
//		 other wise set allowed the duplicate
		Set<Employye> emp = new HashSet();
		emp.add(employye1);
		emp.add(employye2);
		System.out.println(emp);
	}
	
	
	

}
