package com.adx.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.adx.qa.base.PageGeneric;

public class LoginPage extends PageGeneric {

	
	//Page Factory OR Repository
	
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="/html/body/div[2]/div/div[3]/form/div/div/input")
	WebElement loginBtn;
	
	@FindBy(xpath="//a[contains(text(),'Sign Up')]")
	WebElement SignupBtn;
	
	@FindBy(xpath="/html/body/div[2]/div/div[1]/a/img")
	WebElement imgbtn;
	
	public LoginPage()
	{
		
		PageFactory.initElements(driver, this);
	}
	
	public String validateTitle()
	{
		return driver.getTitle();
	}
	
	public boolean validateImage()
	{
		return imgbtn.isDisplayed();
	}
	
	public HomePage login(String un,String pw)
	{
		username.sendKeys(un);
		password.sendKeys(pw);
		loginBtn.submit();
		
		return new HomePage();
	}
	
	
}
