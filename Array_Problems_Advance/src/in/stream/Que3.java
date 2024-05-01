package in.stream;
//Arrays Count

import java.util.Arrays;

public class Que3 {
	public static void main(String[] args) {
		int a[] ={1,4,8,3};
		
		long count = Arrays.stream(a).count();
		System.out.println(count);
	}

}
//o/p--> 4
