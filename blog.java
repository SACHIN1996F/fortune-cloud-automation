package project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class blog {
	WebDriver driver;
	@BeforeTest
	public void setup() throws InterruptedException
	{
		System.setProperty("WebDriver.Driver.Chrome","C:\\Users\\91928\\Desktop\\automation testing\\chromedriver_win32\\chromedriver.exe");
		driver=new  ChromeDriver();
		driver.get("https://www.fortunecloudindia.com/");
		
	}
	@Test(priority=1)
	public void blogs() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement Ecross=driver.findElement(By.xpath("//*[@id=\"customizer\"]/span"));
		Ecross.click();
		Thread.sleep(2000);
		WebElement blogss=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/div/div[2]/nav/ul/li[7]/a"));
		blogss.click();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(1000);
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("window.scrollBy(0,300)");
		Thread.sleep(1000);
		
		
		WebElement read1=driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div/div[1]/div/div[2]/div/a"));
		read1.click();
		JavascriptExecutor js2=(JavascriptExecutor)driver;
		js2.executeScript("window.scrollBy(0,200)");
		Thread.sleep(1000);
		JavascriptExecutor js3=(JavascriptExecutor)driver;
		js3.executeScript("window.scrollBy(0,200)");
		Thread.sleep(1000);
		JavascriptExecutor js4=(JavascriptExecutor)driver;
		js4.executeScript("window.scrollBy(0,200)");
		Thread.sleep(1000);
		JavascriptExecutor js5=(JavascriptExecutor)driver;
		js5.executeScript("window.scrollBy(0,200)");
		Thread.sleep(2000);
		driver.navigate().back();
		
		WebElement read2=driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div/div[2]/div/div[2]/div/a"));
		read2.click();
		Thread.sleep(2000);
		JavascriptExecutor js6=(JavascriptExecutor)driver;
		js6.executeScript("window.scrollBy(0,200)");	
		Thread.sleep(1000);
		JavascriptExecutor js7=(JavascriptExecutor)driver;
		js7.executeScript("window.scrollBy(0,200)");
		Thread.sleep(2000);
		driver.navigate().back();
		
		WebElement read3=driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div/div[3]/div/div[2]/div/a"));
		read3.click();
		Thread.sleep(2000);
		JavascriptExecutor js8=(JavascriptExecutor)driver;
		js8.executeScript("window.scrollBy(0,200)");
		Thread.sleep(2000);
		driver.navigate().back();
		
		
		System.out.println("Test case blog pass");
	}
  @AfterTest
  public void f() 
  {
	  driver.close(); 
  }
}
