package project;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class contact_bottom_logo {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		System.setProperty("WebDriver.driver.chrome","C:\\Users\\91928\\Desktop\\automation testing\\chromedriver_win32\\chromedrover.exe");
		driver=new ChromeDriver();
		driver.get("https://www.fortunecloudindia.com/");
	}
	@Test(priority=1)
	public void contact_logo() throws InterruptedException
	{
		Thread.sleep(3000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}
	@Test(priority=2)
	public void whats_app() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement whats_app=driver.findElement(By.xpath("/html/body/footer/div/div[1]/div/div[1]/div/div/ul[2]/li[1]"));
		whats_app.click();
		List<String>tab=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab.get(1));
		Thread.sleep(2000);
		List<String>tab1=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab1.get(0));
	}
	@Test(priority=3)
	public void youtube() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement youtube=driver.findElement(By.xpath("/html/body/footer/div/div[1]/div/div[1]/div/div/ul[2]/li[2]/a"));
		youtube.click();
		List<String>tab=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab.get(1));
		Thread.sleep(2000);
		List<String>tab1=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab1.get(0));
	}
	@Test(priority=4)
	public void twitter() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement twitteer=driver.findElement(By.xpath("/html/body/footer/div/div[1]/div/div[1]/div/div/ul[2]/li[3]/a"));
		twitteer.click();
		List<String>tab=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab.get(1));
		Thread.sleep(2000);
		List<String>tab1=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab1.get(0));
	}
	@Test(priority=5)
	public void insta() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement instagram=driver.findElement(By.xpath("/html/body/footer/div/div[1]/div/div[1]/div/div/ul[2]/li[4]/a"));
		instagram.click();
		List<String>tab=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab.get(1));
		Thread.sleep(2000);
		List<String>tab1=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab1.get(0));	
	}
	@Test(priority=6)
	public void facebook() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement fb=driver.findElement(By.xpath("/html/body/footer/div/div[1]/div/div[1]/div/div/ul[2]/li[5]/a"));
		fb.click();
		List<String>tab=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab.get(1));
		Thread.sleep(2000);
		List<String>tab1=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab1.get(0));
		System.out.println("test case contact bottom logo pass");
	}
  @AfterTest
  public void f() 
  {
	  driver.close();
  }
}
