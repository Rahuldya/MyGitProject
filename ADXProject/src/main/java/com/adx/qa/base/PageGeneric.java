package com.adx.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class PageGeneric {
	
	
	public static WebDriver driver;
	public static Properties prop;
	
	
	public PageGeneric()
	{
		prop = new Properties();
		try {
			FileInputStream	fis = new FileInputStream("C:\\Users\\eyyvrrl\\workspace\\ADXProject\\src\\main\\java\\com\\adx\\qa\\envVariable\\config.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void initialiaztion()
	{
		String browserName = prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("internet"))
		{
			System.setProperty("webdriver.ie.driver","C:/Users/eyyvrrl/Desktop/My_Ericsson_Learning/Selenium-Course/IEDriver/IEDriverServer.exe");
			driver =new InternetExplorerDriver();
		}
		 if(browserName.equalsIgnoreCase("FF"))
		{
			System.setProperty("webdriver.gecko.driver","C:/Users/eyyvrrl/Desktop/My_Ericsson_Learning/Selenium-Course/Browser-firfoxSW/geckodriver.exe");
			driver =new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
	}

}
