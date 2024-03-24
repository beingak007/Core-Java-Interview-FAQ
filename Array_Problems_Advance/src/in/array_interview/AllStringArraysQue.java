package in.array_interview;

public class AllStringArraysQue {

	// WAP Java program to print ASCII values of a character
	public static void s1() {

		char c = 'A';

		int i = c;

		System.out.println("ASCII value of " + c + " is " + i);

	}

// WAP	Java Program to find length of the string without using length function
	public static void s2() {

		int length = 0;

		String s = "Akash ";
		for (char c1 : s.toCharArray())
			length++;
		System.out.println("Length of String is : " + length);

	}

//	WAP Java program to toggle each character in a string

//	Enter a String : AkAsH
//	Toggle String is : aKaSh
	public static void s3() {

		String s = "AkAsH";
		String s1 = "";
		for (int i = 0; i < s.length(); i++) {
			if (Character.isUpperCase(s.charAt(i)))
				s1 = s1 + Character.toLowerCase(s.charAt(i));
			else
				s1 = s1 + Character.toUpperCase(s.charAt(i));
		}
		System.out.println("Toggle String is : " + s1);

	}

//	Java program to count the number of vowels in a String
	public static void s4() {

		String s = "Akashe";
		char[] c = s.toCharArray();
		int vowel = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u')
				vowel++;
		}

		System.out.println("Vowels: " + vowel);

	}

//	WAP Java Program to Remove Vowels from a String
	public static void s5() {

		String str = "Akash Shinge";
		str = str.toLowerCase();
		String v = "aeiou";
		for (int i = 0; i < v.length(); i++) {
			str = str.replaceAll(String.valueOf(v.charAt(i)), "");
		}
		System.out.println(str);
	}

	/*
	 * 
	 * String s = "Akashak"; String s1 = ""; s1 = s.replaceAll("[aeiou]", "");
	 * System.out.println("String after removing vowel : "+s1); }
	 * 
	 * 
	 */

//	WAP Java program to check String is a palindrome or not
	private static void s6() {
		String str = "akash";
		int n = str.length() / 2;
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
				System.out.println("Not palindrome");
				count++;
				break;
			}
		}
		if (count == 0) {
			System.out.println("Palindrome");
		}
	}

	
//	Java Program to Reverse a String
	private static void s7() {
	    String s = "Akash";
	    String rev = "";

	    for (int i = s.length()-1; i >=0; i--) {
	      rev=rev+s.charAt(i);
	    }
	    System.out.println(rev);
	  }

//	WAP Java program to count strings and integers from an array
	 public static void s8() {
		 
			    // enter string u want here.
			    String x[] = { "Akash", "77", "101", "99", "Rinku"};
			    int cn = 0, cs = 0;

			    //print array elements
			    System.out.println("Array elements are: ");
			    for (int i = 0; i < x.length; i++) {
			      System.out.println(x[i]);
			    }

			    // scan the string.
			    for (int i = 0; i < x.length; i++) {
			      try {
			        int j = Integer.parseInt(x[i]);
			        cn++;
			      } catch (NumberFormatException e) {
			        cs++;
			      }
			    }
			    // show the numeric and string value after counting.
			    System.out.println("Numeric:" + cn + "\nStrings:" + cs);
			  }
		
	
	
	public static void main(String[] args) {
		s8();

	}



}
