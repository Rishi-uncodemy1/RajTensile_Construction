package RajTensileConstruction.RajTensileConstruction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomepageTest 
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
	void logo() throws InterruptedException
	{
		WebElement logo=driver.findElement(By.xpath("//section[contains(@class,'elementor-section elementor-top-section elementor-element elementor-element-256c209 elementor-section-content-middle elementor-section-height-min-height elementor-hidden-tablet elementor-hidden-mobile elementor-section-boxed elementor-section-height-default elementor-section-items-middle elementor-sticky elementor-sticky--effects animated fadeIn elementor-sticky--active elementor-section--handles-inside')]//div[contains(@class,'elementor-column elementor-col-33 elementor-top-column elementor-element elementor-element-2ae7f28')]//a"));
		logo.isDisplayed();
		Thread.sleep(1000);
		logo.click();
	}
	
	@Test(priority=2)
	void discovermore() throws InterruptedException
	{
		WebElement disc=driver.findElement(By.xpath("(//span[@data-stylerecorder=\"true\"][normalize-space()='Discover More'])"));
		disc.click();
		Thread.sleep(2000);
		driver.navigate().back();
	}
	
	@Test(priority=3)
	void rightarrow()throws InterruptedException
	{
		WebElement rightarr=driver.findElement(By.xpath("//rs-arrow[@class='tp-rightarrow tparrows zeus']"));
		rightarr.click();
		Thread.sleep(2000);
	}
	@Test(priority=4)
	void contactus()throws InterruptedException
	{
		WebElement con=driver.findElement(By.xpath("(//span[@data-stylerecorder=\"true\"][normalize-space()='Contact Us'])"));
		con.click();
		Thread.sleep(2000);
		driver.navigate().back();
	}
	@Test(priority=5)
	void leftarrow()throws InterruptedException
	{
		WebElement leftarr=driver.findElement(By.xpath("//rs-arrow[@class='tp-leftarrow tparrows zeus']"));
		leftarr.click();
		Thread.sleep(2000);
	}
	
	@Test(priority=6)
	void search()throws InterruptedException
	{
		WebElement search=driver.findElement(By.xpath("(//i[@class=\"vamtamtheme- vamtam-theme-search\"])"));
		search.click();
		Thread.sleep(2000);
		WebElement close=driver.findElement(By.xpath("//i[@class='eicon-close']"));
		close.click();
	}
	
	@Test(priority=7)
	void whoweare()
	{
		WebElement description=driver.findElement(By.xpath("//span[contains(text(),'Raj Tensile Structure is a tensile fabric architec')]"));
		description.isEnabled();
		WebElement image=driver.findElement(By.xpath("//div[contains(@class,'col-md-5 col-sm-12 col-xs-12 wpb_column vc_column_container vc_col-sm-5')]//div[contains(@class,'wpb_wrapper')]"));
		image.isEnabled();
	}
	
	@Test(priority=8)
	void knowusbetter()throws InterruptedException
	{
		WebElement design=driver.findElement(By.xpath("//a[normalize-space()='Design & Creativity']"));
		design.isDisplayed();
		WebElement eng=driver.findElement(By.xpath("//a[normalize-space()='Engineering Innovation']"));
		eng.isDisplayed();
		WebElement fab=driver.findElement(By.xpath("//a[normalize-space()='Fabrication Quality']"));
		fab.isDisplayed();
		WebElement con=driver.findElement(By.xpath("//a[normalize-space()='Construction Service']"));
		con.isDisplayed();
		Thread.sleep(2000);
	}
	
	@Test(priority=9)
	void whatweoffer() throws InterruptedException
	{
		WebElement car=driver.findElement(By.xpath("//a[@title='Car Parking Tensile Structure'][normalize-space()='Car Parking Tensile Structure']"));
		car.click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		WebElement walk=driver.findElement(By.xpath("//a[@title='Walkway Tensile Structure'][normalize-space()='Walkway Tensile Structure']"));
		walk.click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		WebElement aud=driver.findElement(By.xpath("//a[@title='Auditorium Tensile Structure'][normalize-space()='Auditorium Tensile Structure']"));
		aud.click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		WebElement gaze=driver.findElement(By.xpath("//a[@title='Gazebo Tensile Structure'][normalize-space()='Gazebo Tensile Structure']"));
		gaze.click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		WebElement swim=driver.findElement(By.xpath("//a[@title='Swimming Pool Tensile Covering'][normalize-space()='Swimming Pool Tensile Covering']"));
		swim.click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		WebElement stad=driver.findElement(By.xpath("//a[@title='Stadium Tensile Structure'][normalize-space()='Stadium Tensile Structure']"));
		stad.click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		WebElement testimonials=driver.findElement(By.xpath("//div[@class='vc_row wpb_row vc_row-fluid vc_custom_1699361994765 overlay-bg-vc-wapper']//div[@class='wpb_wrapper']"));
		testimonials.isDisplayed();
	}
	
	@Test(priority=10)
	void ourprojects()throws InterruptedException
	{
		WebElement our=driver.findElement(By.xpath("//h2[normalize-space()='Our projects']"));
		our.isDisplayed();
		WebElement images=driver.findElement(By.xpath("//div[@class='vc_row wpb_row vc_row-fluid margin-left-60-margin-left-60 vc_custom_1699506203425']//div[@class='vc_column-inner']"));
		images.isEnabled();
		WebElement viewallprojects=driver.findElement(By.xpath("//a[normalize-space()='View All Projects']"));
		viewallprojects.click();
		Thread.sleep(2000);
		driver.navigate().back();
		
	}
	
	@Test(priority=11)
	void worktogether()throws InterruptedException
	{
		WebElement wt=driver.findElement(By.xpath("//div[@class='elementor-headline elementor-headline-animation-type-wave elementor-headline-letters']"));
		wt.isDisplayed();
		WebElement con=driver.findElement(By.xpath("//span[@class='elementor-button-text'][normalize-space()='Contact Us']"));
		con.click();
		Thread.sleep(2000);
		driver.navigate().back();
	}
	
	@Test(priority=12)
	void links() throws InterruptedException
	{
		WebElement home=driver.findElement(By.xpath("//ul[@id='menu-1-2f1b409']//a[@class='elementor-item elementor-item-active'][normalize-space()='Home']"));
		home.click();
		Thread.sleep(1000);
		WebElement about=driver.findElement(By.xpath("//ul[@id='menu-1-2f1b409']//a[@class='elementor-item'][normalize-space()='About Us']"));
		about.click();
		Thread.sleep(1000);
		driver.navigate().back();
		WebElement projects=driver.findElement(By.xpath("//ul[@id='menu-1-2f1b409']//a[@class='elementor-item'][normalize-space()='Projects']"));
		projects.click();
		Thread.sleep(1000);
		driver.navigate().back();
		WebElement contact=driver.findElement(By.xpath("//ul[@id='menu-1-2f1b409']//a[@class='elementor-item'][normalize-space()='Contact Us']"));
		contact.click();
		Thread.sleep(1000);
		driver.navigate().back();
	}
	
	@Test(priority=13)
	void socaillinks()throws InterruptedException
	{	Thread.sleep(2000);
		WebElement facebook=driver.findElement(By.xpath("//ul[@id='menu-1-55b16c1']//a[@class='elementor-item'][normalize-space()='.Facebook']"));
		facebook.click();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		WebElement linkedin=driver.findElement(By.xpath("//ul[@id='menu-1-55b16c1']//a[@class='elementor-item'][normalize-space()='.Linkedin']"));
		linkedin.click();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		WebElement instagram=driver.findElement(By.xpath("//ul[@id='menu-1-55b16c1']//a[@class='elementor-item'][normalize-space()='.Instagram']"));
		instagram.click();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
	}
	
	@AfterTest
	void close() 
	{
		driver.quit();	
	}
}
