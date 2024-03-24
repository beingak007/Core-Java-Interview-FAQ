package in.functional_interface;

public class Paytm implements iUPIPayment {

	@Override
	public String doPayment(String source, String dest) {
		return null;
	}
	
	@Override
	public double getScratchCard() {
		
		return iUPIPayment.super.getScratchCard();
	}

}
