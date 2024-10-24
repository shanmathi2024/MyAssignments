package week2.day3;

public class TestData {

	
	public void enterCredentials()
	{
		System.out.println("Enter the credentials details");
	}
	public void navigateToHomePage()
	{
	    System.out.println("Navigate to the home page...");	
	}
	
	public static void main(String[] args) {
		TestData d=new TestData();
		d.enterCredentials();
		d.navigateToHomePage();

	}

}
/*- Create a superclass as TestData.
Implement 2 methods: enterCredentials(), navigateToHomePage() in the TestData class.
- Create subclasses and create 2 methods in each
 LoginTestData
 - enterUsername()
 - enterPassword()
- Demonstrate the concept by creating objects for both classes and calling their methods.
*/