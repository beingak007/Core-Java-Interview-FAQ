package in.Exception.CusttomException;

/*
Custom exception create m it throw new error

*/

public class Test {
	public void getOrder(int orderId) throws Order{
		if(orderId==101) {
			
			System.out.println("Order is Found ");
			 
		}else {
			throw new OrderNotFound("Order Not Found with id " + orderId);
			
		}
	}
	public static void main(String[] args) {
		Test test = new Test();
		test.getOrder(102);
	}

}
