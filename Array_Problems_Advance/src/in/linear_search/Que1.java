package in.linear_search;

import java.util.Scanner;

public class Que1 {
	public static void main(String[] args) {
		int a[] = { 1, 8, 2, 3, 9, 4, 5, 6, 7, 0110 };
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the key : ");
		int key = sc.nextInt();

		for (int i = 0; i < a.length; i++) {

			if (key == a[i]) {

				System.out.println(key + "  -> Found at index " + i);
				flag = true;
				break;
			}
		}
		if (flag == false)

			System.out.println("Key not found ");
	}
}
