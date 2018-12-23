package Test;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class Hello {
	
	public static void main(String[] arg) throws InterruptedException
	{
		System.out.println("hello java");
		
	//	System.setProperty("webdriver.firefox.marionette","C:/Users/eyyvrrl/Desktop/My_Ericsson_Learning/Selenium-Course/Browser-firfoxSW/geckodriver.exe");
		
		System.setProperty("webdriver.ie.driver","C:/Users/eyyvrrl/Desktop/My_Ericsson_Learning/Selenium-Course/IEDriver/IEDriverServer.exe");
		//FirefoxDriver f =new FirefoxDriver();
		
	//	ChromeDriver f1 =new ChromeDriver();
		
		//InternetExplorerDriver f = new InternetExplorerDriver();
		
		WebDriver f = new InternetExplorerDriver();
		
		
		
		//f.get("https://internal.ericsson.com/");
		
		//f.get("file:///C:/Users/eyyvrrl/Desktop/table.html");
		
		f.get("https://news.google.com/news/headlines?hl=en-IN&ned=in");
		
		//f.get("https://www.olx.in/");
		
		String s=f.getTitle();
		
		System.out.println("Title is:"+s);
		
		
		
		WebElement bb=f.findElement(By.xpath(".//*[@id='gb']/div[3]/div/c-wiz/div/div[1]/c-wiz/div/div[1]/div[1]/div[1]/content"));
		
		
		//WebElement bb=f.findElement(By.cssSelector("li[contains(text(),'Brazil (Brasil)')"));
		bb.click();
		
		System.out.println(bb.getTagName());
		
		
		
	// f.findElement(By.id("MENU-ITEM-TOOLS")).click();
	// f.findElement(By.cssSelector("li[class=ichLink][title=ESS/MSS]")).click();
		
		
	//String s1=f.findElement(By.xpath("(/html/body/table/tbody/tr[2]/td[1]")).getText();
	//System.out.println(s1);
		
		
		//f.quit();
		
		
	}
	
	

}
