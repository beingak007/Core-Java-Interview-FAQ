package in.String;

public class ImmutableString {
	public static void main(String[] args) {
		
		String s="Akash";
		
		s.concat(s);
		
		String password="pwd";
		
		password.concat("123");
		
		// lets say reference using this password
		
		//now if we changed in same value theb all 5 reference will impacted
	}

}
