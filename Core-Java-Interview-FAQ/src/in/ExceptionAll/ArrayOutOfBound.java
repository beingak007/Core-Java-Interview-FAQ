package in.ExceptionAll;

/*
 Parent class                 child class 
 IndexOutBoundException----> AIOBE and SIOBE
 
 If we are trying to access the character out of indedx
 

*/
public class ArrayOutOfBound {
	
	public static void main(String[] args) {
		
	
	String s="Hai";
	//        012
	
	
	System.out.println(s.charAt(0));
	System.out.println(s.charAt(3));
	
	}

}
