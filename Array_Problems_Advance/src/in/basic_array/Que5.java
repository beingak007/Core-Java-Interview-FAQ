package in.basic_array;

//WAP to get the sum of all element in an array
public class Que5 {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,};
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
			
		}
		System.out.println("The Sume is : " +sum);
	}

}
