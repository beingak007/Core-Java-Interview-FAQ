package in.functional_interface;

public class AmazonPay implements iUPIPayment {

	@Override
	public String doPayment(String source, String dest) {
		iUPIPayment.dataPattern(dest);
		return null;
	}

}
