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
public class Verticals {
	String driverPath = "C:\\Browserdrivers\\chromedriver.exe";
	WebDriver driver = new ChromeDriver();
	@BeforeTest
	void navigate() {
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.tranktechnologies.com/"); 
			driver.manage().window().maximize();
	}
	@Test(priority=1)
	void verticals() throws InterruptedException {
		Actions a=new Actions(driver);
		WebElement vert=driver.findElement(By.xpath("//a[@href='#'][normalize-space()='Verticals']"));
		a.moveToElement(vert).click().perform();
		Thread.sleep(2000);
	}
	@Test(priority=2)
	void Trading() throws InterruptedException {
		Actions a=new Actions(driver);
		WebElement trad=driver.findElement(By.xpath("//strong[normalize-space()='Trading']"));
		a.moveToElement(trad).click().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='mm-active'][normalize-space()='Stock Trading']")).click();
		driver.navigate().back();
		WebElement vert=driver.findElement(By.xpath("//a[@href='#'][normalize-space()='Verticals']"));
		a.moveToElement(vert).click().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Paper Trading']")).click();
		driver.navigate().back();
		WebElement vert1=driver.findElement(By.xpath("//a[@href='#'][normalize-space()='Verticals']"));
		a.moveToElement(vert1).click().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='CFD Trading']")).click();
		driver.navigate().back();
		WebElement vert2=driver.findElement(By.xpath("//a[@href='#'][normalize-space()='Verticals']"));
		a.moveToElement(vert2).click().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Trading App Development in Massachusetts']")).click();
		driver.navigate().back();
		WebElement vert3=driver.findElement(By.xpath("//a[@href='#'][normalize-space()='Verticals']"));
		a.moveToElement(vert3).click().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Algo Trading']")).click();
		driver.navigate().back();
		WebElement vert4=driver.findElement(By.xpath("//a[@href='#'][normalize-space()='Verticals']"));
		a.moveToElement(vert4).click().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Custom Trading']")).click();
		driver.navigate().back();
		WebElement vert5=driver.findElement(By.xpath("//a[@href='#'][normalize-space()='Verticals']"));
		a.moveToElement(vert5).click().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Web Portal Trading']")).click();
		
		
	}
	@Test(priority=3)
	void RetailandEcommerce() throws InterruptedException {
		Actions a=new Actions(driver);
		WebElement retail=driver.findElement(By.xpath("//strong[normalize-space()='Retail and Ecommerce']"));
		a.moveToElement(retail).click().perform();
		Thread.sleep(2000);
		
	}

}
