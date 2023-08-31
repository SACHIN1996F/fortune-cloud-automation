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

public class app_logo {
	WebDriver driver;
  @BeforeTest
  public void setup() 
  {
	  System.setProperty("WebDriver.chrome.driver","C:\\Users\\91928\\Desktop\\automation testing\\chromedriver_win32\\chromedriver/exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.fortunecloudindia.com/");
  }
  @Test(priority=1)
  public void Whatsapplogo()
  {
	  WebElement wlogo=driver.findElement(By.xpath("//*[@id=\"htc__header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a/i"));
	  wlogo.click();
	  List<String>tab=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab.get(1));
	  
  }
  @Test(priority=2)
  public void youtubelogo() throws InterruptedException
  {
	  List<String>tab=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab.get(0));
		Thread.sleep(3000);
	  WebElement ylogo=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div[2]/div/ul/li[2]/a/i"));
	  ylogo.click();
	  List<String>tab1=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab1.get(1));
  }
  @Test(priority=3)
  public void twitterlogo() throws InterruptedException
  {
	  List<String>tab=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab.get(0));
		Thread.sleep(3000);
	 WebElement tlogo=driver.findElement(By.xpath("//*[@id=\"htc__header\"]/div[1]/div/div/div[2]/div/ul/li[3]/a/i"));
	 tlogo.click();
	 List<String>tab1=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab1.get(1));
  }
  @Test(priority=4)
  public void instagramlogo() throws InterruptedException
  {
	  List<String>tab=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab.get(0));
		Thread.sleep(3000);
	  WebElement ilogo=driver.findElement(By.xpath("//*[@id=\"htc__header\"]/div[1]/div/div/div[2]/div/ul/li[4]/a/i"));
	  ilogo.click();
	  List<String>tab1=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab1.get(1));
  }
  @Test(priority=5)
  public void facebooklogo() throws InterruptedException
  {
	  List<String>tab=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab.get(0));
		Thread.sleep(3000);	
	  WebElement flogo=driver.findElement(By.xpath("//*[@id=\"htc__header\"]/div[1]/div/div/div[2]/div/ul/li[5]/a/i"));
	  flogo.click();
	  List<String>tab1=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab1.get(1));
		
		System.out.println("Test case logo pass");
  }
  @AfterTest
  public void close()
  {
	  driver.close();
  }
  
}
