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

public class student_login {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		System.setProperty("WebDriver.driver.chrome","C:\\Users\\91928\\Desktop\\automation testing\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.fortunecloudindia.com/");
		driver.manage().window().maximize();
	
	}
	@Test(priority=1)
	public void log() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement s1=driver.findElement(By.xpath("//*[@id=\"htc__header\"]/div[1]/div/div/div[2]/div/ul/li[6]/a/b"));
		s1.click();
		List<String>tab=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab.get(1));
		WebElement email=driver.findElement(By.xpath("//*[@id=\"id_username\"]"));
		email.click();
		email.sendKeys("sachin1996fuse@gmail.com");
		Thread.sleep(3000);
		WebElement pass=driver.findElement(By.xpath("//*[@id=\"id_password\"]"));
		pass.click();
		pass.sendKeys("8624921338S199621");
		Thread.sleep(3000);
		WebElement log=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/form/input[2]"));
		log.click();
	
	}
	@Test(priority=2)
	public void profile() throws InterruptedException  
	{
		Thread.sleep(9000);
		WebElement alert=driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/button/span"));
		alert.click(); 
		Thread.sleep(2000);
		WebElement xx=driver.findElement(By.xpath("/html/body/form/div/div/div/div[1]/button/span"));
		xx.click();
		Thread.sleep(1000);
		WebElement profile=driver.findElement(By.xpath("/html/body/div[1]/nav/ul[1]/li[3]/a"));
		profile.click(); 
		Thread.sleep(2000);
		WebElement alert1=driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/button/span"));
		alert1.click();
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollTo(0,350)");
		Thread.sleep(2000);
		WebElement offer=driver.findElement(By.xpath("/html/body/div[1]/div[2]/section/div/div/div[1]/div[1]/div/a[2]"));
		offer.click();
		List<String>tab=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab.get(2));
		Thread.sleep(5000);
		List<String>tab1=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab1.get(1));
		Thread.sleep(3000);
		WebElement edge=driver.findElement(By.xpath("/html/body/div[1]/div[2]/section/div/div/div[1]/div[1]/div/a[3]"));
		edge.click();
		List<String>tab2=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab2.get(2));
		Thread.sleep(5000);
		List<String>tab12=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab12.get(1));
		Thread.sleep(3000);
		WebElement syllabus=driver.findElement(By.xpath("/html/body/div[1]/div[2]/section/div/div/div[1]/div[1]/div/a[4]"));
		syllabus.click();
		List<String>tab21=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab21.get(2));
		Thread.sleep(5000);
		List<String>tab121=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab121.get(1));
		Thread.sleep(3000);
	
		
	}
	@Test(priority=3)
	public void notice() throws InterruptedException
	{
		WebElement notice=driver.findElement(By.xpath("//*[@id=\"sidebar\"]/div/div[4]/div/div/nav/ul/li[2]/a"));
		notice.click();
		Thread.sleep(2000);
		WebElement viewN=driver.findElement(By.xpath("//*[@id=\"sidebar\"]/div/div[4]/div/div/nav/ul/li[2]/ul/li/a"));
		viewN.click();
		Thread.sleep(2000);
		WebElement alert2=driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/button/span"));
		alert2.click();
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollTo(0,250)");
		
		WebElement att=driver.findElement(By.xpath("/html/body/div[1]/div[2]/section/div/div/div[1]/div/div[2]/div[5]/div[1]/a"));
		att.click();
		driver.navigate().back();
		Thread.sleep(2000);
		WebElement att1=driver.findElement(By.xpath("/html/body/div[1]/div[2]/section/div/div/div[2]/div/div[2]/div[5]/div[1]/a"));
		att1.click();
		WebElement att2=driver.findElement(By.xpath("/html/body/div[1]/div[2]/section/div/div/div[3]/div/div[2]/div[5]/div[1]/a"));
		att2.click();
		
	}
	@Test(priority=3)
     public void video() throws InterruptedException
    {
//		WebElement video=driver.findElement(By.xpath("//*[@id=\"sidebar\"]/div/div[4]/div/div/nav/ul/li[3]/a"));
//		video.click();
//		Thread.sleep(2000);
//		//c programming
//		WebElement c_program=driver.findElement(By.xpath("//*[@id=\"sidebar\"]/div/div[4]/div/div/nav/ul/li[3]/ul/li[1]/a"));
//		c_program.click();
//		Thread.sleep(2000);
//		WebElement alert2=driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/button/span"));
//		alert2.click();
//		Thread.sleep(2000);
//		//sql
//		WebElement video1=driver.findElement(By.xpath("//*[@id=\"sidebar\"]/div/div[4]/div/div/nav/ul/li[3]/a"));
//		video1.click();
//		Thread.sleep(2000);
//		WebElement sql=driver.findElement(By.xpath("//*[@id=\"sidebar\"]/div/div[4]/div/div/nav/ul/li[3]/ul/li[2]/a"));
//		sql.click();
//		Thread.sleep(2000);
//		WebElement alert12=driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/button/span"));
//		alert12.click();	
//		//webdesign
//		WebElement video2=driver.findElement(By.xpath("//*[@id=\"sidebar\"]/div/div[4]/div/div/nav/ul/li[3]/a"));
//		video2.click();
//		Thread.sleep(2000);
//		WebElement webd=driver.findElement(By.xpath("//*[@id=\"sidebar\"]/div/div[4]/div/div/nav/ul/li[3]/ul/li[3]/a"));
//		webd.click();
//		Thread.sleep(2000);
//		WebElement alert11=driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/button/span"));
//		alert11.click();
//		//core domain
//		WebElement video3=driver.findElement(By.xpath("//*[@id=\"sidebar\"]/div/div[4]/div/div/nav/ul/li[3]/a"));
//		video3.click();
//		Thread.sleep(2000);
//		WebElement cored=driver.findElement(By.xpath("//*[@id=\"sidebar\"]/div/div[4]/div/div/nav/ul/li[3]/ul/li[4]/a"));
//		cored.click();
//		Thread.sleep(2000);
//		WebElement alert101=driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/button/span"));
//		alert101.click();
//		//advanced domain
//		WebElement video4=driver.findElement(By.xpath("//*[@id=\"sidebar\"]/div/div[4]/div/div/nav/ul/li[3]/a"));
//		video4.click();
//		Thread.sleep(2000);
//		WebElement advd=driver.findElement(By.xpath("//*[@id=\"sidebar\"]/div/div[4]/div/div/nav/ul/li[3]/ul/li[5]/a"));
//		advd.click();
		
	
    }
	@Test(priority=4)
	public void exam() throws InterruptedException
	{
		WebElement Exam=driver.findElement(By.xpath("//*[@id=\"sidebar\"]/div/div[4]/div/div/nav/ul/li[4]/a"));
		Exam.click();
		Thread.sleep(2000);
		WebElement exam1=driver.findElement(By.xpath("//*[@id=\"sidebar\"]/div/div[4]/div/div/nav/ul/li[4]/ul/li/a"));
		exam1.click();
		Thread.sleep(2000);
		WebElement alert=driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/button/span"));
		alert.click();
		Thread.sleep(2000);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollTo(0,200)");
		
	}
	
	@Test(priority=5)
	public void schedule() throws InterruptedException
	{
//		WebElement schedule=driver.findElement(By.xpath("//*[@id=\"sidebar\"]/div/div[4]/div/div/nav/ul/li[6]/a"));
//		schedule.click();
//		WebElement schedule1=driver.findElement(By.xpath("//*[@id=\"sidebar\"]/div/div[4]/div/div/nav/ul/li[6]/ul/li/a"));
//		schedule1.click();
//		Thread.sleep(2000);
//		WebElement alert=driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/button/span"));
//		alert.click();
//		Thread.sleep(1000);
//		JavascriptExecutor js1 = (JavascriptExecutor) driver;
//		js1.executeScript("window.scrollTo(0,100)");
//		Thread.sleep(1000);
//		JavascriptExecutor js2 = (JavascriptExecutor) driver;
//		js2.executeScript("window.scrollTo(0,200)");
//		Thread.sleep(1000);
//		JavascriptExecutor js3 = (JavascriptExecutor) driver;
//		js3.executeScript("window.scrollTo(0,300)");
//		Thread.sleep(1000);
//		JavascriptExecutor js4= (JavascriptExecutor) driver;
//		js4.executeScript("window.scrollTo(0,400)");
//		Thread.sleep(1000);
//		JavascriptExecutor js5= (JavascriptExecutor) driver;
//		js5.executeScript("window.scrollTo(0,500)");
//		Thread.sleep(1000);
//		JavascriptExecutor js6= (JavascriptExecutor) driver;
//		js6.executeScript("window.scrollTo(0,600)");
//		Thread.sleep(1000);
//		JavascriptExecutor js7= (JavascriptExecutor) driver;
//		js7.executeScript("window.scrollTo(0,800)");
//		Thread.sleep(1000);
//		JavascriptExecutor js8= (JavascriptExecutor) driver;
//		js8.executeScript("window.scrollTo(0,800)");
//		Thread.sleep(1000);
//		JavascriptExecutor js9= (JavascriptExecutor) driver;
//		js9.executeScript("window.scrollTo(0,900)");
//		Thread.sleep(1000);
//		JavascriptExecutor js10= (JavascriptExecutor) driver;
//		js10.executeScript("window.scrollTo(0,1000)");
//		Thread.sleep(1000);
//		JavascriptExecutor js11= (JavascriptExecutor) driver;
//		js11.executeScript("window.scrollTo(0,1100)");
//		Thread.sleep(1000);
//		JavascriptExecutor js12= (JavascriptExecutor) driver;
//		js12.executeScript("window.scrollTo(0,1200)");
//		Thread.sleep(1000);
//		JavascriptExecutor js13= (JavascriptExecutor) driver;
//		js13.executeScript("window.scrollTo(0,1300)");
//		Thread.sleep(1000);
//		JavascriptExecutor js14= (JavascriptExecutor) driver;
//		js14.executeScript("window.scrollTo(0,1400)");
//		Thread.sleep(1000);
//		JavascriptExecutor js15= (JavascriptExecutor) driver;
//		js15.executeScript("window.scrollTo(0,1500)");
		
	}
	@Test(priority=6)
	public void timeline() throws InterruptedException
	{
		WebElement time=driver.findElement(By.xpath("//*[@id=\"sidebar\"]/div/div[4]/div/div/nav/ul/li[7]/a"));
		time.click();
		Thread.sleep(2000);
		WebElement line=driver.findElement(By.xpath("//*[@id=\"sidebar\"]/div/div[4]/div/div/nav/ul/li[7]/ul/li/a"));
		line.click();
		Thread.sleep(2000);
		WebElement alert=driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/button/span"));
		alert.click();
		Thread.sleep(2000);
			
	
	}
	@Test(priority=7)
	public void logout() throws InterruptedException
	{
		WebElement logout=driver.findElement(By.xpath("//*[@id=\"sidebar\"]/div/div[4]/div/div/nav/ul/li[8]/a"));
		logout.click();
		Thread.sleep(2000);
		WebElement repass=driver.findElement(By.xpath("//*[@id=\"sidebar\"]/div/div[4]/div/div/nav/ul/li[8]/ul/li[1]/a"));
		repass.click();
		Thread.sleep(2000);
		WebElement copass=driver.findElement(By.xpath("//*[@id=\"oldid_password\"]"));
		copass.click();
		copass.sendKeys("8624921338S199621");
		Thread.sleep(2000);
		WebElement copass1=driver.findElement(By.xpath("//*[@id=\"id_password\"]"));
		copass1.click();
		copass1.sendKeys("8624921338S199621");
		Thread.sleep(2000);
		WebElement copass2=driver.findElement(By.xpath("//*[@id=\"c_password\"]"));
		copass2.click();
		copass2.sendKeys("8624921338S199621");
		Thread.sleep(2000);
		WebElement send=driver.findElement(By.xpath("/html/body/div/div/div/div[2]/form/div[3]/input"));
		send.click();
		Thread.sleep(9000);
		WebElement alert=driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/button/span"));
		alert.click();
		WebElement logout1=driver.findElement(By.xpath("//*[@id=\"sidebar\"]/div/div[4]/div/div/nav/ul/li[8]/a"));
		logout1.click();
		Thread.sleep(2000);
		WebElement log=driver.findElement(By.xpath("//*[@id=\"sidebar\"]/div/div[4]/div/div/nav/ul/li[8]/ul/li[2]/a"));
		log.click();
		Thread.sleep(9000);
		WebElement singin=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/form/input[2]"));
		singin.click();
		
		WebElement id=driver.findElement(By.xpath("//*[@id=\"id_username\"]"));
		id.click();
		id.sendKeys("sachin1996fuse@gmail.com");
		WebElement pass=driver.findElement(By.xpath("//*[@id=\"id_password\"]"));
		pass.click();
		pass.sendKeys("8624921338S199621");
		WebElement send1=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/form/input[2]"));
		send1.click();
		Thread.sleep(9000);
		WebElement alert1=driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/button/span"));
		alert1.click(); 
	
	}
	@Test(priority=8)
	public void foolowus() throws InterruptedException
	{
		WebElement follow=driver.findElement(By.xpath("//*[@id=\"sidebar\"]/div/div[4]/div/div/nav/ul/li[9]/a"));
		follow.click();
		Thread.sleep(2000);
		WebElement cross=driver.findElement(By.xpath("//*[@id=\"followus\"]/div/div/div[1]/button/span"));
		cross.click();
		
	}
	@Test(priority=9)
	public void feedback() throws InterruptedException
	{
		WebElement feedback=driver.findElement(By.xpath("//*[@id=\"feedbacklink\"]"));
		feedback.click();
		Thread.sleep(2000);
		
		WebElement course=driver.findElement(By.xpath("//*[@id=\"feedback\"]/div/div/div[2]/div[1]/input"));
		course.click();
		course.sendKeys("Automation testing");
		Thread.sleep(1000);
		WebElement trainner=driver.findElement(By.xpath("//*[@id=\"feedback\"]/div/div/div[2]/div[2]/input"));
		trainner.click();
	    trainner.sendKeys("pooja mam.");
		Thread.sleep(1000);
		WebElement yes=driver.findElement(By.xpath("//*[@id=\"feedback\"]/div/div/div[2]/div[3]/input"));
		yes.click();
		yes.sendKeys("yes");
		Thread.sleep(1000);
		WebElement problem=driver.findElement(By.xpath("//*[@id=\"feedback\"]/div/div/div[2]/div[4]/div/input[1]"));
		problem.click();
		Thread.sleep(1000);
		WebElement task=driver.findElement(By.xpath("//*[@id=\"feedback\"]/div/div/div[2]/div[5]/div/input[1]"));
		task.click();
		Thread.sleep(1000);
		WebElement rate=driver.findElement(By.xpath("//*[@id=\"feedback\"]/div/div/div[2]/div[6]/div/input[4]"));
		rate.click();
		Thread.sleep(1000);
		WebElement ratet=driver.findElement(By.xpath("//*[@id=\"feedback\"]/div/div/div[2]/div[7]/div/input[4]"));
		ratet.click();
		Thread.sleep(1000);
		WebElement sugge=driver.findElement(By.xpath("//*[@id=\"feedback\"]/div/div/div[2]/div[8]/input"));
		sugge.click();
		sugge.sendKeys("no");
		Thread.sleep(1000);
		WebElement friend=driver.findElement(By.xpath("//*[@id=\"feedback\"]/div/div/div[2]/div[9]/select"));
		friend.click();
		WebElement friendno=driver.findElement(By.xpath("//*[@id=\"feedback\"]/div/div/div[2]/div[9]/select/option[2]"));
		friendno.click();
		Thread.sleep(2000);
		WebElement submit=driver.findElement(By.xpath("//*[@id=\"feedback\"]/div/div/div[3]/input"));
		submit.click();
	
	}
	@Test(priority=10)
	public void dashboard() throws InterruptedException
	{
		Thread.sleep(3000);
		WebElement alert1=driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/button/span"));
		alert1.click();	
		WebElement dash=driver.findElement(By.xpath("//*[@id=\"sidebar\"]/div/div[4]/div/div/nav/ul/li[1]/a"));
		dash.click();
		Thread.sleep(2000);
		WebElement alert=driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/button/span"));
		alert.click();
		
		
		//c programming
		WebElement cpro=driver.findElement(By.xpath("/html/body/div[1]/div[2]/section/div/div/div[2]/div/div[1]/div/div[1]/div[1]/div[1]/img"));
		cpro.click();
		Thread.sleep(2000);
		WebElement video=driver.findElement(By.xpath("//*[@id=\"cbody\"]/div/div[1]/a/img"));
		video.click();
		Thread.sleep(2000);
		WebElement alert0=driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/button/span"));
		alert0.click();	
		driver.navigate().back();
		WebElement exam=driver.findElement(By.xpath("//*[@id=\"cbody\"]/div/div[2]/a/img"));
		exam.click();
		Thread.sleep(2000);
		driver.navigate().back();
		WebElement notes=driver.findElement(By.xpath("//*[@id=\"cbody\"]/div/div[3]/a/img"));
		notes.click();
		List<String>tab=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab.get(2));
		List<String>tab1=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab1.get(1));
		Thread.sleep(2000);
		WebElement interv=driver.findElement(By.xpath("//*[@id=\"cbody\"]/div/div[4]/a/img"));
		interv.click();
	    List<String>tab2=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab2.get(2));
		List<String>tab3=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab3.get(1));
		Thread.sleep(2000);
		WebElement back=driver.findElement(By.xpath("/html/body/div[1]/div[2]/section/div/div/div[2]/div/div[1]/div/div[1]/div[1]"));
		back.click();
		
		
		//sql programming
		WebElement sql=driver.findElement(By.xpath("/html/body/div[1]/div[2]/section/div/div/div[2]/div/div[2]/div/div[1]/div[1]/div[1]/img"));
        sql.click();
        WebElement videos=driver.findElement(By.xpath("//*[@id=\"sqlbody\"]/div/div[1]/a/img"));
        videos.click();
        Thread.sleep(2000);
        WebElement alertt=driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/button/span"));
		alertt.click();
		driver.navigate().back();
		WebElement exam1=driver.findElement(By.xpath("//*[@id=\"sqlbody\"]/div/div[2]/a/img"));
		exam1.click();
		Thread.sleep(2000);
		WebElement alerttt=driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/button/span"));
		alerttt.click();
		Thread.sleep(2000);
		driver.navigate().back();
		WebElement notes1=driver.findElement(By.xpath("//*[@id=\"sqlbody\"]/div/div[3]/a/img"));
		notes1.click();
		List<String>tab4=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab4.get(2));
		List<String>tab5=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab5.get(1));
		Thread.sleep(2000);
		WebElement interview=driver.findElement(By.xpath("//*[@id=\"sqlbody\"]/div/div[4]/a/img"));
		interview.click();
		List<String>tab6=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab6.get(2));
		List<String>tab7=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab7.get(1));
		Thread.sleep(2000);
        WebElement back1=driver.findElement(By.xpath("/html/body/div[1]/div[2]/section/div/div/div[2]/div/div[2]/div/div[1]/div[1]"));
        back1.click();
        
        
        //web design
        WebElement wd=driver.findElement(By.xpath("/html/body/div[1]/div[2]/section/div/div/div[2]/div/div[3]/div/div[1]/div[1]/div[1]/img"));
        wd.click();
        WebElement videoss=driver.findElement(By.xpath("//*[@id=\"wdbody\"]/div/div[1]/a/img"));
        videoss.click();
        Thread.sleep(2000);
        WebElement alert1t=driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/button/span"));
		alert1t.click();
		driver.navigate().back();
		WebElement exam3=driver.findElement(By.xpath("//*[@id=\"wdbody\"]/div/div[2]/a/img"));
		exam3.click();
		Thread.sleep(2000);
		 WebElement alerst=driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/button/span"));
		alerst.click();
		Thread.sleep(2000);
		driver.navigate().back();
		WebElement notes11=driver.findElement(By.xpath("//*[@id=\"wdbody\"]/div/div[3]/a/img"));
		notes11.click();
		List<String>tab8=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab8.get(2));
		List<String>tab9=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab9.get(1));
		Thread.sleep(2000);
		WebElement interviewwd=driver.findElement(By.xpath("//*[@id=\"wdbody\"]/div/div[4]/a[2]/img"));
		interviewwd.click();
		List<String>tab10=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab10.get(2));
		List<String>tab11=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab11.get(1));
		Thread.sleep(2000);
        WebElement back11=driver.findElement(By.xpath("/html/body/div[1]/div[2]/section/div/div/div[2]/div/div[3]/div/div[1]/div[1]"));
        back11.click();
        
        
        /*core domain
        WebElement cored=driver.findElement(By.xpath("//*[@id=\"#core\"]/button/i"));
        cored.click();
        WebElement videocd=driver.findElement(By.xpath("/html/body/div[1]/div[2]/section/div/div/div[2]/div/div[4]/div/div[1]/div[1]/div[1]/img"));
        videocd.click();
        Thread.sleep(2000);
        WebElement alert01=driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/button/span"));
		alert01.click();
		driver.navigate().back();
		WebElement examcd=driver.findElement(By.xpath("//*[@id=\"corebody\"]/div/div[2]/a/img"));
		examcd.click();
		WebElement alert02=driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/button/span"));
		alert02.click();
		Thread.sleep(2000);
		driver.navigate().back();
		WebElement notescd=driver.findElement(By.xpath("//*[@id=\"corebody\"]/div/div[3]/a/img"));
		notescd.click();
		List<String>tab13=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab13.get(2));
		List<String>tab14=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab14.get(1));
		Thread.sleep(2000);
		WebElement interviewcd=driver.findElement(By.xpath("//*[@id=\"corebody\"]/div/div[4]/a/img"));
		interviewcd.click();
		List<String>tab15=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab15.get(2));
		List<String>tab16=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab16.get(1));
		Thread.sleep(2000);
        WebElement backcd=driver.findElement(By.xpath(""));
        backcd.click();*/
        
        
        //advance domain
        WebElement advd=driver.findElement(By.xpath("/html/body/div[1]/div[2]/section/div/div/div[2]/div/div[5]/div/div[1]/div[1]/div[1]/img"));
        advd.click();
        WebElement vid2=driver.findElement(By.xpath("//*[@id=\"advbody\"]/div/div[1]/a/img"));
        vid2.click();
        WebElement examad=driver.findElement(By.xpath("//*[@id=\"advbody\"]/div/div[1]/a/img"));
        examad.click();
        WebElement notead=driver.findElement(By.xpath("//*[@id=\"advbody\"]/div/div[3]/a/img"));
        notead.click();
        WebElement interad=driver.findElement(By.xpath("//*[@id=\"advbody\"]/div/div[3]/a/img"));
        interad.click();
        WebElement backad=driver.findElement(By.xpath("/html/body/div[1]/div[2]/section/div/div/div[2]/div/div[5]/div/div[1]"));
        backad.click();
        
        
        //soft skill
        WebElement softskill=driver.findElement(By.xpath("/html/body/div[1]/div[2]/section/div/div/div[2]/div/div[6]/div/div[1]/div[1]/div[1]/img"));
        softskill.click();
        WebElement timel=driver.findElement(By.xpath("//*[@id=\"softskills\"]/div/div[1]/a/img"));
        timel.click();
        Thread.sleep(3000);
        WebElement alert00=driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/button/span"));
		alert00.click();
		Thread.sleep(3000);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollTo(0,200)");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(3000);
		WebElement exams=driver.findElement(By.xpath("//*[@id=\"softskills\"]/div/div[2]/a/img"));
		exams.click();
		Thread.sleep(2000);
		 WebElement alert002=driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/button/span"));
		alert002.click();
		JavascriptExecutor js2=(JavascriptExecutor)driver;
		js2.executeScript("window.scrollTo(0,100)");
		driver.navigate().back();
		WebElement backs=driver.findElement(By.xpath("/html/body/div[1]/div[2]/section/div/div/div[2]/div/div[6]/div/div[1]/div[1]"));
		backs.click();
		
		
	}
	/*@Test(priority=11)
	public void attendence() throws InterruptedException
	{
		WebElement atten=driver.findElement(By.xpath("//*[@id=\"#core\"]/button/i"));
		atten.click();
		Thread.sleep(2000);
		WebElement atten1=driver.findElement(By.xpath("//*[@id=\"sidebar\"]/div/div[4]/div/div/nav/ul/li[5]/ul/li/a/p"));
		atten1.click();
		System.out.println("test pass 13");
		
	}*/

  @AfterTest
  public void close()
  {
	 driver.close();
  }
}
