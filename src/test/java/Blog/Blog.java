package Blog;
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
public class Blog {
	
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
		void blog() throws InterruptedException {
			driver.findElement(By.xpath("//a[normalize-space()='Blog']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@href='/blog/category/app-development/']")).click();
			Thread.sleep(2000);
			driver.navigate().back();
			driver.findElement(By.xpath("//a[@href='/blog/category/web-development/']")).click();
			Thread.sleep(2000);
			driver.navigate().back();
			driver.findElement(By.xpath("//a[@href='/blog/category/software-development/']")).click();
			Thread.sleep(2000);
			driver.navigate().back();
			driver.findElement(By.xpath("//a[@href='/blog/category/digital-marketing/']")).click();
			Thread.sleep(2000);
			driver.navigate().back();
			driver.findElement(By.xpath("//a[@href='/blog/category/email-marketing/']")).click();
			Thread.sleep(2000);
			driver.navigate().back();
			driver.findElement(By.xpath("//a[@href='/blog/category/artificial-intelligence/']")).click();
			Thread.sleep(2000);
			driver.navigate().back();
			driver.findElement(By.xpath("//a[@href='/blog/category/ui-ux-design/']")).click();
			Thread.sleep(2000);
			driver.navigate().back();
			
		}
}
