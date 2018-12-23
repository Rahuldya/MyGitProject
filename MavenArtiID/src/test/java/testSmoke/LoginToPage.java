package testSmoke;

import org.testng.annotations.Test;

import SmokeTest.LoginPage;

public class LoginToPage {
	
	@Test
	public void loginPage()
	{
		
		LoginPage l1 = new LoginPage();
		l1.login();
	}

}
