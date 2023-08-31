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



public class admission_form {
	WebDriver driver;
  @BeforeTest
  public void setup()
  {
	  System.setProperty("WebDriver.chrome.driver,","C:\\Users\\91928\\Desktop\\automation testing\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  
  }
  @Test(priority=1)
   public void web() throws InterruptedException
   {
	  driver.get("https://www.fortunecloudindia.com/");
	   Thread.sleep(3000);
   }
  @Test(priority=2)
  public void admission() throws InterruptedException
  {
	  WebElement admissionform=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div[1]/div/ul/li[3]/a"));
	  admissionform.click();
	  List<String>tab1=new ArrayList<String>(driver.getWindowHandles());
	  driver.switchTo().window(tab1.get(1));
	  Thread.sleep(5000);
	  close();
	  List<String>tab=new ArrayList<String>(driver.getWindowHandles());
	  driver.switchTo().window(tab.get(0));
	  Thread.sleep(2000);
	 
	  
	  
	  
	  System.out.println("Test case admission pass");
  }
  @AfterTest
  public void close() 
  {
	 driver.close();
	 
  }
}
  