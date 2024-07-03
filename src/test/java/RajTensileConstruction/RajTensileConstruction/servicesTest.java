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

public class servicesTest 
{
	String driverPath = "C:\\Users\\ramya\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
	WebDriver driver = new ChromeDriver();
	
	@BeforeTest
	void navigate() 
	{
		driver.get("https://rajtensilestructure.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test(priority=1)
	void sevices() throws InterruptedException
	{
		Actions a=new Actions(driver);
		WebElement ser=driver.findElement(By.xpath("(//a[@class=\"elementor-item elementor-item-anchor has-submenu\"])"));
		a.moveToElement(ser).click().perform();
		Thread.sleep(2000);
		WebElement cp=driver.findElement(By.xpath("(//a[@class=\"elementor-sub-item\"][normalize-space()='Car Parking Tensile Structure'])"));
		a.moveToElement(cp).click().perform();
		Thread.sleep(2000);
		driver.navigate().back();
		a.moveToElement(ser).click().perform();
		Thread.sleep(2000);
		WebElement walk=driver.findElement(By.xpath("(//a[@class=\"elementor-sub-item\"][normalize-space()='Walkway Tensile Structure'])"));
		a.moveToElement(walk).click().perform();
		Thread.sleep(2000);
		driver.navigate().back();
		a.moveToElement(ser).click().perform();
		Thread.sleep(2000);
		WebElement aud=driver.findElement(By.xpath("(//a[@class=\"elementor-sub-item\"][normalize-space()='Auditorium Tensile Structure'])"));
		a.moveToElement(aud).click().perform();
		Thread.sleep(2000);
		driver.navigate().back();
		a.moveToElement(ser).click().perform();
		Thread.sleep(2000);
		WebElement gaz=driver.findElement(By.xpath("(//a[@class=\"elementor-sub-item\"][normalize-space()='Gazebo Tensile Structure'])"));
		a.moveToElement(gaz).click().perform();
		Thread.sleep(2000);
		driver.navigate().back();
		a.moveToElement(ser).click().perform();
		Thread.sleep(2000);
		WebElement swim=driver.findElement(By.xpath("(//a[@class=\"elementor-sub-item\"][normalize-space()='Swimming Pool Tensile Covering'])"));
		a.moveToElement(swim).click().perform();
		Thread.sleep(2000);
		driver.navigate().back();
		a.moveToElement(ser).click().perform();
		Thread.sleep(2000);
		WebElement stad=driver.findElement(By.xpath("(//a[@class=\"elementor-sub-item\"][normalize-space()='Stadium Tensile Structure'])"));
		a.moveToElement(stad).click().perform();
		Thread.sleep(2000);
		driver.navigate().back();
	}
	
	@AfterTest
	void close() 
	{
		driver.quit();	
	}


}
