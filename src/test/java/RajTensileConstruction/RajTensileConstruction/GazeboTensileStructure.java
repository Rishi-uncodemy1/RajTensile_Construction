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

public class GazeboTensileStructure 
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
		WebElement gaz=driver.findElement(By.xpath("(//a[@class=\"elementor-sub-item\"][normalize-space()='Gazebo Tensile Structure'])"));
		a.moveToElement(gaz).click().perform();
		Thread.sleep(2000);
		WebElement Previous =driver.findElement(By.xpath("//a[@class='flex-prev']"));
		Previous.click();
		Thread.sleep(2000);	
		WebElement Next =driver.findElement(By.xpath("//a[@class='flex-next']"));
		Next.click();
		Thread.sleep(2000);			
		WebElement DC =driver.findElement(By.xpath("//a[normalize-space()='Design & Creativity']"));
		DC.click();
		WebElement EI =driver.findElement(By.xpath("//a[normalize-space()='Engineering Innovation']"));
		EI.click();
		WebElement FQ =driver.findElement(By.xpath("//a[normalize-space()='Fabrication Quality']"));
		FQ.click();
		WebElement CS =driver.findElement(By.xpath("//a[normalize-space()='Construction Service']"));
		CS.click();
		driver.navigate().refresh();
		WebElement FDA =driver.findElement(By.xpath("(//div[@class=\"owl-item\"])[1]"));
		FDA.click();
		WebElement ED =driver.findElement(By.xpath("(//div[@class=\"owl-item\"])[2]"));
		ED.click();
		WebElement PB =driver.findElement(By.xpath("//div[@class=\"owl-prev\"]"));
		PB.click();
		WebElement LM =driver.findElement(By.xpath("(//div[@class=\"owl-item\"])[3]"));
		LM.click();
		WebElement OT =driver.findElement(By.xpath("(//div[@class=\"owl-item\"])[4]"));
		OT.click();
		WebElement NB =driver.findElement(By.xpath("//div[@class=\"owl-next\"]"));
		a.moveToElement(NB).doubleClick();
		WebElement LN =driver.findElement(By.xpath("(//div[@class=\"owl-item\"])[5]"));
		LN.click();
		WebElement NB2=driver.findElement(By.xpath("//div[@class=\"owl-next\"]"));
		a.moveToElement(NB2).doubleClick();
		WebElement CB =driver.findElement(By.xpath("(//div[@class=\"owl-item\"])[6]"));
		CB.click();
		WebElement HI =driver.findElement(By.xpath("//a[@class='home']"));
		HI.click();
		WebElement logo =driver.findElement(By.xpath("//section[@class='elementor-section elementor-top-section elementor-element elementor-element-256c209 elementor-section-content-middle elementor-section-height-min-height elementor-hidden-tablet elementor-hidden-mobile elementor-section-boxed elementor-section-height-default elementor-section-items-middle elementor-sticky elementor-sticky--active elementor-section--handles-inside elementor-sticky--effects animated fadeIn']//div[@class='elementor-column elementor-col-33 elementor-top-column elementor-element elementor-element-2ae7f28']//a"));
		logo.click();
	}
	
	@AfterTest
	void close() 
	{
		driver.quit();	
	}
}
