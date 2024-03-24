package in.array;

import java.util.Arrays;

public class Que1 {
	public static void main(String[] args) {

		int[] a = new int[4];
		for (int elem : a) {
			System.out.println(elem);

		}

		Arrays.fill(a, 5);
		for (int elem : a) {
			System.out.println(elem);

		}
		int []ar= {1,2,0,0,0,6};

					//INDEX
		Arrays.fill(ar, 2, 3, 10);
		for (int elem : ar) {
			System.out.print(elem+",");

		}
		System.out.println("=======================");
		int arra[]= {60,50,70,20,5,10};
		
			Arrays.sort(arra);
			for (int j : arra) {
				System.out.print(j+",");
				
			}
			System.out.println();
			
			int res=Arrays.binarySearch(arra, 55);//-((indexfit) + 1;
			System.out.println(res);
		}
	}

