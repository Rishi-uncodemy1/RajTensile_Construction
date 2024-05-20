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

public class Fintech {
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
	void fintech() throws InterruptedException {
		Actions a=new Actions(driver);
		WebElement fintech=driver.findElement(By.xpath("//strong[normalize-space()='Fintech']"));
		a.moveToElement(fintech).click().perform();
		Thread.sleep(2000);
		driver.navigate().back();
		
	}
	@Test(priority=3)
	void possoft() throws InterruptedException {
		Actions a=new Actions(driver);
		WebElement vert1=driver.findElement(By.xpath("//a[@href='#'][normalize-space()='Verticals']"));
		a.moveToElement(vert1).click().perform();
		WebElement fintech1=driver.findElement(By.xpath("//strong[normalize-space()='Fintech']"));
		a.moveToElement(fintech1).perform();
		WebElement possoft= driver.findElement(By.xpath("//a[normalize-space()='Pos Software Development']"));
		a.moveToElement(possoft).click().perform();
		Thread.sleep(2000);
		driver.navigate().back();
	}
	@Test(priority=4)
	void crypto() throws InterruptedException {
		Actions a=new Actions(driver);
		WebElement vert2=driver.findElement(By.xpath("//a[@href='#'][normalize-space()='Verticals']"));
		a.moveToElement(vert2).click().perform();
		WebElement fintech2=driver.findElement(By.xpath("//strong[normalize-space()='Fintech']"));
		a.moveToElement(fintech2).perform();
		WebElement crypto= driver.findElement(By.xpath("//a[normalize-space()='Crypto']"));
		a.moveToElement(crypto).click().perform();
		Thread.sleep(2000);
		driver.navigate().back();
	}
}
