package in.basic_array;

//To Check array ID OR 2D
public class Que4 {
	public static void main(String[] args) {

		int[] a = new int[4];
		System.out.println(a.getClass().getName()); // 1D array

		int[][] arr = new int[4][2];
		System.out.println(arr.getClass().getName());//2D array
		
	}
}
