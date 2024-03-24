package in.CustomException;

public class TestApp {

	public void getAge(int age) throws AgeInvalid {

		try {
			if (age >= 18) {
				throw new AgeInvalid("invalid enter age" + age);

			} else {
				System.out.println("Age is Valid");
			}
		} catch (AgeInvalid e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws AgeInvalid {
		TestApp t = new TestApp();
		t.getAge(12);
	}

}
