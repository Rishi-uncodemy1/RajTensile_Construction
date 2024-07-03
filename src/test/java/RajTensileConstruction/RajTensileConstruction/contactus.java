package RajTensileConstruction.RajTensileConstruction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class contactus 
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
	void contact()throws InterruptedException
	{
		WebElement con=driver.findElement(By.xpath("(//a[normalize-space()='Contact Us'])"));
		con.click();
		WebElement add=driver.findElement(By.xpath("//i[@class='fa fa-road']"));
		add.click();
		WebElement phone=driver.findElement(By.xpath("//i[@class='fa fa-phone']"));
		phone.click();
		WebElement ema=driver.findElement(By.xpath("//i[@class='fa fa-envelope']"));
		ema.click();
		Thread.sleep(2000);
	}
	
	@Test(priority=2)
	void sendusmessage() throws InterruptedException
	{
		WebElement mes=driver.findElement(By.xpath("//h2[normalize-space()='send a message']"));
		mes.isDisplayed();
		WebElement name=driver.findElement(By.xpath("//input[@id='your-name']"));
		name.sendKeys("Ramya");
		WebElement email=driver.findElement(By.xpath("//input[@id='your-email']"));
		email.sendKeys("ramyasnaika20@gmail.com");
		WebElement message=driver.findElement(By.xpath("//textarea[@id='your-message']"));
		message.sendKeys("Hello");
		Thread.sleep(3000);
		WebElement submit=driver.findElement(By.xpath("//input[@id='submit']"));
		submit.click();
	}

	@AfterTest
	void close() 
	{
		driver.quit();	
	}
	
}
