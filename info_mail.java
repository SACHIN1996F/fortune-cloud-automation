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

public class info_mail {
	WebDriver driver;
  @BeforeTest
  public void setup() 
  {
	  System.setProperty("WebDriver.chrome.driver,","C:\\Users\\91928\\Desktop\\automation testing\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.fortunecloudindia.com/");
	  
  }
  @Test(priority=1)
  public void infomail() throws InterruptedException
  {
	  Thread.sleep(3000);
	  WebElement email=driver.findElement(By.xpath("//*[@id=\"htc__header\"]/div[1]/div/div/div[1]/div/ul/li[2]/a"));
	  email.click();
	  List<String>tab1=new ArrayList<String>(driver.getWindowHandles());
	  driver.switchTo().window(tab1.get(1));
	  
	  System.out.println("info mail pass");
  }
  @AfterTest
  public void close()
  {
	  driver.close();
  }
}
