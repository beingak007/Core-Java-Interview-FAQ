package com.basic;

public class PrintStar {
	public static void main(String[] args) {

		int arr[] = { 12, 13, 1, 10, 34, 10 };

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.print("* ");
			} else {
				System.out.print("# ");
			}

		}

	}

}
