package in.Comparable_And_Comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Sample {
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList();
		al.add(11);
		al.add(12);
		al.add(10);
		al.add(9);
		
		
		System.out.println("Before sorting : "+al);
		
		Collections.sort(al);
		System.out.println("After Sorting :"+al);
	}

}
