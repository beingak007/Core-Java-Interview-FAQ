package in.inheritance;

import java.sql.SQLException;

//When the child class throws exception that Exception must throw parent class
// if parent class throw the Exception child class not mandatory to handle exceptionF
public class Child extends Parent {

//	public void m1() throws Exception {
	public void m1() throws SQLException {
		System.out.println("Child.m1()");
	}
	// remove the override annotation
	// When you override the method from the parent then override annotation not
	// applicable
//		@Override 

	public static void m3() {

		// static methods cannot be override to the child class its shown
		// TO use annotation ,Its Shown by compile time error
		//

	}

	public static void main(String[] args) {
		Parent p1 = new Child(); // Parent class Object Hold the child class Object

	}

}
