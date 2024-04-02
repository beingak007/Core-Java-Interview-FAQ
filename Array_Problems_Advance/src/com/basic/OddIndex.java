package com.basic;

public class OddIndex {
	public static void main(String[] args) {

		int[] arr = { 23, 34, 45, 44, 65 };
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 != 0) {
				System.out.print(arr[i] + " ");
			}

		}
	}
}
