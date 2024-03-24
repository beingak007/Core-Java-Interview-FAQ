package in.java8;

public class Paytm implements  Payment {

	@Override
	public void toTransaction() {
		
		System.out.println("Paytm Transaction");
		
	}
	
	@Override
	public void addCoupon() {
		
		Payment.super.addCoupon();
		System.out.println("I Will give 10RS Cashback");
	}
	
	
	public static void main(String[] args) {
		Paytm pt = new Paytm();
		pt.addCoupon();
		pt.toTransaction();
	}
	
	

}
