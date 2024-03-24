package in.ExceptionAll;

/*
NullPointerException:-
If we trying to access any data from "null reference ,
then we will get NPE





*/

class Demo {
	void info() {
		System.out.println("Akash");
	}
}

public class NullPointerEx {
	public static void main(String[] args) {

//		String s = "Hai";
		String s = null;
		System.out.println(s);
		System.out.println(s.length());
		
		
		

		Demo d = new Demo();
		Demo d2 = new Demo();
		d2=null;
		
		d.info();
		d2.info();

	}
}
