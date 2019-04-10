package com.adx.qa.seleniumClass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class JavaScriptExecutorConcept {

	
	public static void main(String arg[])
	{
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver","C:/Users/eyyvrrl/Desktop/My_Ericsson_Learning/Selenium-Course/Browser-firfoxSW/geckodriver.exe");
		driver =new FirefoxDriver();
		
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.freecrm.com"); //enter URL
		
		driver.findElement(By.name("username")).sendKeys("naveenk");
		driver.findElement(By.name("password")).sendKeys("test@1234");
		//driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();
		
		WebElement loginBtn = driver.findElement(By.xpath("//input[contains(@type,'submit')]")); //login button
		String color = loginBtn.getCssValue("backgroundColor");
		for(int i=0;i<=20;i++)
		{
			changeColor("rgb(0,200,0)",loginBtn,driver);
			changeColor(color,loginBtn,driver);
		}
		drawBorder(loginBtn,driver);
		
	}
	public static void changeColor(String color,WebElement element,WebDriver driver)
	{
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.backgroundColor = '"+color+"'",  element);
	}
	public static void drawBorder(WebElement element,WebDriver driver)
	{
	  	JavascriptExecutor js = ((JavascriptExecutor) driver);
    	js.executeScript("arguments[0].style.border='3px solid red'", element);
	}
	
}
