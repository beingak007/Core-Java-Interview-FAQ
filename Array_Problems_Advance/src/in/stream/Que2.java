package in.stream;

import java.util.Arrays;

//Array Iteraation 
public class Que2 {
	
	public static void main(String[] args) {
		
		int []a= {2,5,7,4};
		
		Arrays.stream(a).forEach((x)->{
			
			System.out.println(x);
		});
	}

}

/*
  o/p--> 2 5 7 4
 */