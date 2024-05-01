
package in.stream;

import java.util.Arrays;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//Array Sorting

public class Que4 {
	public static void main(String[] args) {
		
		int a[]= {2,5,8,3,};
		
		
		
		Arrays.stream(a).sorted().forEach((x)->{
			System.out.println(x);
	
		});
		
		
	}

}
/*
  o/p--> 2 3 5 8
 */