package in.Exception.CusttomException;

/*
Custom exception create m it throw new error

*/

public class Test {
	public void getOrder(int orderId) throws OrderNotFound{
		if(orderId==101) {
			throw new OrderNotFound("Order Not Found with id " + orderId);
			 
		}else {
			
		}
	}
	public static void main(String[] args) throws OrderNotFound{
		Test test = new Test();
		test.getOrder(101);
	}

}
