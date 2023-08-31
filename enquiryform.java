package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class enquiryform 
{
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		System.setProperty("WebDriver.chrome.driver,","C:\\Users\\91928\\Desktop\\automation testing\\chromedriver_win32\\chromedriver/exe");
		  driver=new ChromeDriver();
		  
	}
	
  @Test(priority=1)
  public void enquiry() throws InterruptedException 
  {
	  driver.get("https://www.fortunecloudindia.com/");
	  Thread.sleep(3000);
	  WebElement name=driver.findElement(By.xpath("//*[@id=\"fname1\"]"));
		 name.click();
		 name.sendKeys("sachin raju fuse");
		  Thread.sleep(2000);
		  WebElement email=driver.findElement(By.xpath("//*[@id=\"email2\"]"));
		  email.click();
		  email.sendKeys("sachinfuse@gmail.com");
		  Thread.sleep(2000);
		  WebElement phone=driver.findElement(By.xpath("//*[@id=\"tele1\"]"));
		  phone.click();
		  phone.sendKeys("9876543210");
		  Thread.sleep(2000);
		  WebElement subject=driver.findElement(By.xpath("//*[@id=\"subject1\"]"));
		  subject.click();
		  subject.sendKeys("regarding to admission.");
		  Thread.sleep(2000);
		  WebElement send=driver.findElement(By.xpath("//*[@id=\"submit1\"]"));
		  send.click();
		  Thread.sleep(4000);
	  }
  @Test(priority=2)
  public void wrung_mail() throws InterruptedException
  {
	  Thread.sleep(3000);
	  WebElement name=driver.findElement(By.xpath("//*[@id=\"fname1\"]"));
		 name.click();
		 name.sendKeys("sachin raju fuse");
		  Thread.sleep(2000);
		  WebElement email=driver.findElement(By.xpath("//*[@id=\"email2\"]"));
		  email.click();
		  email.sendKeys("sachinfuse2gmail.com");
		  Thread.sleep(2000);
		  WebElement phone=driver.findElement(By.xpath("//*[@id=\"tele1\"]"));
		  phone.click();
		  phone.sendKeys("9876543210");
		  Thread.sleep(2000);
		  WebElement subject=driver.findElement(By.xpath("//*[@id=\"subject1\"]"));
		  subject.click();
		  subject.sendKeys("regarding to admission.");
		  Thread.sleep(2000);
		  WebElement send=driver.findElement(By.xpath("//*[@id=\"submit1\"]"));
		  send.click();
		 
		  
		  
		  System.out.println("test case enquiry form pass");
  }
   @AfterTest
   public void close()
	{
      
	}
	  
  }


