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

public class CarparkingTensileStructure 
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
		WebElement Previous =driver.findElement(By.xpath("//a[@class='flex-prev']"));
		Previous.click();
		Thread.sleep(2000);	
		WebElement Next =driver.findElement(By.xpath("//a[@class='flex-next']"));
		Next.click();
		Thread.sleep(2000);			
		WebElement DC =driver.findElement(By.xpath("//a[normalize-space()='Design & Creativity']"));
		DC.click();
		Thread.sleep(2000);
		WebElement EI =driver.findElement(By.xpath("//a[normalize-space()='Engineering Innovation']"));
		EI.click();
		Thread.sleep(2000);
		WebElement FQ =driver.findElement(By.xpath("//a[normalize-space()='Fabrication Quality']"));
		FQ.click();
		Thread.sleep(2000);
		WebElement CS =driver.findElement(By.xpath("//a[normalize-space()='Construction Service']"));
		CS.click();
		Thread.sleep(2000);
		driver.navigate().refresh();
		WebElement FDA =driver.findElement(By.xpath("(//div[@class=\"owl-item\"])[1]"));
		FDA.click();
		Thread.sleep(1000);
		WebElement ED =driver.findElement(By.xpath("(//div[@class=\"owl-item\"])[2]"));
		ED.click();
		Thread.sleep(1000);
		WebElement PB =driver.findElement(By.xpath("//div[@class=\"owl-prev\"]"));
		PB.click();
		Thread.sleep(1000);
		WebElement LM =driver.findElement(By.xpath("(//div[@class=\"owl-item\"])[3]"));
		LM.click();
		Thread.sleep(1000);
		WebElement OT =driver.findElement(By.xpath("(//div[@class=\"owl-item\"])[4]"));
		OT.click();
		Thread.sleep(2000);
		WebElement NB =driver.findElement(By.xpath("//div[@class=\"owl-next\"]"));
		a.moveToElement(NB).doubleClick();
		Thread.sleep(1000);
		WebElement LN =driver.findElement(By.xpath("(//div[@class=\"owl-item\"])[5]"));
		LN.click();
		Thread.sleep(2000);
		WebElement NB2=driver.findElement(By.xpath("//div[@class=\"owl-next\"]"));
		a.moveToElement(NB2).doubleClick();
		Thread.sleep(1000);
		WebElement CB =driver.findElement(By.xpath("(//div[@class=\"owl-item\"])[6]"));
		CB.click();
		Thread.sleep(1000);
		WebElement HI =driver.findElement(By.xpath("//a[@class='home']"));
		HI.click();
		Thread.sleep(1000);
	}

	@AfterTest
	void close() 
	{
		driver.quit();	
	}
}
