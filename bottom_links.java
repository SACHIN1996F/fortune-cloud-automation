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

public class bottom_links {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		System.setProperty("WebDriver.driver.chrome","C:\\Users\\91928\\Desktop\\automation testing\\chromedriver_win32\\chromedrover.exe");
		driver=new ChromeDriver();
		driver.get("https://www.fortunecloudindia.com/");
	}
	
	@Test(priority=1)
	public void fortune_cloud() throws InterruptedException
	{
		Thread.sleep(3000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		
		WebElement f_cloud_link=driver.findElement(By.xpath("/html/body/footer/div/div[2]/div/div/div/div/p/a"));
		f_cloud_link.click();
		List<String>tab1=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab1.get(1));
	    Thread.sleep(3000);
	    List<String>tab=new ArrayList<String>(driver.getWindowHandles());
	    driver.switchTo().window(tab.get(0));
	}
	@Test(priority=2)
	public void term_condition() throws InterruptedException
	{
		Thread.sleep(3000);
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		WebElement term=driver.findElement(By.xpath("/html/body/footer/div/div[2]/div/div/div/ul/li[1]/a"));
		term.click();
	    Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(2000);
		JavascriptExecutor js11=(JavascriptExecutor)driver;
		js11.executeScript("window.scrollBy(0,200)");
		Thread.sleep(2000);
		JavascriptExecutor js2=(JavascriptExecutor)driver;
		js2.executeScript("window.scrollBy(0,200)");
		Thread.sleep(2000);
		JavascriptExecutor js3=(JavascriptExecutor)driver;
		js3.executeScript("window.scrollBy(0,200)");
		Thread.sleep(2000);
		JavascriptExecutor js4=(JavascriptExecutor)driver;
		js4.executeScript("window.scrollBy(0,200)");
		Thread.sleep(2000);
		JavascriptExecutor js5=(JavascriptExecutor)driver;
		js5.executeScript("window.scrollBy(0,200)");
		Thread.sleep(2000);
	    driver.navigate().back();
	}
	@Test(priority=3)
	public void privacy_policies() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement cross=driver.findElement(By.xpath("//*[@id=\"customizer\"]/span"));
		cross.click();
		Thread.sleep(2000);
		WebElement privacy=driver.findElement(By.xpath("/html/body/footer/div/div[2]/div/div/div/ul/li[2]"));
		privacy.click();
		 Thread.sleep(2000);
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,200)");
			Thread.sleep(2000);
			JavascriptExecutor js11=(JavascriptExecutor)driver;
			js11.executeScript("window.scrollBy(0,200)");
			Thread.sleep(2000);
			JavascriptExecutor js2=(JavascriptExecutor)driver;
			js2.executeScript("window.scrollBy(0,200)");
			Thread.sleep(2000);
			JavascriptExecutor js3=(JavascriptExecutor)driver;
			js3.executeScript("window.scrollBy(0,200)");
			Thread.sleep(2000);
			JavascriptExecutor js4=(JavascriptExecutor)driver;
			js4.executeScript("window.scrollBy(0,200)");
			Thread.sleep(2000);
			JavascriptExecutor js5=(JavascriptExecutor)driver;
			js5.executeScript("window.scrollBy(0,200)");
			Thread.sleep(2000);
		    driver.navigate().back();
		    System.out.println("test case pass");
	}
	/*@Test(priority=4)
      public void refund_policy() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement cross=driver.findElement(By.xpath("//*[@id=\"customizer\"]/span"));
		cross.click();
		Thread.sleep(2000);
		WebElement re__policy=driver.findElement(By.xpath("/html/body/footer/div/div[2]/div/div/div/ul/li[3]/a"));
		re__policy.click();
		 Thread.sleep(2000);
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,200)");
			Thread.sleep(2000);
			JavascriptExecutor js11=(JavascriptExecutor)driver;
			js11.executeScript("window.scrollBy(0,200)");
			Thread.sleep(2000);
			JavascriptExecutor js2=(JavascriptExecutor)driver;
			js2.executeScript("window.scrollBy(0,200)");
			Thread.sleep(2000);
			JavascriptExecutor js3=(JavascriptExecutor)driver;
			js3.executeScript("window.scrollBy(0,200)");
			Thread.sleep(2000);
		    driver.navigate().back();
	}*/
	
	
  @AfterTest
  public void f() 
  {
	  driver.close();
  }
}
