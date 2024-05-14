package Projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Projects_Test 
{
	String driverPath = "F:\\Webdriver\\chromedriver-win64\\chromedriver.exe";
	WebDriver driver = new ChromeDriver();
	@BeforeTest
	void navigate()  
	{
		driver.get("https://rajtensilestructure.com/"); 
	}
	@Test(priority=1)
	void Access_Projects() 
	{
		WebElement Projects =driver.findElement(By.xpath("//li[@class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-14087\"]"));
		Projects.click();
	}
	@Test(priority=2)
	void ImageExpansion() throws InterruptedException 
	{
		WebElement PF =driver.findElement(By.xpath("//div[@id='portfolio-66425ad4a477e']"));
		driver.switchTo().frame(PF);
		Thread.sleep(2000);
		WebElement IE =driver.findElement(By.xpath("(//i[@class='fa fa-arrows-alt'])[1]"));
		IE.click();
		Thread.sleep(3000);
		
	}
	@AfterTest
	void close()
	{
		driver.quit();
	}
	}
