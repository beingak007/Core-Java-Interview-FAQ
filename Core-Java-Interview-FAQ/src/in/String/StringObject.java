package in.String;

public class StringObject {
	public static void main(String[] args) {
		
//		how many object created here
		
		String s1=new String("Akash");
		
		String s2="Akash";
		
		
		/*
		 * 1 object -> new heap
		 * 
		 * 2 object-> Literals SCP
		 * 
		 * here 2 object will be created
		 */
		  
		  
		 
		System.out.println(s1.intern());
		// Intern method used to get reference from the scp
		
		System.out.println(s1.intern().hashCode()==s2.hashCode());
	}

}
