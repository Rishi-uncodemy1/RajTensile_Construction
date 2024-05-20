package Technologies;
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
public class Technologies {
	String driverPath = "C:\\Browserdrivers\\chromedriver.exe";
	WebDriver driver = new ChromeDriver();
	@BeforeTest
	void navigate() throws InterruptedException {
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.tranktechnologies.com/"); 
			driver.manage().window().maximize();
			Thread.sleep(2000);
	}
	@Test(priority=1)
	void Technology() throws InterruptedException {
		Actions a=new Actions(driver);
		WebElement tech=driver.findElement(By.xpath("//a[@href='#'][normalize-space()='Technologies']"));
		a.moveToElement(tech).click().perform();
		Thread.sleep(2000);
	}
	@Test(priority=2)
	void tech() throws InterruptedException {
		Actions a=new Actions(driver);
		WebElement ecomm=driver.findElement(By.xpath("//strong[normalize-space()='eCommerce Development']"));
		a.moveToElement(ecomm).click().perform();
		Thread.sleep(2000);
		driver.navigate().back();
		
}
	@Test(priority=3)
	void mobileapp() throws InterruptedException {
		Actions a=new Actions(driver);
		WebElement mobapp=driver.findElement(By.xpath("//strong[normalize-space()='Mobile App Development']"));
		a.moveToElement(mobapp).click().perform();
		Thread.sleep(2000);
		driver.navigate().back();
		
}
	@Test(priority=4)
	void artificialint() throws InterruptedException {
		Actions a=new Actions(driver);
		WebElement artf=driver.findElement(By.xpath("//strong[normalize-space()='Artificial Intelligence']"));
		a.moveToElement(artf).click().perform();
		Thread.sleep(2000);
		driver.navigate().back();
		
}
}
