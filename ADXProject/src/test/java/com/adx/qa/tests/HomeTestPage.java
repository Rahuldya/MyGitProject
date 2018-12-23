package com.adx.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.adx.qa.base.PageGeneric;
import com.adx.qa.pages.HomePage;
import com.adx.qa.pages.LoginPage;

public class HomeTestPage extends PageGeneric {
	
	HomePage hpage;
	LoginPage lpage;
	
	public HomeTestPage()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		initialiaztion();
		lpage=new LoginPage();
		hpage=lpage.login(prop.getProperty("username"), prop.getProperty("password"));	
	}
	
	@Test
	public void verifyHomeTitleTest()
	{
		String title = hpage.verifyHomePageTitle();
		Assert.assertEquals(title, "#1 Free CRM software in the cloud for sales and service","Not able to login Home Page");
	}
	

	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	
}
