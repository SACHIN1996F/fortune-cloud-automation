package project;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class courses {
	WebDriver  driver;
	@BeforeTest
	public void course()
	{
		System.setProperty("WebDriver.driver.chrome","C:\\Users\\91928\\Desktop\\automation testing\\chromedriver_win32\\chromedrover.exe");
		driver=new ChromeDriver();
		driver.get("https://www.fortunecloudindia.com/");
		driver.manage().window().maximize();
	}
	@Test(priority=1)
	public void it_soft() throws InterruptedException 
	{
		Thread.sleep(3000);
		
		WebElement course=driver.findElement(By.xpath("//*[@id=\"sticky-header-with-topbar\"]/div/div/div/div[2]/nav/ul/li[5]/a"));
		course.click();
		Thread.sleep(1000);
		WebElement itss=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/div/div[2]/nav/ul/li[5]/ul/li[1]/a"));
		itss.click();
		Thread.sleep(2000);
	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		
		WebElement down=driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div/div/div[2]/div/div/div/a"));
		down.click();
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,200)");
		
		WebElement ds=driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div[1]/div/div[1]/div/a/span"));
		ds.click();
		List<String>tab= new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab.get(1));
		Thread.sleep(1000);
		List<String>tab1= new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab1.get(0));
		Thread.sleep(2000);
		
		WebElement java=driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div[2]/div/div[1]/div/a/span"));
		java.click();
		List<String>tab0= new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab0.get(1));
		Thread.sleep(1000);
		List<String>tab2= new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab2.get(0));
		Thread.sleep(2000);
		
		WebElement python=driver.findElement(By.xpath("//*[@id=\"SoftwareTesting\"]/div[1]/div/a/span"));
		python.click();
		List<String>tab01= new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab01.get(1));
		Thread.sleep(1000);
		List<String>tab3= new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab3.get(0));
		Thread.sleep(2000);
		
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0,200)");
		
		WebElement angular=driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div[5]/div/div[1]/div/a/span"));
		angular.click();
		List<String>tab02= new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab02.get(1));
		Thread.sleep(1000);
		List<String>tab4= new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab4.get(0));
		Thread.sleep(2000);
		
		WebElement php=driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div[6]/div/div[1]/div/a/span"));
		php.click();
		List<String>tab03= new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab03.get(1));
		Thread.sleep(1000);
		List<String>tab5= new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab5.get(0));
		Thread.sleep(2000);
		
		WebElement softtest=driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div[7]/div/div[1]/div/a/span"));
		softtest.click();
		List<String>tab04= new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab04.get(1));
		Thread.sleep(1000);
		List<String>tab6= new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab6.get(0));
		Thread.sleep(2000);
		
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("window.scrollBy(0,200)");
		
		WebElement asp_net=driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div[9]/div/div[1]/div/a/span"));
		asp_net.click();
		List<String>tab05= new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab05.get(1));
		Thread.sleep(1000);
		List<String>tab7= new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab7.get(0));
		Thread.sleep(2000);
		
		JavascriptExecutor js4 = (JavascriptExecutor) driver;
		js4.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
	}
	@Test(priority=2)
	public void cloud_computing() throws InterruptedException
	{
		Thread.sleep(1000);
		WebElement course=driver.findElement(By.xpath("//*[@id=\"sticky-header-with-topbar\"]/div/div/div/div[2]/nav/ul/li[5]/a"));
		course.click();
		Thread.sleep(1000);
		WebElement cloud_c=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/div/div[2]/nav/ul/li[5]/ul/li[2]/a"));
		cloud_c.click();
		Thread.sleep(1000);
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("window.scrollBy(0,300)");
		
		WebElement down=driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div/div/div[2]/div/div/div/a"));
		down.click();
		
		JavascriptExecutor js2=(JavascriptExecutor)driver;
		js2.executeScript("window.scrollBy(0,300)");
		
		WebElement mca=driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div[1]/div/div[2]/div/div[1]/div/a/span"));
		mca.click();
		List<String>tab1=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab1.get(1));
		Thread.sleep(1000);
		List<String>tab11=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab11.get(0));
		Thread.sleep(2000);
		
		JavascriptExecutor js3=(JavascriptExecutor)driver;
		js3.executeScript("window.scrollBy(0,300)");
		
		WebElement aws=driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div[2]/div/div[2]/div/div[1]/div/a/span"));
		aws.click();
		List<String>tab2=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab2.get(1));
		Thread.sleep(1000);
		List<String>tab21=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab21.get(0));
		Thread.sleep(2000);
				
		WebElement devops=driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div[2]/div/div[3]/div/div[1]/div/a/span"));
		devops.click();
		List<String>tab3=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab3.get(1));
		Thread.sleep(1000);
		List<String>tab31=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab31.get(0));
		Thread.sleep(2000);
		
		JavascriptExecutor js4=(JavascriptExecutor)driver;
		js4.executeScript("window.scrollBy(0,300)");
		
		WebElement kubernetes=driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div[2]/div/div[5]/div/div[1]/div/a/span"));
		kubernetes.click();
		List<String>tab4=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab4.get(1));
		Thread.sleep(1000);
		List<String>tab41=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab41.get(0));
		Thread.sleep(2000);
		
		WebElement terraform=driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div[2]/div/div[6]/div/div[1]/div/a/span"));
		terraform.click();
		List<String>tab5=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab5.get(1));
		Thread.sleep(1000);
		List<String>tab51=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab51.get(0));
		Thread.sleep(2000);
		
		WebElement docker=driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div[2]/div/div[6]/div/div[1]/div/a/span"));
		docker.click();
		List<String>tab6=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab6.get(1));
		Thread.sleep(1000);
		List<String>tab61=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab61.get(0));
		Thread.sleep(2000);
		
		JavascriptExecutor js5=(JavascriptExecutor)driver;
		js5.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		
		
		
		
		System.out.println("test case courses pass");
	}
	
	
	
  @Test
  public void f() 
  {
	  driver.close();
  }
}
