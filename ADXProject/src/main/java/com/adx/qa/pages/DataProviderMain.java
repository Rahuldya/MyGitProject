package com.adx.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.adx.qa.base.PageGeneric;

public class DataProviderMain extends PageGeneric{

	
	//Page Factory OR Repository
/*	
	@FindBy(xpath="//a[@title='My Account']")
	WebElement link;
	
	@FindBy(id="log")
	WebElement un;
	
	@FindBy(id="pwd")
	WebElement pw;
	
	@FindBy(id="login")
	WebElement login;
	
	public DataProviderMain()
	{
		PageFactory.initElements(driver, this);
	}
	
*/	
	public void logintest(String username,String password)
	{
		
		driver.findElement(By.xpath("//a[@title='My Account']")).click();
		driver.findElement(By.id("log")).sendKeys(username);
		driver.findElement(By.id("pwd")).sendKeys(password);
		driver.findElement(By.id("login")).click();
		//driver.findElement(By.xpath("//*[@id='account_logout']/a")).click();
		
	}
	
}
