package in.Collection.Set;

import java.util.HashSet;
import java.util.Set;

public class TestApp {
	public static void main(String[] args) {
		
		Set<Student> set = new HashSet();
		Student s1 = new Student(1, "Akash");
		Student s2 = new Student(1, "Akash");
		Student s3 = new Student(1, "Akash");
		
		set.add(s1);
		set.add(s2);
		set.add(s3);
		
		System.out.println(set);
	}

}
