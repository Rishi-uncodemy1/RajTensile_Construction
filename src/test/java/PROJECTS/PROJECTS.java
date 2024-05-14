package PROJECTS;
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


public class PROJECTS {
	String driverPath = "C:\\Browserdrivers\\chromedriver.exe";
	WebDriver driver = new ChromeDriver();
	@BeforeTest
	void navigate() {
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://rajtensilestructure.com/"); 
			driver.manage().window().maximize();
	}
@Test(priority=1)
void project() throws InterruptedException {
	
driver.findElement(By.xpath("//a[@class=\"elementor-item\"][normalize-space()='Projects']")).click();
Thread.sleep(2000);
}
@Test(priority=2)
void home() throws InterruptedException {
	driver.findElement(By.xpath("//i[@class='fa fa-home']")).click();
	Thread.sleep(2000);
	driver.navigate().back();
}
@Test(priority=3)
void portfolio1() throws InterruptedException {
	Actions a=new Actions(driver);
	WebElement ahd=driver.findElement(By.xpath("//a[@title='Animal Husbandry Department Ranchi Jharkhand']//i[@class='fa fa-arrows-alt']"));
	a.moveToElement(ahd).click().perform();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@class='pp_close']")).click();
	driver.findElement(By.xpath("//div[contains(text(),'Animal Husbandry Department Ranchi Jharkhand')]")).click();
	driver.findElement(By.xpath("//i[@class='fa fa-th']")).click();
	driver.navigate().back();
	driver.findElement(By.xpath("//a[@class=\"elementor-item\"][normalize-space()='Projects']")).click();
	WebElement ggp=driver.findElement(By.xpath("//a[@title='Gulmohar garden Bhopal Madhya Pradesh']//i[@class='fa fa-arrows-alt']"));
	a.moveToElement(ggp).click().perform();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@class='pp_close']")).click();
	driver.findElement(By.xpath("//a[@href='https://rajtensilestructure.com/portfolio/gulmohar-garden-bhopal-madhya-pradesh/']")).click();
	driver.findElement(By.xpath("//i[@class='fa fa-th']")).click();
	driver.findElement(By.xpath("//a[@class=\"elementor-item\"][normalize-space()='Projects']")).click();
	WebElement vp=driver.findElement(By.xpath("//a[@title='Vaibhav palace Bankhedi Mandya pradesh']//i[@class='fa fa-arrows-alt']"));
	a.moveToElement(vp).click().perform();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@class='pp_close']")).click();
	driver.findElement(By.xpath("//div[contains(text(),'Vaibhav palace Bankhedi Mandya pradesh')]")).click();
	driver.findElement(By.xpath("//div[@class='portfolio-archive']//a")).click();
	driver.findElement(By.xpath("//a[@class=\"elementor-item\"][normalize-space()='Projects']")).click();
	
	
	
		
	
		
}
}
 