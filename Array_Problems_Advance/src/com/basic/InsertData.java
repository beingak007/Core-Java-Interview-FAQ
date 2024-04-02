package com.basic;

import java.util.Scanner;

public class InsertData {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size");
		int n=sc.nextInt();	
		int arr[]=new int[n];
		
		InsertData a=new InsertData();
		a.insertData(arr);
		a.showData(arr);
	}
	public void insertData(int h[]) {
		int l=h.length;
		Scanner sb=new Scanner(System.in);
		for(int i=0;i<l;i++) {
			System.out.println("Enter "+ i + " indexed size value");
			h[i]=sb.nextInt();
			
		}
	}
	public void showData(int s[]) {
		for(int i=0;i<s.length;i++) {
			System.out.println("Data in the element the array  "+s[i]);
			
		}
		
	}
	

}
