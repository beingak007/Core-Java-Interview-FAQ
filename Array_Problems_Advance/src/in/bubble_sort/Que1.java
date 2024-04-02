package in.bubble_sort;

public class Que1 {
	
	
	public static void main(String[] args) {
		int []a= {7,5,2,3,1,4,6};
		System.out.println("Before Sorting array: ");
		for (int elem : a) {
			System.out.print(elem+",");
		}
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 1; j < a.length-1; j++) {
				
				if (a[j]>a[j-1]) {
					int temp=a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
					
					
				}
			}
			
		}
		System.out.println();
		System.out.println("--------------------");
		System.out.println("After Sorting arrays :");
		for (int el : a) {
			System.out.print(el+",");
			
		}
	}

}
