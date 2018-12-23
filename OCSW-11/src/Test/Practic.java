package Test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Practic {
	
	public static void main(String arg[])
	{
		
		System.out.println("Hello Welcome to Automation Practice:");
		
		System.setProperty("webdriver.ie.driver","C:/Users/eyyvrrl/Desktop/My_Ericsson_Learning/Selenium-Course/IEDriver/IEDriverServer.exe");
		
		WebDriver driver =new InternetExplorerDriver();
		
		//// Launch the ToolsQA WebSite
		driver.get("https://toolsqa.wpengine.com/Automation-practice-form/");
		String s=driver.getTitle();
		System.out.println("Title is :"+s);
		driver.findElement(By.name("firstname")).sendKeys("Rahul");
		driver.findElement(By.name("lastname")).sendKeys("Yadav");
		driver.findElement(By.id("submit")).click();;
		
		System.out.println("Program End");
		driver.close();
		
	}

}
