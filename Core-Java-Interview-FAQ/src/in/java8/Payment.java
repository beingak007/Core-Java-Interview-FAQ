package in.java8;

public interface Payment {

	public void toTransaction();

	
	//purpose default method Not force to my impletstino part override 
	default void addCoupon() {
		System.out.println("Add 5 RS Cashback");
	}
	
	static void gentransactionRep() {
		System.err.println("Genrate trancatoion Report");
	}

}
