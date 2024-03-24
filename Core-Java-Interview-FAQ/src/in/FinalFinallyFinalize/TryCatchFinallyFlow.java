package in.FinalFinallyFinalize;

public class TryCatchFinallyFlow {

	public static int m1() {

		try {
			System.out.println(10/0);
			return 1;
		} catch (Exception e) {
			return 2;
		} finally {
//			System.exit(0); u can stop the executing finally block
			return 3; //return value change as the flow of the program
		}
	}

	public static void main(String[] args) {
		System.out.println(m1());
	}

}
