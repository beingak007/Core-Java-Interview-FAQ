package in.Comparable_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;


public class Student implements Comparable<Student> {

	int id;
	String name;

	public Student(int id, String name) {
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

//	If this is not using set is allowed duploicate object


	@Override
	public int compareTo(Student o) {
		if (id == o.id) {
			return 0;

		} else if (id >= o.id) {
			return 1;

		} else {
			return -1;
		}
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	public static void main(String[] args) {
		
		List<Student> al = new ArrayList<Student>();
		Student s1 = new Student(1, "Akash");
		Student s2 = new Student(10, "Shailesh");
		Student s3 = new Student(11, "Abhi");
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		Collections.sort(al);
		
		System.out.println(al);
	}

}
