package in.functional_interface;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

@FunctionalInterface
public interface iUPIPayment {
	
	String doPayment(String source, String dest);
	

	default double getScratchCard() {
		return new Random().nextDouble();
	}
	
	
	
	
	static String dataPattern(String pattern)
	{
		SimpleDateFormat dateFormat = new SimpleDateFormat();
		return dateFormat.format(new Date());
	}

}