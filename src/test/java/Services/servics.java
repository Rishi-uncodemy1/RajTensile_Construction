package Services;
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

public class servics {
	
	String driverPath = "C:\\Browserdrivers\\chromedriver.exe";
	WebDriver driver = new ChromeDriver();
	@BeforeTest
	void navigate() {
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://rajtensilestructure.com/"); 
			driver.manage().window().maximize();
	}
	@Test(priority=1)
	void service() throws InterruptedException {
		WebElement service= driver.findElement(By.xpath("//a[@class=\"elementor-item elementor-item-anchor has-submenu\"]"));
	       Actions a=new Actions(driver);
	       a.moveToElement(service).click().perform();
	       Thread.sleep(2000);
	       WebElement cp=driver.findElement(By.xpath("//a[@class='elementor-sub-item'][normalize-space()='Car Parking Tensile Structure']"));
	       a.moveToElement(cp).click().perform();
	       driver.navigate().back();
	       a.moveToElement(service).click().perform();
	       Thread.sleep(2000);
	       WebElement wt=driver.findElement(By.xpath("//a[@class='elementor-sub-item'][normalize-space()='Walkway Tensile Structure']"));
	       a.moveToElement(wt).click().perform();
	       driver.navigate().back();
	       a.moveToElement(service).click().perform();
	       Thread.sleep(2000);
	       WebElement at=driver.findElement(By.xpath("//a[@class='elementor-sub-item'][normalize-space()='Auditorium Tensile Structure']"));
	       a.moveToElement(at).click().perform();
	       driver.navigate().back();
	       a.moveToElement(service).click().perform();
	       Thread.sleep(2000);
	       WebElement gt=driver.findElement(By.xpath("//a[@class='elementor-sub-item'][normalize-space()='Gazebo Tensile Structure']"));
	       a.moveToElement(gt).click().perform();
	       driver.navigate().back();
	       a.moveToElement(service).click().perform();
	       Thread.sleep(2000);
	       WebElement sp=driver.findElement(By.xpath("//a[@class='elementor-sub-item'][normalize-space()='Swimming Pool Tensile Covering']"));
	       a.moveToElement(sp).click().perform();
	       driver.navigate().back();
	       a.moveToElement(service).click().perform();
	       Thread.sleep(2000);
	       WebElement st=driver.findElement(By.xpath("//a[@class='elementor-sub-item'][normalize-space()='Stadium Tensile Structure']"));
	       a.moveToElement(st).click().perform();
	       driver.navigate().back();
	
	
	
	}
	

}
