package com.basic;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size for Employee");
		int n = sc.nextInt();

		String arr[] = new String[n];
		Employee.insertData(arr);
	}

	public static void insertData(String a[]) {
		Scanner sb = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			a[i] = sb.next();
			System.out.println("employee name is   " + a[i]);
		}

	}
}
