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

public class artificialintelligence {
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
	void Artificial() throws InterruptedException {
		Actions a=new Actions(driver);
		WebElement tech=driver.findElement(By.xpath("//a[@href='#'][normalize-space()='Technologies']"));
		a.moveToElement(tech).perform();
		Thread.sleep(2000);
		WebElement artificial=driver.findElement(By.xpath("//strong[normalize-space()='Artificial Intelligence']"));
		a.moveToElement(artificial).perform();
		driver.navigate().back();
		
	}

}
