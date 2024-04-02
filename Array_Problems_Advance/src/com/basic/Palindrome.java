package com.basic;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number Size  :");
		int num = sc.nextInt();

		int arr[] = new int[num];
		int n = num;
		int rev = 0;
		System.out.println("Number is ");
		System.out.println(" " + num);

		for (int i = 0; i < arr.length; i++) {
			Scanner c = new Scanner(System.in);
			System.out.println("Enter the elemenet [%d] :"+i) ;
			int a = c.nextInt();
			int r = arr[a] % 10;
			num = num / 10;
			rev = rev * 10 + r;
		}

		System.out.println("After reversing " + " ");
		System.out.println(" " + rev);

		if (n == rev) {
			System.out.print("This is palindrome");
		} else {
			System.out.println("This is not palindrome");
		}
	}
}