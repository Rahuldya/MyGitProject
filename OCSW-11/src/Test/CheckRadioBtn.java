package Test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckRadioBtn {

	public static void main(String s[])
	{
		System.out.println("Check Radio button is selected or not:");
		System.setProperty("webdriver.ie.driver","C:/Users/eyyvrrl/Desktop/My_Ericsson_Learning/Selenium-Course/IEDriver/IEDriverServer.exe");
		
		WebDriver driver =new InternetExplorerDriver();
		
		
		driver.get("https://www.facebook.com/");
		
		
		//driver.get("http://toolsqa.com/automation-practice-form/");
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		System.out.println("Page Title is :"+driver.getTitle());
		
		List<WebElement> radiobtn = driver.findElements(By.name("sex"));
		boolean bvalue = false;
		
		//radiobtn.get(0).click();
		
		bvalue = radiobtn.get(0).isSelected();
		
		if (bvalue==true)
		{
			radiobtn.get(1).click();
		}
		else
		{
			radiobtn.get(0).click();
			
		}
		
		
		       // program to find   the Check Box by Name
		        
		  /*     List<WebElement> chkboxbtn = driver.findElements(By.name("tool"));
		       
		       int size = chkboxbtn.size();
		       
		       for(int i=0;i<size;i++)
		       {
		    	   String s2=chkboxbtn.get(i).getAttribute("value");
		    	   
		    	   if(s2.equalsIgnoreCase("Automation Tester"))
		    	   {
		    		   chkboxbtn.get(i).click();
		    		   break;
		    	   }
		    	   
		       }
		    */
		// select total number of element from dropdown list
		
		Select drop = new Select(driver.findElement(By.id("month")));
		
		List <WebElement> l1 = drop.getOptions();
		
		int size1 =l1.size();
		
		for(int i=0;i<size1;i++)
		{
			System.out.println(l1.get(i).getText());
		}
		
		//driver.close();
		
		//select Drop down list using Index,value and Text
		
		Select s1 =new Select(driver.findElement(By.id("month")));
		List <WebElement> l2 = s1.getOptions();
		int len = l2.size();
		for (int i =0;i<len;i++)
		{
			
			if(l2.get(i).getText().equalsIgnoreCase("mar"))
			{
				s1.selectByIndex(i);
				break;
			}
		}
		
		driver.close();
	}
}
