package project;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AboutUs {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91928\\Desktop\\automation testing\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.fortunecloudindia.com/");
	}
  @Test(priority=1)
  public void aboutus() throws InterruptedException 
  {
	  Thread.sleep(2000);
	  WebElement about=driver.findElement(By.xpath("//*[@id=\"sticky-header-with-topbar\"]/div/div/div/div[2]/nav/ul/li[3]/a"));
	  about.click();
	Thread.sleep(2000);
	JavascriptExecutor js1 = (JavascriptExecutor) driver;
	js1.executeScript("window.scrollTo(0,100)");
	
	JavascriptExecutor js2 = (JavascriptExecutor) driver;
	js2.executeScript("window.scrollTo(0,200)");
	 
	JavascriptExecutor js3 = (JavascriptExecutor) driver;
	js3.executeScript("window.scrollTo(0,300)");
	
	JavascriptExecutor js4= (JavascriptExecutor) driver;
	js4.executeScript("window.scrollTo(0,400)");
	 
	JavascriptExecutor js5= (JavascriptExecutor) driver;
	js5.executeScript("window.scrollTo(0,500)");
	 
	JavascriptExecutor js6= (JavascriptExecutor) driver;
	js6.executeScript("window.scrollTo(0,600)");
	 
	JavascriptExecutor js7= (JavascriptExecutor) driver;
	js7.executeScript("window.scrollTo(0,800)");
	 
	JavascriptExecutor js8= (JavascriptExecutor) driver;
	js8.executeScript("window.scrollTo(0,800)");
	 
	JavascriptExecutor js9= (JavascriptExecutor) driver;
	js9.executeScript("window.scrollTo(0,900)");
 
	JavascriptExecutor js10= (JavascriptExecutor) driver;
	js10.executeScript("window.scrollTo(0,1000)");
	 
	JavascriptExecutor js11= (JavascriptExecutor) driver;
	js11.executeScript("window.scrollTo(0,1100)");
 
	JavascriptExecutor js12= (JavascriptExecutor) driver;
	js12.executeScript("window.scrollTo(0,1200)");
 
	JavascriptExecutor js13= (JavascriptExecutor) driver;
	js13.executeScript("window.scrollTo(0,1200)");
	JavascriptExecutor js14= (JavascriptExecutor) driver;
	js14.executeScript("window.scrollTo(0,1400)");
 
	JavascriptExecutor js15= (JavascriptExecutor) driver;
	js15.executeScript("window.scrollTo(0,1500)");
	
	
	
	System.out.println("Test case about us pass");
  }
  @AfterTest
  public void close()
  {
	 
  }
}
