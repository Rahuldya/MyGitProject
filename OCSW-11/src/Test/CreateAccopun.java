package Test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAccopun {

	
	 WebDriver driver;

	public CreateAccopun(WebDriver driver)
	{
		this.driver = driver;
		
	}
	
	public WebElement getfirstname()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver.findElement(By.name("firstname"));
	}
	
}
