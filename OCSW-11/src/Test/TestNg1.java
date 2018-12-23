package Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class TestNg1 {
  @Test
  public void f() throws InterruptedException {
	  int i=0;
	  System.setProperty("webdriver.ie.driver","C:/Users/eyyvrrl/Desktop/My_Ericsson_Learning/Selenium-Course/IEDriver/IEDriverServer.exe");
	  //System.setProperty("webdriver.chrome.driver","C:/Users/eyyvrrl/Desktop/My_Ericsson_Learning/Selenium-Course/Chrome-driver1/chromedriver.exe");	
		WebDriver driver =new InternetExplorerDriver();
	  
	 // WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		//driver.findElement(By.id("lst-ib")).sendKeys("JAVA",Keys.ENTER);
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("JAVA",Keys.ENTER);
		
		List<WebElement> l2=driver.findElements(By.xpath("(//h3/a)"));
		for(i=0;i<l2.size();i++)
		{
			System.out.println(l2.get(i).getText());
			l2.get(i).click();
			System.out.println(driver.getTitle());
			driver.navigate().back();
			Thread.sleep(2000);
			System.out.println(l2.get(i+1).getText());
			
			//driver.navigate().refresh();
			
			
		}
		
		
		//System.out.println(driver.getTitle());
		
		
		driver.close();
		
  }
}
