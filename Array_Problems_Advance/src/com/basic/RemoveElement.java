package com.basic;

import java.util.Arrays;

public class RemoveElement {

	public static void main(String[] args) {
		
	
	int[] originalArrays= {1,2,3,4,5};
	
	int  elementToRemove=3;
	
	int[]newArray=remove(originalArrays, elementToRemove);
			System.out.println(Arrays.toString(originalArrays));
	System.out.println(Arrays.toString(newArray));
}

	public static int[] remove(int[] array,int element) {
		int []newArray=new int[array.length-1];
		int index=0;
		
		for (int i = 0; i < array.length; i++) {
			
			if(array[i]!=element) {
				newArray[index]=array[i];
				index++;
			}
		}
		return newArray;
		
		
	}

}
