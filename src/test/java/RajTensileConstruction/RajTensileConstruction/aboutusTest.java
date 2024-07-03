package RajTensileConstruction.RajTensileConstruction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class aboutusTest {
	String driverPath = "C:\\Users\\ramya\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
	WebDriver driver = new ChromeDriver();
	
	@BeforeTest
	void navigate() {
		driver.get("https://rajtensilestructure.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test(priority=1)
	void aboutus() throws InterruptedException 
	{
    	Thread.sleep(10000);
    	WebElement dr = driver.findElement(By.xpath("(//a[@class=\"elementor-item\"])[1]"));
    	dr.click();
    }
	@Test(priority=2)
	void companyprof() 
	{
		WebElement cp = driver.findElement(By.xpath("//a[normalize-space()='COMPANY PROFILE']"));
		cp.click();	
	}
	
	@Test(priority=3)
	void whychooseus() throws InterruptedException
	{	WebElement why= driver.findElement(By.xpath("//h2[normalize-space()='WHY CHOOSE US']"));
		why.isDisplayed();
		Thread.sleep(2000);
		WebElement yoe=driver.findElement(By.xpath("(//span[@class='vc_tta-title-text'])[1]"));
		yoe.click();
		Thread.sleep(2000);
		WebElement bm=driver.findElement(By.xpath("(//span[@class='vc_tta-title-text'])[2]"));
		bm.click();
		Thread.sleep(2000);
		WebElement ps=driver.findElement(By.xpath("(//span[@class='vc_tta-title-text'])[3]"));
		ps.click();
	}
	
	
	@Test(priority=4)
	void bestfeactures() throws InterruptedException
	{	WebElement bf=driver.findElement(By.xpath("//h2[normalize-space()='BEST FEATURES']"));
		bf.isDisplayed();
		Thread.sleep(2000);
		WebElement con=driver.findElement(By.xpath("//span[normalize-space()='Construction']"));
		con.click();
		Thread.sleep(2000);
		WebElement bpe=driver.findElement(By.xpath("//span[normalize-space()='Best possible equipment']"));
		bpe.click();
		Thread.sleep(2000);
		WebElement eq=driver.findElement(By.xpath("//span[normalize-space()='Experienced Teams']"));
		eq.click();
	}
	
	@Test(priority=5)
	void visibility()
	{	WebElement pc=driver.findElement(By.xpath("//p[normalize-space()='PROJECTS COMPLETED']"));
		pc.isDisplayed();
		WebElement we=driver.findElement(By.xpath("//p[normalize-space()='WORKERS EMPLOYED']"));
		we.isDisplayed();
		WebElement hc=driver.findElement(By.xpath("//p[normalize-space()='HONOR CLIENTS']"));
		hc.isDisplayed();
		WebElement aw=driver.findElement(By.xpath("//p[normalize-space()='AWARDS WON']"));
		aw.isDisplayed();
	}
	
	
	@Test(priority=6)
	void ourteam() throws InterruptedException
	{	WebElement ot=driver.findElement(By.xpath("//h2[normalize-space()='OUR TEAM']"));
		ot.isEnabled();
		Thread.sleep(2000);
		Actions a=new Actions(driver);
		WebElement ds=driver.findElement(By.xpath("//img[@alt='Deepak Sharma']"));
		a.moveToElement(ds).click().perform();
		WebElement face=driver.findElement(By.xpath("(//a[@title=\"Facebook\"])[1]"));
		face.isEnabled();
		WebElement twi=driver.findElement(By.xpath("(//a[@title=\"Twitter\"])[1]"));
		twi.isEnabled();
		WebElement in=driver.findElement(By.xpath("(//a[@title=\"Linkedin\"])[1]"));
		in.isEnabled();
		WebElement gp=driver.findElement(By.xpath("(//a[@title=\"Google-plus\"])[1]"));
		gp.isEnabled();
		Thread.sleep(2000);
	}
	
	@Test(priority=7)
	void akshay()throws InterruptedException
	{	
		Actions b=new Actions(driver);
		WebElement ak=driver.findElement(By.xpath("//img[@alt='Akshay']"));
		b.moveToElement(ak).click().perform();
		WebElement fac=driver.findElement(By.xpath("(//a[@title=\"Facebook\"])[2]"));
		fac.isEnabled();
		WebElement twi=driver.findElement(By.xpath("(//a[@title=\"Twitter\"])[2]"));
		twi.isEnabled();
		WebElement in=driver.findElement(By.xpath("(//a[@title=\"Linkedin\"])[2]"));
		in.isEnabled();
		WebElement gp=driver.findElement(By.xpath("(//a[@title=\"Google-plus\"])[2]"));
		gp.isEnabled();
		Thread.sleep(2000);
	}
	
	@Test(priority=8)
	void vinay()throws InterruptedException
	{			
		Actions b=new Actions(driver);
		WebElement ak=driver.findElement(By.xpath("//img[@alt='Vinay']"));
		b.moveToElement(ak).click().perform();
		WebElement fac=driver.findElement(By.xpath("(//a[@title=\"Facebook\"])[3]"));
		fac.isEnabled();
		WebElement twi=driver.findElement(By.xpath("(//a[@title=\"Twitter\"])[3]"));
		twi.isEnabled();
		WebElement in=driver.findElement(By.xpath("(//a[@title=\"Linkedin\"])[3]"));
		in.isEnabled();
		WebElement gp=driver.findElement(By.xpath("(//a[@title=\"Google-plus\"])[3]"));
		gp.isEnabled();
		Thread.sleep(2000);
	}
	
	@Test(priority=9)
	void abhi()throws InterruptedException
	{
		Actions b=new Actions(driver);
		WebElement ak=driver.findElement(By.xpath("//img[@alt='Abhishek Tomar']"));
		b.moveToElement(ak).click().perform();
		WebElement fac=driver.findElement(By.xpath("(//a[@title=\"Facebook\"])[4]"));
		fac.isEnabled();
		WebElement twi=driver.findElement(By.xpath("(//a[@title=\"Twitter\"])[4]"));
		twi.isEnabled();
		WebElement in=driver.findElement(By.xpath("(//a[@title=\"Linkedin\"])[4]"));
		in.isEnabled();
		WebElement gp=driver.findElement(By.xpath("(//a[@title=\"Google-plus\"])[4]"));
		gp.isEnabled();
		Thread.sleep(2000);
	}
	
	@Test(priority=10)
	void worktogether()
	{
		WebElement wt=driver.findElement(By.xpath("(//div[@class=\"elementor-widget-wrap elementor-element-populated\"])"));
		wt.isDisplayed();
		WebElement con=driver.findElement(By.xpath("//span[contains(text(),'Contact Us')]"));
		con.click();
	}

	@AfterTest
	void close() 
	{
		driver.quit();	
	}
	
}


