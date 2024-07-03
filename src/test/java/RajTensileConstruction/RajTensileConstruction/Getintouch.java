package RajTensileConstruction.RajTensileConstruction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Getintouch 
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
	void getintouch() throws InterruptedException
	{
		WebElement get=driver.findElement(By.xpath("//section[@class='elementor-section elementor-top-section elementor-element elementor-element-256c209 elementor-section-content-middle elementor-section-height-min-height elementor-hidden-tablet elementor-hidden-mobile elementor-section-boxed elementor-section-height-default elementor-section-items-middle elementor-sticky elementor-sticky--effects animated fadeIn elementor-sticky--active elementor-section--handles-inside']//span[@class='elementor-button-text'][normalize-space()='Get in touch']"));
		get.click();
		WebElement number=driver.findElement(By.xpath("//div[@class='elementor-element elementor-element-580548ed elementor-align-center elementor-widget elementor-widget-button']//a[@class='elementor-button elementor-button-link elementor-size-sm']"));
		number.click();
		Thread.sleep(2000);
		WebElement number2=driver.findElement(By.xpath("//div[@class='elementor-element elementor-element-0bb79bf elementor-align-center elementor-widget elementor-widget-button']//a[@class='elementor-button elementor-button-link elementor-size-sm']"));
		number2.click();
		Thread.sleep(2000);
		WebElement email=driver.findElement(By.xpath("//div[@class='elementor-element elementor-element-4a409825 elementor-align-center elementor-widget elementor-widget-button']//a[@class='elementor-button elementor-button-link elementor-size-sm']"));
		email.click();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		WebElement letstalk=driver.findElement(By.xpath("//div[@class='elementor-element elementor-element-f9f638b elementor-align-center elementor-widget elementor-widget-button']//a[@class='elementor-button elementor-button-link elementor-size-sm']"));
		letstalk.click();
		WebElement facebook=driver.findElement(By.xpath("//ul[@id='menu-1-7340ae7c']//a[@class='elementor-item'][normalize-space()='.Facebook']"));
		facebook.click();
		driver.switchTo().defaultContent();
		WebElement linkedin=driver.findElement(By.xpath("//ul[@id='menu-1-7340ae7c']//a[@class='elementor-item'][normalize-space()='.Linkedin']"));
		linkedin.click();
		driver.switchTo().defaultContent();
		WebElement instagram=driver.findElement(By.xpath("//ul[@id='menu-1-7340ae7c']//a[@class='elementor-item'][normalize-space()='.Instagram']"));
		instagram.click();
		driver.switchTo().defaultContent();
		WebElement close=driver.findElement(By.xpath("//a[@aria-label='Close']"));
		close.click();
	}
	
	@AfterTest
	void close() 
	{
		driver.quit();	
	}



}
