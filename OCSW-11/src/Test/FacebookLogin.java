package Test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FacebookLogin {
	
	public static void main(String arg[])
	{
		System.out.println("Welcome to Facebook Login page:");
		System.setProperty("webdriver.ie.driver","C:/Users/eyyvrrl/Desktop/My_Ericsson_Learning/Selenium-Course/IEDriver/IEDriverServer.exe");
		
		WebDriver driver =new InternetExplorerDriver();
		driver.get("https://www.facebook.com/");
		String s= driver.getTitle();
		
		System.out.println("Title is:"+s);
		
		driver.findElement(By.name("email")).sendKeys("rahul.mits.mca@gmail.com");
	/*	driver.findElement(By.name("pass")).sendKeys("rahul1989");
		driver.findElement(By.id("loginbutton")).click();
		
	*/
		System.out.println(driver.findElement(By.name("email")).getText());
		/*
		driver.findElement(By.name("firstname")).sendKeys("Ram");
		driver.findElement(By.name("lastname")).sendKeys("Raj");
		driver.findElement(By.name("reg_email__")).sendKeys("ra2@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("ra2@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("ra@123");
		
		
		
		Select s1=new Select(driver.findElement(By.id("day")));
		s1.selectByIndex(3);
		
		Select s2=new Select(driver.findElement(By.id("month")));
		s2.selectByIndex(3);
		
		Select s3=new Select(driver.findElement(By.id("year")));
		s3.selectByIndex(3);
		
		driver.findElement(By.id("u_0_g")).click();
		
		driver.findElement(By.cssSelector("#birthday-help")).click();
		
		//driver.findElement(By.name("websubmit")).click();
		
		*/
		
		driver.close();
		
		
	}

}
