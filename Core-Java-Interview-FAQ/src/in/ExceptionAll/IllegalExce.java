package in.ExceptionAll;


/*

IllegalArgumentsException:
If we trying to illegal value for some method in java we will get IEX



*/
public class IllegalExce {
	public static void main(String[] args) {
		

		Thread t = new Thread();
		System.out.println(t.getPriority());//default value thread 5
		
		
		
		t.setPriority(11);
		System.out.println(t.getPriority());
	}
	

}
