package Verticals;
import java.awt.Desktop.Action;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Actions;
import junit.framework.Assert;
public class customapp {
	String driverPath = "C:\\Browserdrivers\\chromedriver.exe";
	WebDriver driver = new ChromeDriver();
	@BeforeTest
	void navigate() {
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.tranktechnologies.com/"); 
			driver.manage().window().maximize();
	}
	@Test(priority=1)
	void vertical() throws InterruptedException {
		Actions a=new Actions(driver);
		WebElement vert=driver.findElement(By.xpath("//a[@href='#'][normalize-space()='Verticals']"));
		a.moveToElement(vert).click().perform();
		Thread.sleep(2000);
	}
	@Test(priority=2)
	void customapp() throws InterruptedException {
		Actions a=new Actions(driver);
		WebElement customapp=driver.findElement(By.xpath("//strong[normalize-space()='Custom App']"));
		a.moveToElement(customapp).click().perform();
		Thread.sleep(2000);
		driver.navigate().back();
		
	}
	@Test(priority=3)
	void deskapp() throws InterruptedException {
		Actions a=new Actions(driver);
		WebElement vert1=driver.findElement(By.xpath("//a[@href='#'][normalize-space()='Verticals']"));
		a.moveToElement(vert1).click().perform();
		WebElement customapp1=driver.findElement(By.xpath("//strong[normalize-space()='Custom App']"));
		a.moveToElement(customapp1).perform();
		WebElement deskapp= driver.findElement(By.xpath("//a[normalize-space()='Desktop App Development']"));
		a.moveToElement(deskapp).click().perform();
		Thread.sleep(2000);
		driver.navigate().back();
	}
	@Test(priority=4)
	void hrmapp() throws InterruptedException {
		Actions a=new Actions(driver);
		WebElement vert1=driver.findElement(By.xpath("//a[@href='#'][normalize-space()='Verticals']"));
		a.moveToElement(vert1).click().perform();
		WebElement customapp1=driver.findElement(By.xpath("//strong[normalize-space()='Custom App']"));
		a.moveToElement(customapp1).perform();
		WebElement hrm= driver.findElement(By.xpath("//a[@class='mm-active'][normalize-space()='HRM Development']"));
		a.moveToElement(hrm).click().perform();
		Thread.sleep(2000);
		driver.navigate().back();
	}
	@Test(priority=5)
	void travel() throws InterruptedException {
		Actions a=new Actions(driver);
		WebElement vert1=driver.findElement(By.xpath("//a[@href='#'][normalize-space()='Verticals']"));
		a.moveToElement(vert1).click().perform();
		WebElement customapp1=driver.findElement(By.xpath("//strong[normalize-space()='Custom App']"));
		a.moveToElement(customapp1).perform();
		WebElement travel= driver.findElement(By.xpath("//a[@class='mm-active'][normalize-space()='Travel']"));
		a.moveToElement(travel).click().perform();
		Thread.sleep(2000);
		driver.navigate().back();
	}
	@Test(priority=6)
	void datingapp() throws InterruptedException {
		Actions a=new Actions(driver);
		WebElement vert1=driver.findElement(By.xpath("//a[@href='#'][normalize-space()='Verticals']"));
		a.moveToElement(vert1).click().perform();
		WebElement customapp1=driver.findElement(By.xpath("//strong[normalize-space()='Custom App']"));
		a.moveToElement(customapp1).perform();
		WebElement datapp= driver.findElement(By.xpath("//a[@class='mm-active'][normalize-space()='Dating App Development']"));
		a.moveToElement(datapp).click().perform();
		Thread.sleep(2000);
		driver.navigate().back();
	}
	@Test(priority=7)
	void crmdev() throws InterruptedException {
		Actions a=new Actions(driver);
		WebElement vert1=driver.findElement(By.xpath("//a[@href='#'][normalize-space()='Verticals']"));
		a.moveToElement(vert1).click().perform();
		WebElement customapp1=driver.findElement(By.xpath("//strong[normalize-space()='Custom App']"));
		a.moveToElement(customapp1).perform();
		WebElement crmdev= driver.findElement(By.xpath("//a[@class='mm-active'][normalize-space()='CRM Development']"));
		a.moveToElement(crmdev).click().perform();
		Thread.sleep(2000);
		driver.navigate().back();
	}
	@Test(priority=8)
	void erpdev() throws InterruptedException {
		Actions a=new Actions(driver);
		WebElement vert1=driver.findElement(By.xpath("//a[@href='#'][normalize-space()='Verticals']"));
		a.moveToElement(vert1).click().perform();
		WebElement customapp1=driver.findElement(By.xpath("//strong[normalize-space()='Custom App']"));
		a.moveToElement(customapp1).perform();
		WebElement erpdev= driver.findElement(By.xpath("//a[@class='mm-active'][normalize-space()='ERP App Development']"));
		a.moveToElement(erpdev).click().perform();
		Thread.sleep(2000);
		driver.navigate().back();
	}
	@Test(priority=9)
	void elearning() throws InterruptedException {
		Actions a=new Actions(driver);
		WebElement vert1=driver.findElement(By.xpath("//a[@href='#'][normalize-space()='Verticals']"));
		a.moveToElement(vert1).click().perform();
		WebElement customapp1=driver.findElement(By.xpath("//strong[normalize-space()='Custom App']"));
		a.moveToElement(customapp1).perform();
		WebElement elearn= driver.findElement(By.xpath("//a[@class='mm-active'][normalize-space()='E-Learning']"));
		a.moveToElement(elearn).click().perform();
		Thread.sleep(2000);
		driver.navigate().back();
	}
	@Test(priority=10)
	void realestate() throws InterruptedException {
		Actions a=new Actions(driver);
		WebElement vert1=driver.findElement(By.xpath("//a[@href='#'][normalize-space()='Verticals']"));
		a.moveToElement(vert1).click().perform();
		WebElement customapp1=driver.findElement(By.xpath("//strong[normalize-space()='Custom App']"));
		a.moveToElement(customapp1).perform();
		WebElement relstate= driver.findElement(By.xpath("//a[@class='mm-active'][normalize-space()='Real Estate']"));
		a.moveToElement(relstate).click().perform();
		Thread.sleep(2000);
		driver.navigate().back();
	}
}
