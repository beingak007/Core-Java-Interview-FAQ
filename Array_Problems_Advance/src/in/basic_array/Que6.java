
package in.basic_array;
//WAP to get the Max and Min in an array
public class Que6 {
	public static void main(String[] args) {
		int a[]= {1,8,2,3,9,4,5,6,7,0110};
		int max=a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i]>max) {
				max=a[i];
				
				
			}
		}
		System.out.println("The Max is : " +max);
	}

}
