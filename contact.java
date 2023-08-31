package project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class contact {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		System.setProperty("WebDriver.driver.chrome","C:\\Users\\91928\\Desktop\\automation testing\\chromedriver_win32\\chromedrover.exe");
		driver=new ChromeDriver();
		driver.get("https://www.fortunecloudindia.com/");
	}
	
	@Test(priority=1)
	public void contacts() throws InterruptedException
	{
		Thread.sleep(3000);
		WebElement cross=driver.findElement(By.xpath("//*[@id=\"customizer\"]/span"));
		cross.click();
		Thread.sleep(2000);
		WebElement contact=driver.findElement(By.xpath("//*[@id=\"sticky-header-with-topbar\"]/div/div/div/div[2]/nav/ul/li[9]/a"));
		contact.click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,200)");
		
		WebElement name=driver.findElement(By.xpath("//*[@id=\"fname\"]"));
		name.click();
		name.sendKeys("sachin fuse");
		Thread.sleep(2000);
		WebElement email=driver.findElement(By.xpath("//*[@id=\"email\"]"));
		email.click();
		email.sendKeys("sachin1996fuse@gmail.com");
		Thread.sleep(2000);
		WebElement phone=driver.findElement(By.xpath("//*[@id=\"tele\"]"));
		phone.click();
		phone.sendKeys("9876543210");
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollTo(0,100)");
		
		Thread.sleep(2000);
		WebElement massage=driver.findElement(By.xpath("//*[@id=\"subject\"]"));
		massage.click();
		massage.sendKeys("regarding to admission.");
		Thread.sleep(2000);
		
		WebElement submit=driver.findElement(By.xpath("//*[@id=\"submit\"]"));
		submit.click();
		Thread.sleep(2000);
		
		System.out.println("test case contact pass");
	}
  @Test
  public void f() 
  {
	  driver.close();
  }
}
