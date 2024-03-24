package in.ExceptionAll;


/*

NumberFormatException:

"10" ------->10

""ten"------>10 RE:NFE










*/
public class NumberFormatException {
	public static void main(String[] args) {
		
		String s="10";
		int i=Integer.parseInt(s);
		System.out.println(i);
		
		
		String s1="Ten";
		int j=Integer.parseInt(s1);
		System.out.println(j);
		
	}

}
