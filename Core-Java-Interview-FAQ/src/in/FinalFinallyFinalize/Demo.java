package in.FinalFinallyFinalize;




/*
Final:- Making things constant  we cannot reasign thats value

Finally Block:- its a block in exception handling this block always  be exeLkcute

Finalize():- its method present in object class  when this object not used then this method call  system.gc();
*/

public class Demo {
	private final int a = 10;

		 public void m1() {  

		// a = 20;// final means making things constant its give compile time error

		try {
			System.out.println("Hello Akash");
// We cannot execute the final block then we should go for below code

//			System.exit(0); // JVM Will be Shutdown
		} catch (Exception e) {
			System.out.println("Good to Know ");
		} finally {
			System.out.println("Akash Come Back");
		}

	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize Methods call ");

	}

	public static void main(String[] args) {

		Demo d = new Demo();
		d.m1();
		d = null;
		System.gc();// this called finalize method which on object null remove GC will comes
	}
}
