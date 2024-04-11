package in.array_interview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//Java Program for finding the largest element of the array

public class AllArraysQue {

//  WAP Java Program for finding the largest element of the array
	public static void a01() {

		int arr[] = { 12, 13, 1, 10, 34, 10 };

		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}

		}

		System.out.print(max);
	}

// WAP	Java Code for finding the Smallest Element in an Array

	public static void a02() {
		int arr[] = { 12, 13, 1, 10, 34, 10 };

		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}

		}

		System.out.print(min);
	}

//	Java Program for Finding the Smallest and largest element in an array
	public static void a03() {
		int arr[] = { 12, 13, 1, 10, 34, 10 };

		int largest = arr[0], smallest = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (smallest > arr[i])
				smallest = arr[i];

			if (largest < arr[i])
				largest = arr[i];

		}

		System.out.println(smallest);
		System.out.println(largest);
	}

// WAP	Java program for finding the second smallest element in an array
	public static void a4() {
		int arr[] = { 12, 13, 1, 10, 34, 10 };
		int lowest = arr[0];
		int sec_lowest = arr[0];
		for (int n : arr) {
			if (lowest > n) {
				sec_lowest = lowest;
				lowest = n;

			} else if (sec_lowest > n && lowest != n)
				sec_lowest = n;
		}

		System.out.println(lowest + "   " + sec_lowest);

	}

//	 WAP JAVA Program for calculating the sum of all the elements of an array
	public static void a5() {

		int arr[] = { 12, 13, 1, 10, 34, 10 };

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}

		System.out.print(sum);
	}

//	WAP Reverse an Array in Java
	public static void a6() {

		{

			int arr[] = { 10, 20, 30, 40, 50 };

			int n = arr.length;
			for (int i = n - 1; i >= 0; i--)
				System.out.print(arr[i] + " ");
		}

	}

//	Java Program for Sorting first half in Ascending order 
//	and second half in Descending order

	public static void a7(int a[], int n) {
		// array length

		int temp;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n / 2; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}

			for (int j = n / 2; j < n - 1; j++) {
				if (a[j] < a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}

		for (int i = 0; i < n; i++)
			System.out.print(a[i] + " ");

	}

//  WAP	Java program for Sorting Elements In An Array
	public static void a8() {
		// Initialize array
		int[] arr = new int[] { 10, 40, 30, 20 };
		int temp = 0;

		// Sort the array in ascending order
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		// Displaying elements of array after sorting
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

//	Java program for longest palindrome in an array
	public static boolean a9(int n) {

		int temp = n;
		int rev = 0;
		while (n > 0) {
			int rem = n % 10;
			rev = rev * 10 + rem;
			n = n / 10;
		}
		if (rev == temp) {
			return true;
		} else {
			return false;
		}

	}

// WAP Program to find missing element in an array in java
	public static void a10() {

		int n;

		// take default input array.
		int[] numbers = new int[] { 1, 2, 3, 4, 6, 7 };

		// last elements.
		n = 7;

		// sum of elements till last value.
		int expected_sum = n * ((n + 1) / 2);
		int sum = 0;

		for (int i : numbers) {
			sum += i;
		}

		// obtain missing elements.
		int m = expected_sum - sum;
		System.out.print("Missing element is : " + m);
		System.out.print("\n");

	}

//	WAP Find the Second Largest Number in an Array
	public static void a11() {

		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for (int num : arr) {
			if (num > largest) {
				secondLargest = largest;
				largest = num;
			} else if (num > secondLargest && num != largest) {
				secondLargest = num;
			}
		}

		System.out.println("The second largest number is: " + secondLargest);
	}

// WAP	Find the Duplicate Elements
	public static void a12() {
		int[] arr = { 1, 2, 3, 4, 2, 5, 6, 3 };
		Set<Integer> set = new HashSet<>();
		Set<Integer> duplicates = new HashSet<>();

		for (int num : arr) {
			if (!set.add(num)) {
				duplicates.add(num);
			}
		}

		System.out.println("Duplicate elements: " + duplicates);

	}

//WAP	Removing  the Duplicate Elements
	public static void a13() {

		{
			int arr[] = { 10, 20, 20, 30, 40, 40, 40, 50, 50 };
			int n = arr.length;
			Set hash_Set = new HashSet();
			for (int i = 0; i < n; i++)
				hash_Set.add(arr[i]);

			System.out.print(hash_Set);
		}

	}

//	WAP Copy One Array to Another Array
	private static void a14() {

		
	}
	
//	Find Second Smallest and Second Largest Element in an array
	public static void a15(int arr[],int n) {
			if (n == 0 || n==1)
			{
				System.out.print(-1);
				System.out.print(" ");
				System.out.print(-1);
				System.out.print("\n");
			}
			Arrays.sort(arr);
			int small = arr[1];
			int large = arr[n - 2];
			System.out.println("Second smallest is "+small);
			System.out.println("Second largest is "+large);
			
			/*	
			 Write below code in main() Methods and hit the run 
			{
				int[] arr = {1, 2, 4, 6, 7, 5};
				int n = arr.length;
				a15(arr, n);
				
			}
			
				
				*/
			
		}
	
		
	
	public static void main(String[] args) {

		a14();
		
		{
			int[] arr = {1, 2, 4, 6, 7, 5};
			int n = arr.length;
			a15(arr, n);
		}

	}

}