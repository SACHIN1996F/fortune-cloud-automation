package project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class gallary {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
	  System.setProperty("WebDriver.chrome.driver,","C:\\Users\\91928\\Desktop\\automation testing\\chromedriver_win32\\chromedriver/exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.fortunecloudindia.com/");
	}
	@Test(priority=1)
	public void gallarys() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement close=driver.findElement(By.xpath("//*[@id=\"customizer\"]/span"));
		close.click();
		Thread.sleep(2000);
		WebElement gallary=driver.findElement(By.xpath("//*[@id=\"sticky-header-with-topbar\"]/div/div/div/div[2]/nav/ul/li[8]/a"));
		gallary.click();
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200)");
        Thread.sleep(1000);
        JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("window.scrollBy(0,200)");
        Thread.sleep(1000);
        JavascriptExecutor js2=(JavascriptExecutor)driver;
		js2.executeScript("window.scrollBy(0,200)");
        Thread.sleep(1000);
        JavascriptExecutor js3=(JavascriptExecutor)driver;
		js3.executeScript("window.scrollBy(0,200)");
        Thread.sleep(1000);
        JavascriptExecutor js4=(JavascriptExecutor)driver;
		js4.executeScript("window.scrollBy(0,100)");
		Thread.sleep(1000);
		
		
		System.out.println("gallary pass");
	}
  @Test
  public void f()
  {
	  
  }
}
