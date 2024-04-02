package com.basic;

import java.util.Scanner;

public class Store_Element {

	public static void main(String[] args)
	{   
		Scanner input =new Scanner(System.in);
		int [] a =new int[7]; 
		for(int i=0;i<7;i++)
		{
			System.out.printf("Element of a[%d] :",i);
			a[i]=input.nextInt();
		} 
		System.out.println("\nDisplay Array Elements...\n");
		for(int e:a)
		{
			System.out.println(e);
		}
    }
}
