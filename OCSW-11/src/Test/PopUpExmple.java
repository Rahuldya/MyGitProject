package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class PopUpExmple {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.ie.driver","C:/Users/eyyvrrl/Desktop/My_Ericsson_Learning/Selenium-Course/IEDriver/IEDriverServer.exe");
	  //System.setProperty("webdriver.firefox.marionette","C:/Users/eyyvrrl/Desktop/My_Ericsson_Learning/Selenium-Course/Browser-firfoxSW/geckodriver.exe");
		WebDriver driver =new InternetExplorerDriver();
	 // WebDriver driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//driver.get("https://www.irctc.co.in/");
		driver.get("http://toolsqa.wpengine.com/handling-alerts-using-selenium-webdriver/");
		// This step will result in an alert on screen
		//Thread.sleep(6000);
				driver.findElement(By.xpath("//*[@id='content']/p[4]/button")).click();
		
				Alert simpleAlert = driver.switchTo().alert();
				String alertText = simpleAlert.getText();
				System.out.println("Alert text is " + alertText);
				simpleAlert.accept();
		//driver.findElement(By.xpath(".//*[@id='loginbutton']")).click();
		//Alert al=driver.switchTo().alert();
		//al.accept();
		/*//driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.id("Email")).sendKeys("rahul198933@gmail.com");
		driver.findElement(By.id("next")).click();
		driver.findElement(By.id("Passwd")).sendKeys("lakhanrahul",Keys.ENTER);
		driver.findElement(By.className("gb_b gb_eb gb_R")).click();
		//driver.findElement(By.linkText("gb_9a gbii")).click();
		driver.findElement(By.linkText("Sign out")).click();
		*/
				
				driver.close();
		
  }
}
