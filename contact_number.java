package project;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class contact_number
{
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		System.setProperty("WebDriver.chrome.driver,","C:\\Users\\91928\\Desktop\\automation testing\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("https://www.fortunecloudindia.com");

	}
  @Test(priority=1)
  public void contactnumber() throws InterruptedException 
  {
	 Thread.sleep(3000);
	  WebElement mobile=driver.findElement(By.xpath("//*[@id=\"htc__header\"]/div[1]/div/div/div[1]/div/ul/li[1]/a"));
	  mobile.click();
	List<String>tab=new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(tab.get(1));
	
  }
  @Test(priority=2)
  public void features() throws InterruptedException
  {
	  WebElement whats=driver.findElement(By.xpath("//*[@id=\"u_0_0_0W\"]/div/span[2]/a/span/img"));
	  whats.click();
	WebElement features=driver.findElement(By.xpath("//*[@id=\"u_0_7_ZL\"]"));
	features.click();
	Thread.sleep(2000);
	WebElement features1=driver.findElement(By.xpath("//*[@id=\"u_0_8_vX\"]/li[1]/a"));
	features1.click();
	Thread.sleep(2000);
	WebElement features2=driver.findElement(By.xpath("//*[@id=\"u_0_8_vX\"]/li[2]/a"));
	features2.click();
	Thread.sleep(2000);
	WebElement features3=driver.findElement(By.xpath("//*[@id=\"u_0_8_vX\"]/li[3]/a"));
	features3.click();
	Thread.sleep(2000);
	WebElement features4=driver.findElement(By.xpath("//*[@id=\"u_0_8_vX\"]/li[4]/a"));
	features4.click();
	Thread.sleep(2000);
	
	
	
	System.out.println("test case contact_number pass");
  }
	 
  
  @AfterTest
  public void close()
  
  {
	  driver.close();  
  }
}
