package project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class up_word_arrow {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		System.setProperty("WebDriver.driver.chrome","C:\\Users\\91928\\Desktop\\automation testing\\chromedriver_win32\\chromedrover.exe");
		driver=new ChromeDriver();
		driver.get("https://www.fortunecloudindia.com/");
	}
	@Test(priority=1)
	public void pre_upward() throws InterruptedException
	{
		Thread.sleep(2000);
		//click on home button
		WebElement home=driver.findElement(By.xpath("//*[@id=\"sticky-header-with-topbar\"]/div/div/div/div[2]/nav/ul/li[2]/a"));
		home.click();
		Thread.sleep(5000);
		//close the enquiry form
		WebElement close=driver.findElement(By.xpath("//*[@id=\"customizer\"]/span"));
		close.click();
		Thread.sleep(1000);
		//slide downward
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}
	@Test(priority=2)
	public void up_ward_button() throws InterruptedException
	{
		Thread.sleep(3000);
		WebElement up_arrow=driver.findElement(By.xpath("//*[@id=\"scrollUp\"]/i"));
		up_arrow.click();
		Thread.sleep(1000);
	}
  @AfterTest
  public void f() 
  {
	driver.close();
  }
}
