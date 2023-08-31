package project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class re_views {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		System.setProperty("WebDriver.Driver.Chrome","C:\\Users\\91928\\Desktop\\automation testing\\chromedriver_win32\\chromedriver.exe");
		driver=new  ChromeDriver();
		driver.get("https://www.fortunecloudindia.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void reviews() throws InterruptedException
	{
		Thread.sleep(3000);
		WebElement review=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/div/div[2]/nav/ul/li[6]/a"));
		review.click();
		Thread.sleep(3000);
		
		
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
		js4.executeScript("window.scrollBy(0,200)");
		Thread.sleep(1000);
		JavascriptExecutor js5=(JavascriptExecutor)driver;
		js5.executeScript("window.scrollBy(0,200)");
		Thread.sleep(1000);
		JavascriptExecutor js6=(JavascriptExecutor)driver;
		js6.executeScript("window.scrollBy(0,200)");
		Thread.sleep(1000);
		JavascriptExecutor js7=(JavascriptExecutor)driver;
		js7.executeScript("window.scrollBy(0,200)");
		Thread.sleep(1000);
		JavascriptExecutor js8=(JavascriptExecutor)driver;
		js8.executeScript("window.scrollBy(0,200)");
		Thread.sleep(1000);
		JavascriptExecutor js9=(JavascriptExecutor)driver;
		js9.executeScript("window.scrollBy(0,200)");
		Thread.sleep(1000);
		JavascriptExecutor js0=(JavascriptExecutor)driver;
		js0.executeScript("window.scrollBy(0,200)");
		Thread.sleep(1000);
		JavascriptExecutor js10=(JavascriptExecutor)driver;
		js10.executeScript("window.scrollBy(0,200)");
		Thread.sleep(1000);
		JavascriptExecutor js11=(JavascriptExecutor)driver;
		js11.executeScript("window.scrollBy(0,200)");
		Thread.sleep(1000);
		JavascriptExecutor js12=(JavascriptExecutor)driver;
		js12.executeScript("window.scrollBy(0,200)");
		Thread.sleep(1000);
		JavascriptExecutor js13=(JavascriptExecutor)driver;
		js13.executeScript("window.scrollBy(0,200)");
		Thread.sleep(1000);
		JavascriptExecutor js14=(JavascriptExecutor)driver;
		js14.executeScript("window.scrollBy(0,200)");
		Thread.sleep(1000);
		JavascriptExecutor js15=(JavascriptExecutor)driver;
		js15.executeScript("window.scrollBy(0,200)");
		Thread.sleep(1000);
		JavascriptExecutor js16=(JavascriptExecutor)driver;
		js16.executeScript("window.scrollBy(0,200)");
		Thread.sleep(1000);
		JavascriptExecutor js17=(JavascriptExecutor)driver;
		js17.executeScript("window.scrollBy(0,200)");
		Thread.sleep(1000);
		JavascriptExecutor js18=(JavascriptExecutor)driver;
		js18.executeScript("window.scrollBy(0,200)");
		Thread.sleep(1000);
		JavascriptExecutor js19=(JavascriptExecutor)driver;
		js19.executeScript("window.scrollBy(0,200)");
		Thread.sleep(1000);
		JavascriptExecutor js20=(JavascriptExecutor)driver;
		js20.executeScript("window.scrollBy(0,200)");
		Thread.sleep(1000);
		JavascriptExecutor js21=(JavascriptExecutor)driver;
		js21.executeScript("window.scrollBy(0,200)");
		Thread.sleep(1000);
		JavascriptExecutor js22=(JavascriptExecutor)driver;
		js22.executeScript("window.scrollBy(0,200)");
		Thread.sleep(1000);
		JavascriptExecutor js23=(JavascriptExecutor)driver;
		js23.executeScript("window.scrollBy(0,200)");
		Thread.sleep(1000);
		JavascriptExecutor js24=(JavascriptExecutor)driver;
		js24.executeScript("window.scrollBy(0,200)");
		Thread.sleep(1000);
		JavascriptExecutor js25=(JavascriptExecutor)driver;
		js25.executeScript("window.scrollBy(0,200)");
		Thread.sleep(1000);
		JavascriptExecutor js26=(JavascriptExecutor)driver;
		js26.executeScript("window.scrollBy(0,200)");
		Thread.sleep(1000);
		JavascriptExecutor js27=(JavascriptExecutor)driver;
		js27.executeScript("window.scrollBy(0,200)");
		Thread.sleep(1000);
		JavascriptExecutor js28=(JavascriptExecutor)driver;
		js28.executeScript("window.scrollBy(0,200)");
		Thread.sleep(1000);
		JavascriptExecutor js29=(JavascriptExecutor)driver;
		js29.executeScript("window.scrollBy(0,200)");
		Thread.sleep(1000);
		JavascriptExecutor js30=(JavascriptExecutor)driver;
		js30.executeScript("window.scrollBy(0,200)");
		Thread.sleep(1000);
		JavascriptExecutor js31=(JavascriptExecutor)driver;
		js31.executeScript("window.scrollBy(0,200)");
		Thread.sleep(1000);
		JavascriptExecutor js32=(JavascriptExecutor)driver;
		js32.executeScript("window.scrollBy(0,200)");
		Thread.sleep(1000);
		JavascriptExecutor js33=(JavascriptExecutor)driver;
		js33.executeScript("window.scrollBy(0,200)");
		Thread.sleep(1000);
		JavascriptExecutor js34=(JavascriptExecutor)driver;
		js34.executeScript("window.scrollBy(0,200)");
		Thread.sleep(1000);
		JavascriptExecutor js35=(JavascriptExecutor)driver;
		js35.executeScript("window.scrollBy(0,200)");
		Thread.sleep(1000);
		JavascriptExecutor js36=(JavascriptExecutor)driver;
		js36.executeScript("window.scrollBy(0,200)");
		Thread.sleep(1000);
		JavascriptExecutor js37=(JavascriptExecutor)driver;
		js37.executeScript("window.scrollBy(0,200)");
		Thread.sleep(1000);
		JavascriptExecutor js38=(JavascriptExecutor)driver;
		js38.executeScript("window.scrollBy(0,200)");
		Thread.sleep(1000);
		JavascriptExecutor js39=(JavascriptExecutor)driver;
		js39.executeScript("window.scrollBy(0,200)");
		Thread.sleep(1000);
		JavascriptExecutor js40=(JavascriptExecutor)driver;
		js40.executeScript("window.scrollBy(0,200)");
		Thread.sleep(1000);
		JavascriptExecutor js41=(JavascriptExecutor)driver;
		js41.executeScript("window.scrollBy(0,200)");
		Thread.sleep(1000);
		JavascriptExecutor js42=(JavascriptExecutor)driver;
		js42.executeScript("window.scrollBy(0,200)");
		Thread.sleep(1000);
		JavascriptExecutor js43=(JavascriptExecutor)driver;
		js43.executeScript("window.scrollBy(0,200)");
		Thread.sleep(1000);
		JavascriptExecutor js44=(JavascriptExecutor)driver;
		js44.executeScript("window.scrollBy(0,200)");
		Thread.sleep(1000);
		JavascriptExecutor js45=(JavascriptExecutor)driver;
		js45.executeScript("window.scrollBy(0,200)");
		Thread.sleep(1000);
		JavascriptExecutor js46=(JavascriptExecutor)driver;
		js46.executeScript("window.scrollBy(0,200)");
		Thread.sleep(1000);
		JavascriptExecutor js47=(JavascriptExecutor)driver;
		js47.executeScript("window.scrollBy(0,200)");
		Thread.sleep(1000);
		JavascriptExecutor js48=(JavascriptExecutor)driver;
		js48.executeScript("window.scrollBy(0,200)");
		Thread.sleep(1000);
		JavascriptExecutor js49=(JavascriptExecutor)driver;
		js49.executeScript("window.scrollBy(0,200)");
		Thread.sleep(1000);
		JavascriptExecutor js50=(JavascriptExecutor)driver;
		js50.executeScript("window.scrollBy(0,200)");
		Thread.sleep(1000);
		JavascriptExecutor js51=(JavascriptExecutor)driver;
		js51.executeScript("window.scrollBy(0,200)");
		Thread.sleep(1000);
		JavascriptExecutor js52=(JavascriptExecutor)driver;
		js52.executeScript("window.scrollBy(0,200)");
		Thread.sleep(1000);
		JavascriptExecutor js53=(JavascriptExecutor)driver;
		js53.executeScript("window.scrollBy(0,200)");
		Thread.sleep(1000);
		JavascriptExecutor js54=(JavascriptExecutor)driver;
		js54.executeScript("window.scrollBy(0,200)");
		Thread.sleep(1000);
		JavascriptExecutor js55=(JavascriptExecutor)driver;
		js55.executeScript("window.scrollBy(0,200)");
		Thread.sleep(1000);
		JavascriptExecutor js56=(JavascriptExecutor)driver;
		js56.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		Thread.sleep(1000);
		
		System.out.println("re view pass");
	}
	
  @Test
  public void f() 
  {
	  driver.close();
  }
}
