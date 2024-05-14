package AboutUs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AboutUs_Test
{
	String driverPath = "F:\\Webdriver\\chromedriver-win64\\chromedriver.exe";
	WebDriver driver = new ChromeDriver();
	@BeforeTest
	void navigate()  
	{
		driver.get("https://rajtensilestructure.com/"); 
	}
	@Test
	void Access_ContactUs() 
	{
		WebElement ContactUs =driver.findElement(By.xpath("//li[@class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-14085\"]"));
		ContactUs.click();
	}

	@AfterTest
	void close()
	{
		driver.quit();
	}
}
