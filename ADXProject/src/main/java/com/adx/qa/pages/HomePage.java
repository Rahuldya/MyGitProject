package com.adx.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.adx.qa.base.PageGeneric;

public class HomePage extends PageGeneric {

	@FindBy(xpath="//td[contains(text(),'User: Rahul Yadav')]")
	WebElement userNamelable; 
	
	@FindBy(xpath="//a[contains(text(),'Contacts')]")
	WebElement Contactslist; 
	
	@FindBy(xpath="//a[contains(text(),'Deals')]")
	WebElement deallist; 
	
	@FindBy(xpath="//a[contains(text(),'Tasks')]")
	WebElement Taskllist; 
	
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle()
	{
		return driver.getTitle();
	}
	
	
}
