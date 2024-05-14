package Home;
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

public class home {
	
	String driverPath = "C:\\Browserdrivers\\chromedriver.exe";
	WebDriver driver = new ChromeDriver();
	@BeforeTest
	void navigate() {
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://rajtensilestructure.com/"); 
			//Actions a=new Actions(driver);
			//a.sendKeys(Keys.ARROW_RIGHT).build().perform();
			driver.manage().window().maximize();
	}
	@Test
	void home1() throws InterruptedException {
		
	driver.findElement(By.xpath("//a[@class='elementor-item elementor-item-active'][normalize-space()='Home']")).click();
	Thread.sleep(2000);
	//driver.navigate().back();
	}
	@Test(priority=1)
	void forward() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='Discover More']")).click();
		driver.navigate().back();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//rs-arrow[@class='tp-rightarrow tparrows zeus rs-touchhover']")).click();
	    driver.findElement(By.xpath("//rs-layer[@id='slider-1-slide-2-layer-8']\r\n")).click();
		driver.findElement(By.xpath("//span[@data-stylerecorder='true'][normalize-space()='Contact Us']")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//rs-arrow[@class='tp-leftarrow tparrows zeus rs-touchhover']")).click();
	
		}
		
	}
	


