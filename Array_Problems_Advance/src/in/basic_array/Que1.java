package in.basic_array;

//Enhance loop only for forward direction
public class Que1 {
	public static void main(String[] args) {
		int [] [] a={{10,20},{30,40,50},{60,70,80,90}};
		for(int arr[]:a) {
			for(int elem:arr) {
				System.out.print(elem+" ");
			}
			System.out.println();
		}
	}

}
