package com.adx.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.adx.qa.base.PageGeneric;

public class DataProvider extends PageGeneric{

	
	//Page Factory OR Repository
	
	@FindBy(xpath=".//*[@id='account']/a")
	WebElement link;
	
	@FindBy(id="log")
	WebElement un;
	
	@FindBy(id="pwd")
	WebElement pw;
	
	@FindBy(id="login")
	WebElement login;
	
	public void logintest(String username,String password)
	{
		PageFactory.initElements(driver, this);
		
		link.click();
		un.sendKeys(username);
		pw.sendKeys(password);
		login.click();
		
	}
	
}
