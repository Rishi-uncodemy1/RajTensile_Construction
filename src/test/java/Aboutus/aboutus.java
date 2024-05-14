package Aboutus;
import java.awt.Desktop.Action;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Actions;


public class aboutus {
	String driverPath = "C:\\Browserdrivers\\chromedriver.exe";
	WebDriver driver = new ChromeDriver();
	@BeforeTest
	void navigate() {
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://rajtensilestructure.com/"); 
			driver.manage().window().maximize();
	}
	@Test
	void about() throws InterruptedException {
		Thread.sleep(2000);
		WebElement about=driver.findElement(By.xpath("//a[normalize-space()='About Us']"));
		about.click();
		driver.navigate().back();
		Thread.sleep(2000);
	}

}
