package Test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class FbAccount {

	public static void main(String[] args) throws Exception {

		System.out.println("Welcome to Facebook Login page:");
		System.setProperty("webdriver.ie.driver","C:/Users/eyyvrrl/Desktop/My_Ericsson_Learning/Selenium-Course/IEDriver/IEDriverServer.exe");
		
		WebDriver driver =new InternetExplorerDriver();
		driver.get("https://www.facebook.com/");
		
		CreateAccopun ca = new CreateAccopun(driver);
		
		ca.getfirstname().sendKeys("Rahul");

	}

}
