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

public class services {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		System.setProperty("WebDriver.driver.chrome","C:\\Users\\91928\\Desktop\\automation testing\\chromedriver_win32\\chromedrover.exe");
		driver=new ChromeDriver();
		driver.get("https://www.fortunecloudindia.com/");
	}
	@Test(priority=1)
	public void service() throws InterruptedException
	{
		Thread.sleep(1000);
		WebElement ser=driver.findElement(By.xpath("//*[@id=\"sticky-header-with-topbar\"]/div/div/div/div[2]/nav/ul/li[4]/a"));
		ser.click();
		Thread.sleep(1000);
		WebElement jobc=driver.findElement(By.xpath("//*[@id=\"click\"]/a/span/span[1]/span"));
		jobc.click();
		WebElement it=driver.findElement(By.xpath("//*[@id=\"show\"]/li[1]/a"));
		it.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,250)");
	}
	@Test(priority=2)
	public void download() throws InterruptedException

	{
		Thread.sleep(2000);
		WebElement bdown=driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div/div/div[2]/div/div/div/a"));
		bdown.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,300)");
		WebElement datas=driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div[1]/div/div[1]/div/a"));
		datas.click();
		List<String>tab=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab.get(1));
		Thread.sleep(2000);
		List<String>tab1=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab1.get(0));
		Thread.sleep(3000);
		
		WebElement java=driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div[2]/div/div[1]/div/a"));
		java.click();
		List<String>tab2=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab2.get(1));
		Thread.sleep(2000);
		List<String>tab3=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab3.get(0));
		Thread.sleep(3000);

		WebElement python=driver.findElement(By.xpath("//*[@id=\"SoftwareTesting\"]/div[1]/div/a"));
		python.click();
		List<String>tab4=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab4.get(1));
		Thread.sleep(2000);
		List<String>tab5=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab5.get(0));
		Thread.sleep(3000);
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollTo(0,300)"); 
		
		WebElement angularjs=driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div[5]/div/div[1]/div/a"));
		angularjs.click();
		List<String>tab6=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab6.get(1));
		Thread.sleep(2000);
		List<String>tab7=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab7.get(0));
		Thread.sleep(3000);
		
		WebElement php=driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div[6]/div/div[1]/div/a"));
		php.click();
		List<String>tab8=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab8.get(1));
		Thread.sleep(2000);
		List<String>tab9=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab9.get(0));
		Thread.sleep(3000);
		
		WebElement testing=driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div[7]/div/div[1]/div/a"));
		testing.click();
		List<String>tab10=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab10.get(1));
		Thread.sleep(2000);
		List<String>tab11=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab11.get(0));
		Thread.sleep(3000);
		
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollTo(0,300)"); 
		
		
		WebElement asp_net=driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div[9]/div/div[1]/div/a"));
		asp_net.click();
		List<String>tab12=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab12.get(1));
		Thread.sleep(2000);
		List<String>tab13=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab13.get(0));
		Thread.sleep(3000);
		
		JavascriptExecutor js12 = (JavascriptExecutor) driver;
		js12.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
	}
    @Test(priority=3)
    public void cloudcomputing() throws InterruptedException
    {
    	WebElement service=driver.findElement(By.xpath("//*[@id=\"sticky-header-with-topbar\"]/div/div/div/div[2]/nav/ul/li[4]/a"));
    	service.click();
    	Thread.sleep(2000);
    	WebElement joc1=driver.findElement(By.xpath("//*[@id=\"click\"]/a/span/span[1]/span"));
    	joc1.click();
    	Thread.sleep(2000);
    	WebElement cloud=driver.findElement(By.xpath("//*[@id=\"show\"]/li[2]/a"));
    	cloud.click();
    	Thread.sleep(2000);
    	
    	WebElement downloadb=driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div/div/div[2]/div/div/div/a"));
    	downloadb.click();
    	Thread.sleep(1000);
    	
    	JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,200)");
    	
    	WebElement amazonmca=driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div[1]/div/div[2]/div/div[1]/div/a"));
    	amazonmca.click();
    	List<String>tab12=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab12.get(1));
		Thread.sleep(2000);
		List<String>tab13=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab13.get(0));
		Thread.sleep(3000);
		
		JavascriptExecutor js11 = (JavascriptExecutor) driver;
		js11.executeScript("window.scrollBy(0,150)");
		
		WebElement aws=driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div[2]/div/div[2]/div/div[1]/div/a"));
		aws.click();
		List<String>tab1=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab1.get(1));
		Thread.sleep(2000);
		List<String>tab11=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab11.get(0));
		Thread.sleep(3000);
		
		WebElement devops=driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div[2]/div/div[3]/div/div[1]/div/a"));
		devops.click();
		List<String>tab10=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab10.get(1));
		Thread.sleep(2000);
		List<String>tab111=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab111.get(0));
		Thread.sleep(3000);
    	
		JavascriptExecutor js111 = (JavascriptExecutor) driver;
		js111.executeScript("window.scrollBy(0,300)");
		
		WebElement kubernetes=driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div[2]/div/div[5]/div/div[1]/div/a"));
		kubernetes.click();
		List<String>tab101=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab101.get(1));
		Thread.sleep(2000);
		List<String>tab1111=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab1111.get(0));
		Thread.sleep(3000);
		
		WebElement terraform=driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div[2]/div/div[6]/div/div[1]/div/a"));
		terraform.click();
		List<String>tab1011=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab1011.get(1));
		Thread.sleep(2000);
		List<String>tab11111=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab11111.get(0));
		Thread.sleep(3000);
		
		WebElement docker=driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div[2]/div/div[7]/div/div[1]/div/a"));
		docker.click();
		List<String>tab9=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab9.get(1));
		Thread.sleep(2000);
		List<String>tab99=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab99.get(0));
		Thread.sleep(3000);
		
		JavascriptExecutor js12 = (JavascriptExecutor) driver;
		js12.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
    }
    
    @Test(priority=4)
    public void staff_r() throws InterruptedException
    {
    	Thread.sleep(1000);
    	WebElement service=driver.findElement(By.xpath("//*[@id=\"sticky-header-with-topbar\"]/div/div/div/div[2]/nav/ul/li[4]/a"));
    	service.click();
    	Thread.sleep(2000);
    	WebElement staff_rr=driver.findElement(By.xpath("//*[@id=\"sticky-header-with-topbar\"]/div/div/div/div[2]/nav/ul/li[4]/ul/li[2]/a"));
    	staff_rr.click();
    	Thread.sleep(2000);
    	JavascriptExecutor js12 = (JavascriptExecutor) driver;
		js12.executeScript("window.scrollBy(0,100)");
		Thread.sleep(1000);
		JavascriptExecutor js121 = (JavascriptExecutor) driver;
		js121.executeScript("window.scrollBy(0,200)");
		Thread.sleep(1000);
		JavascriptExecutor js122= (JavascriptExecutor) driver;
		js122.executeScript("window.scrollBy(0,300)");
		Thread.sleep(1000);
		JavascriptExecutor js123 = (JavascriptExecutor) driver;
		js123.executeScript("window.scrollBy(0,400)");
		Thread.sleep(1000);
		
		System.out.println("servixe pass");
    }
  @Test
  public void f() 
  {
	  
  }
}
