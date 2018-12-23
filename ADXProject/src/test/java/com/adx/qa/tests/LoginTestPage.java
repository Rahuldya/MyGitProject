package com.adx.qa.tests;

import org.testng.Assert;
import org.testng.annotations.*;

import com.adx.qa.base.PageGeneric;
import com.adx.qa.pages.HomePage;
import com.adx.qa.pages.LoginPage;

public class LoginTestPage extends PageGeneric{
	
	LoginPage lpage;
	HomePage hpage;
	
	public LoginTestPage()
	{
		super();
		
	}
	
	@BeforeMethod
	public void setup()
	{
		initialiaztion();
		lpage = new LoginPage();
	}
	
	@Test(priority=1)
	public void checkTitle()
	{
		String title=lpage.validateTitle();
		Assert.assertEquals(title, "#1 Free CRM software in the cloud for sales and service");
	}
	
	@Test(priority=2)
	public void checkImage()
	{
		boolean img=lpage.validateImage();
		Assert.assertTrue(img);
	}

	@Test(priority=3)
	public void loginToPage()
	{
		hpage=lpage.login(prop.getProperty("username"), prop.getProperty("password"));
		System.out.println(hpage.verifyHomePageTitle());
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
