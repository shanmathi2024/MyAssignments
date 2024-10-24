package week2.day3;

public class LoginTestData extends TestData {

	public void enterUsername() {
		
		String username = "shanmathi";
		System.out.println("Enter the username:"+username);
	}
	public void enterPassword()
	{
		String password="Sai@123";
		System.out.println("Enter the password:"+password);
	}
	public static void main(String[] args) {
		LoginTestData l=new LoginTestData();
		l.enterUsername();
		l.enterPassword();
		l.enterCredentials();
		l.navigateToHomePage();
	}

}
