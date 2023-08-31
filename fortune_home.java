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

public class fortune_home 
{
	WebDriver driver;
  @BeforeTest
  public void setup() 
  {
	  System.setProperty("WebDriver.chrome.driver,","C:\\Users\\91928\\Desktop\\automation testing\\chromedriver_win32\\chromedriver/exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.fortunecloudindia.com/");
  }
  @Test(priority=1)
  public void home() throws InterruptedException
  {
	  WebElement home=driver.findElement(By.xpath("//*[@id=\"sticky-header-with-topbar\"]/div/div/div/div[2]/nav/ul/li[2]/a"));
	  home.click();
	  Thread.sleep(2000);
	  WebElement mobile=driver.findElement(By.xpath("//*[@id=\"htc__header\"]/div[1]/div/div/div[1]/div/ul/li[1]/a"));
	  mobile.click();
	  List<String>tab=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab.get(1));
		
  }
  @Test(priority=2)
  public void mail_id() throws InterruptedException
  {
	  List<String>tab=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab.get(0));
		
		Thread.sleep(2000);
	  WebElement email=driver.findElement(By.xpath("//*[@id=\"htc__header\"]/div[1]/div/div/div[1]/div/ul/li[2]/a"));
	  email.click();
	  
	  List<String>tab1=new ArrayList<String>(driver.getWindowHandles());
	  driver.switchTo().window(tab1.get(1));
	  Thread.sleep(3000);
	 
  }
  @Test(priority=3)
  public void admission_form() throws InterruptedException 
  {
	  List<String>tab=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab.get(0));
		
	  WebElement aform=driver.findElement(By.xpath("//*[@id=\"htc__header\"]/div[1]/div/div/div[1]/div/ul/li[3]/a"));
	  aform.click();
	  
	  List<String>tab1=new ArrayList<String>(driver.getWindowHandles());
	  driver.switchTo().window(tab1.get(1)); 
	  Thread.sleep(3000);  
  }
  
  @Test(priority=4)
  public void logo() throws InterruptedException
  {
	  List<String>tab2=new ArrayList<String>(driver.getWindowHandles());
	  driver.switchTo().window(tab2.get(0)); 
	  Thread.sleep(2000);
	  WebElement wlogo=driver.findElement(By.xpath("//*[@id=\"htc__header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a/i"));
	  wlogo.click(); 
	  List<String>tab=new ArrayList<String>(driver.getWindowHandles());
	  driver.switchTo().window(tab.get(1)); 
  }
  @Test(priority=5)
  public void youtube() throws InterruptedException 
  {
	  List<String>tab2=new ArrayList<String>(driver.getWindowHandles());
	  driver.switchTo().window(tab2.get(0)); 
	Thread.sleep(2000);
	WebElement youtube=driver.findElement(By.xpath("//*[@id=\"htc__header\"]/div[1]/div/div/div[2]/div/ul/li[2]/a"));
	youtube.click();
	List<String>tab=new ArrayList<String>(driver.getWindowHandles());
	  driver.switchTo().window(tab.get(1)); 
	  
  }
  @Test(priority=6)
  public void twitter() throws InterruptedException
  {
	  List<String>tab2=new ArrayList<String>(driver.getWindowHandles());
	  driver.switchTo().window(tab2.get(0));
	  Thread.sleep(2000);
	  WebElement twitter=driver.findElement(By.xpath("//*[@id=\"htc__header\"]/div[1]/div/div/div[2]/div/ul/li[3]/a/i"));
	  twitter.click();
	  List<String>tab=new ArrayList<String>(driver.getWindowHandles());
	  driver.switchTo().window(tab.get(1)); 
	  
  }
  @Test(priority=7)
  public void insta() throws InterruptedException
  {
	  List<String>tab2=new ArrayList<String>(driver.getWindowHandles());
	  driver.switchTo().window(tab2.get(0));
	  Thread.sleep(2000);
	  WebElement insta=driver.findElement(By.xpath("//*[@id=\"htc__header\"]/div[1]/div/div/div[2]/div/ul/li[4]/a/i"));
	  insta.click();
	  List<String>tab=new ArrayList<String>(driver.getWindowHandles());
	  driver.switchTo().window(tab.get(1));
  }
  @Test(priority=9)
  public void fb() throws InterruptedException
  {
	  List<String>tab2=new ArrayList<String>(driver.getWindowHandles());
	  driver.switchTo().window(tab2.get(0));
	  Thread.sleep(2000);
	  WebElement fb=driver.findElement(By.xpath("//*[@id=\"htc__header\"]/div[1]/div/div/div[2]/div/ul/li[5]/a/i"));
	  fb.click();
	  List<String>tab=new ArrayList<String>(driver.getWindowHandles());
	  driver.switchTo().window(tab.get(1));
  }
  @Test(priority=10)
  public void slogin() throws InterruptedException
  {
	  
	  List<String>tab2=new ArrayList<String>(driver.getWindowHandles());
	  driver.switchTo().window(tab2.get(0));
	  Thread.sleep(2000);
	  WebElement slogin=driver.findElement(By.xpath("//*[@id=\"htc__header\"]/div[1]/div/div/div[2]/div/ul/li[6]/a/b"));
	  slogin.click();
	 Thread.sleep(2000);
	 WebElement mail=driver.findElement(By.xpath("//*[@id=\"id_username\"]"));
	 mail.click();
	 mail.sendKeys("sachin1996fuse@gmail.com");
	 WebElement pass=driver.findElement(By.xpath("//*[@id=\"id_password\"]"));
	 pass.click();
	 pass.sendKeys("8624921338S199621");
	 WebElement log=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/form/input[2]"));
	 log.click();
	  List<String>tab=new ArrayList<String>(driver.getWindowHandles());
	  driver.switchTo().window(tab.get(1));
	  Thread.sleep(2000);
	  
	  
	  
	  
	  System.out.println("home done");
  }
  @AfterTest
  public void close()
  {
	  driver.close();
  }
}
