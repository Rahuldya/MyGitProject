package com.adx.qa.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.adx.qa.base.PageGeneric;
import com.adx.qa.pages.DataProviderMain;

public class DataProviderTest extends PageGeneric {
	
	DataProviderMain dp;
	
	@DataProvider(name="authentication")
	public static Object[][] credential()
	{
		Object obj[][]={{"admin","admin"},{"user","user"}};
		return obj;
	}
	
	@Test(dataProvider="authentication")
	public void test(String username,String password)
	{
		initialiaztion();
		 dp=new DataProviderMain();
		 dp.logintest(username, password);
		
		System.out.println(username);
	}

}
