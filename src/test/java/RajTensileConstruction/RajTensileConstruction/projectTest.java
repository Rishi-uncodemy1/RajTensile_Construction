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

public class projectTest 
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
	void projects()
	{
		WebElement pro=driver.findElement(By.xpath("(//a[@href=\"https://rajtensilestructure.com/projects/\"])"));
		pro.click();
	}
	
	@Test(priority=2)
	void animal() throws InterruptedException
	{
		Actions a=new Actions(driver);
		WebElement ahd=driver.findElement(By.xpath("(//img[@alt=\"Animal Husbandry Department Ranchi Jharkhand\"])"));
		a.moveToElement(ahd).click().perform();
		Thread.sleep(2000);
		WebElement arrows=driver.findElement(By.xpath("//a[@title='Animal Husbandry Department Ranchi Jharkhand']//i[@class='fa fa-arrows-alt']"));
		arrows.click();
		Thread.sleep(2000);
		WebElement cls=driver.findElement(By.xpath("//a[normalize-space()='Close']"));
		cls.click();
		WebElement animal=driver.findElement(By.xpath("(//img[@alt=\"Animal Husbandry Department Ranchi Jharkhand\"])"));
		a.moveToElement(animal).click().perform();
		WebElement dep=driver.findElement(By.xpath("//div[contains(text(),'Animal Husbandry Department Ranchi Jharkhand')]"));
		dep.click();
		driver.navigate().back();
	}
	
	@Test(priority=3)
	void gulmohar() throws InterruptedException
	{
		Actions a=new Actions(driver);
		WebElement ahd=driver.findElement(By.xpath("//img[@alt='Gulmohar garden Bhopal Madhya Pradesh']"));
		a.moveToElement(ahd).click().perform();
		Thread.sleep(2000);
		WebElement arrows=driver.findElement(By.xpath("//a[@title='Gulmohar garden Bhopal Madhya Pradesh']//i[@class='fa fa-arrows-alt']"));
		arrows.click();
		Thread.sleep(2000);
		WebElement cls=driver.findElement(By.xpath("//a[normalize-space()='Close']"));
		cls.click();
		WebElement animal=driver.findElement(By.xpath("//img[@alt='Gulmohar garden Bhopal Madhya Pradesh']"));
		a.moveToElement(animal).click().perform();
		WebElement dep=driver.findElement(By.xpath("//div[contains(text(),'Gulmohar garden Bhopal Madhya Pradesh')]"));
		dep.click();
		driver.navigate().back();
	}
	
	@Test(priority=4)
	void vaibhav() throws InterruptedException
	{
		Actions a=new Actions(driver);
		WebElement ahd=driver.findElement(By.xpath("//img[@alt='Vaibhav palace Bankhedi Mandya pradesh']"));
		a.moveToElement(ahd).click().perform();
		Thread.sleep(2000);
		WebElement arrows=driver.findElement(By.xpath("//a[@title='Vaibhav palace Bankhedi Mandya pradesh']//i[@class='fa fa-arrows-alt']"));
		arrows.click();
		Thread.sleep(2000);
		WebElement cls=driver.findElement(By.xpath("//a[normalize-space()='Close']"));
		cls.click();
		WebElement animal=driver.findElement(By.xpath("//img[@alt='Vaibhav palace Bankhedi Mandya pradesh']"));
		a.moveToElement(animal).click().perform();
		WebElement dep=driver.findElement(By.xpath("//div[contains(text(),'Vaibhav palace Bankhedi Mandya pradesh')]"));
		dep.click();
		driver.navigate().back();
	}
	
	@Test(priority=5)
	void worktogether()
	{
		WebElement wt=driver.findElement(By.xpath("(//div[@class=\"elementor-widget-wrap elementor-element-populated\"])"));
		wt.isDisplayed();
		WebElement con=driver.findElement(By.xpath("//span[contains(text(),'Contact Us')]"));
		con.click();	
	}

	
	@AfterTest
	void close() 
	{
		driver.quit();	
	}
}
