package in.Comparable_And_Comparator;

import java.util.ArrayList;
import java.util.Collections;

public class TestApp {
	public static void main(String[] args) {

		ArrayList<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee(1, "Akash"));
		emp.add(new Employee(3, "Srushti"));
		emp.add(new Employee(2, "shailesh"));
		emp.add(new Employee(5, "Aka"));

		Collections.sort(emp);

		for (Employee employee : emp) {
			System.out.println(employee.getName() + " :" + employee.getId());

			// Comparator

		}
		System.out.println("Using Comparator Util Pkg");
		ArrayList<Employee> emp1 = new ArrayList<Employee>();
		emp1.add(new Employee(1, "Akash"));
		emp1.add(new Employee(3, "Srushti"));
		emp1.add(new Employee(2, "shailesh"));
		emp1.add(new Employee(5, "Aka"));

		Collections.sort(emp1, new IdComparator());
//		System.out.println(emp1);
		for (Employee employee : emp1) {
			System.out.println(employee.getId() + " : " + employee.getName());

		}
		System.out.println("Using Comparator Util Pkg");
		ArrayList<Employee> emp3 = new ArrayList<Employee>();
		emp3.add(new Employee(1, "Akash"));
		emp3.add(new Employee(3, "Srushti"));
		emp3.add(new Employee(2, "shailesh"));
		emp3.add(new Employee(5, "Aka"));
		for (Employee employee : emp3) {
			
			System.out.println(employee);
		}
		Collections.sort(emp3,new NameComparator());
//		System.out.println(emp3);
	}

}
