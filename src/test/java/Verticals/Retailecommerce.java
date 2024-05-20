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
public class Retailecommerce {
	
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
	void Retaileccomerce() throws InterruptedException {
		Actions a=new Actions(driver);
		WebElement retail=driver.findElement(By.xpath("//strong[normalize-space()='Retail and Ecommerce']"));
		a.moveToElement(retail).click().perform();
		Thread.sleep(2000);
		driver.navigate().back();
		WebElement vert1=driver.findElement(By.xpath("//a[@href='#'][normalize-space()='Verticals']"));
		a.moveToElement(vert1).click().perform();
		WebElement retail1=driver.findElement(By.xpath("//strong[normalize-space()='Retail and Ecommerce']"));
		a.moveToElement(retail1).perform();
		WebElement ecommerce=driver.findElement(By.xpath("//a[normalize-space()='eCommerce Website Development']"));
		a.moveToElement(ecommerce).click().perform();
		Thread.sleep(2000);
		driver.navigate().back();
		//WebElement vert2=driver.findElement(By.xpath("//a[@href='#'][normalize-space()='Verticals']"));
		//a.moveToElement(vert2).click().perform();
		
	}
	@Test(priority=3)
	
		void ecommapp() throws InterruptedException {
			driver.navigate().back();
			Actions a=new Actions(driver);
			WebElement vert=driver.findElement(By.xpath("//a[@href='#'][normalize-space()='Verticals']"));
			a.moveToElement(vert).click().perform();
			Thread.sleep(2000);
			WebElement retail=driver.findElement(By.xpath("//strong[normalize-space()='Retail and Ecommerce']"));
			a.moveToElement(retail).perform();
			Thread.sleep(2000);
		   WebElement ecommapp=driver.findElement(By.xpath("//a[normalize-space()='eCommerce App Development']"));
		   a.moveToElement(ecommapp).click().perform();
		   driver.navigate().back();

}
		
}
