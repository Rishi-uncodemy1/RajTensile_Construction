package Raj_Tensile1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Raj_Tensile {
	String driverPath = "F:\\Webdriver\\chromedriver-win64\\chromedriver.exe";
	WebDriver driver = new ChromeDriver();
	SoftAssert soft = new SoftAssert();
	Actions a = new Actions(driver);

	
	@BeforeTest
	void navigate() 
	{
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rajtensilestructure.com/"); 
	}
	@Test
	void home() {
		WebElement home= driver.findElement(By.xpath("//a[@aria-current=\"page\"]"));
		
		 System.out.println("Home button is displayed "+home.isDisplayed());
		 System.out.println("Home button is Enabled "+home.isEnabled());
		//home.click();
		
	}
	@Test(priority=1)
	void rightArrow() {
		WebElement rArrow= driver.findElement(By.xpath("//rs-arrow[@class=\"tp-rightarrow tparrows zeus\"]"));
		 System.out.println("right Arrow is displayed "+rArrow.isDisplayed());
		 System.out.println("right Arrow is Enabled "+rArrow.isEnabled());
		rArrow.click();
		
		
	}
	@Test(priority=2)
	void leftArrow() {
		WebElement lArrow= driver.findElement(By.xpath("//rs-arrow[@class=\"tp-leftarrow tparrows zeus\"]"));
		 System.out.println("left Arrow is displayed "+lArrow.isDisplayed());
		 System.out.println("left Arrow is Enabled "+lArrow.isEnabled());
		lArrow.click();
		
	}
	@Test(priority=3)
	void discoverMore() throws InterruptedException {
		WebElement dMore= driver.findElement(By.xpath("//a[@id='slider-1-slide-1-layer-0']"));
		System.out.println("discoverMore button is displayed "+dMore.isDisplayed());
		 System.out.println("discoverMore button is Enabled "+dMore.isEnabled());
		dMore.click();
		driver.navigate().back();	
		Thread.sleep(2000);

	}
	@Test(priority=4)
	void contactUs()  {
	
		
		WebElement conUs= driver.findElement(By.xpath("//span[@data-stylerecorder='true'][normalize-space()='Contact Us']"));
			System.out.println("contact Us button is displayed "+conUs.isDisplayed());
			 System.out.println("contact Us button is Enabled "+conUs.isEnabled());
			 conUs.click();
			driver.navigate().back();	
		
	}
	@Test(priority=5)
	void whoWeAre() {
		WebElement WeAre= driver.findElement(By.xpath("//h2[normalize-space()='WHO WE ARE']"));
		WeAre.getText();
		 String ExpectedResult = "WHO WE ARE";
		System.out.println("discoverMore button is displayed "+WeAre.isDisplayed());
		soft.assertTrue(WeAre.isDisplayed());
		soft.assertEquals(WeAre.getText(), ExpectedResult);
	}
	@Test(priority=6)
	void whoWeAreImg1() {
		WebElement WeAreimg1= driver.findElement(By.xpath("//img[@title='Eco-Friendly-Fabric-Membrane-Tent-Structures-Lodges-In-Desert-Camping-Resort-1']"));
		soft.assertTrue(WeAreimg1.isDisplayed());
	}
	@Test(priority=7)
	void whoWeAreImg2() {
		WebElement WeAreimg2= driver.findElement(By.xpath("//img[@title='Customize-Tensile-Structure-for-Recreational-Resorts-Tourism-Industry-1']"));
		soft.assertTrue(WeAreimg2.isDisplayed());
	}
	@Test(priority=8)
	void whoWeAreText() {
		WebElement WeAretext= driver.findElement(By.xpath("//span[contains(text(),'Raj Tensile Structure is a tensile fabric architec')]"));
		soft.assertTrue(WeAretext.isDisplayed());
	}
	@Test(priority=9)
	void knowUsBetter() {
		WebElement knowUs= driver.findElement(By.xpath("//h2[normalize-space()='KNOW US BETTER']"));
		String ExpectedResult ="KNOW US BETTER";
		soft.assertTrue(knowUs.isDisplayed());
		soft.assertEquals(knowUs.getText(), ExpectedResult);
	}
	@Test(priority=10)
	void designAndCreativity() {
		WebElement design= driver.findElement(By.xpath("//a[normalize-space()='Design & Creativity']"));
		String ExpectedResult ="Design & Creativity";
		soft.assertTrue(design.isDisplayed());
		soft.assertTrue(design.isEnabled());
		soft.assertEquals(design.getText(), ExpectedResult);
		design.click();
		driver.navigate().back();
	}
	@Test(priority=11)
	void engineeringInnovation() {
		WebElement eng= driver.findElement(By.xpath("//a[normalize-space()='Engineering Innovation']"));
		String ExpectedResult ="Engineering Innovation";
		soft.assertTrue(eng.isDisplayed());
		soft.assertTrue(eng.isEnabled());
		soft.assertEquals(eng.getText(), ExpectedResult);
		eng.click();
		driver.navigate().back();
	}
	@Test(priority=12)
	void fabricationQuality() {
		WebElement fabri= driver.findElement(By.xpath("//a[normalize-space()='Fabrication Quality']"));
		String ExpectedResult ="Fabrication Quality";
		soft.assertTrue(fabri.isDisplayed());
		soft.assertTrue(fabri.isEnabled());
		soft.assertEquals(fabri.getText(), ExpectedResult);
		fabri.click();
		driver.navigate().back();
	}
	@Test(priority=13)
	void constructionService() {
		WebElement cons= driver.findElement(By.xpath("//a[normalize-space()='Construction Service']"));
		String ExpectedResult ="Construction Service";
		soft.assertTrue(cons.isDisplayed());
		soft.assertTrue(cons.isEnabled());
		soft.assertEquals(cons.getText(), ExpectedResult);
		cons.click();
		driver.navigate().back();
	}
	@Test(priority=14)
	void whatWeOffer() {
		WebElement WeOffer= driver.findElement(By.xpath("//h2[normalize-space()='WHAT WE OFFER']"));
		String ExpectedResult ="WHAT WE OFFER";
		soft.assertTrue(WeOffer.isDisplayed());
		soft.assertEquals(WeOffer.getText(), ExpectedResult);
	}
	@Test(priority=15)
	void  carParking() {
		WebElement carParking= driver.findElement(By.xpath("//a[@title='Car Parking Tensile Structure'][normalize-space()='Car Parking Tensile Structure']"));
		String ExpectedResult ="Car Parking Tensile Structure'";
		soft.assertTrue(carParking.isDisplayed());
		soft.assertTrue(carParking.isEnabled());
		soft.assertEquals(carParking.getText(), ExpectedResult);
		carParking.click();
		driver.navigate().back();
	}
	@Test(priority=16)
	void walkway() {
		WebElement Walk= driver.findElement(By.xpath("//a[@title='Walkway Tensile Structure'][normalize-space()='Walkway Tensile Structure']"));
		String ExpectedResult ="Walkway Tensile Structure";
		soft.assertTrue(Walk.isDisplayed());
		soft.assertTrue(Walk.isEnabled());
		soft.assertEquals(Walk.getText(), ExpectedResult);
		Walk.click();
		driver.navigate().back();
	}
	@Test(priority=17)
	void auditorium() {
		WebElement Audi= driver.findElement(By.xpath("//a[@title='Auditorium Tensile Structure'][normalize-space()='Auditorium Tensile Structure']"));
		String ExpectedResult ="Auditorium Tensile Structure";
		soft.assertTrue(Audi.isDisplayed());
		soft.assertTrue(Audi.isEnabled());
		soft.assertEquals(Audi.getText(), ExpectedResult);
		Audi.click();
		driver.navigate().back();
	}
	@Test(priority=18)
	void gazebo() {
		WebElement gazebo= driver.findElement(By.xpath("//a[@title='Gazebo Tensile Structure'][normalize-space()='Gazebo Tensile Structure']"));
		String ExpectedResult ="Gazebo Tensile Structure";
		soft.assertTrue(gazebo.isDisplayed());
		soft.assertTrue(gazebo.isEnabled());
		soft.assertEquals(gazebo.getText(), ExpectedResult);
		gazebo.click();
		driver.navigate().back();
	}
	@Test(priority=19)
	void swimmingPool () {
		WebElement Pool= driver.findElement(By.xpath("//a[@title='Swimming Pool Tensile Covering'][normalize-space()='Swimming Pool Tensile Covering']"));
		String ExpectedResult ="Swimming Pool Tensile Covering";
		soft.assertTrue(Pool.isDisplayed());
		soft.assertTrue(Pool.isEnabled());
		soft.assertEquals(Pool.getText(), ExpectedResult);
		Pool.click();
		driver.navigate().back();
	}
	@Test(priority=20)
	void stadium() {
		WebElement stadium= driver.findElement(By.xpath("//a[@title='Stadium Tensile Structure'][normalize-space()='Stadium Tensile Structure']"));
		String ExpectedResult ="Stadium Tensile Structure";
		soft.assertTrue(stadium.isDisplayed());
		soft.assertTrue(stadium.isEnabled());
		soft.assertEquals(stadium.getText(), ExpectedResult);
		stadium.click();
		driver.navigate().back();
		}
	@Test(priority=21)
	void testimonials() {
		WebElement test= driver.findElement(By.xpath("//h2[normalize-space()='TESTIMONIALS']"));
		String ExpectedResult ="TESTIMONIALS";
		soft.assertTrue(test.isDisplayed());
		soft.assertEquals(test.getText(), ExpectedResult);
	}
	@Test(priority=22)
	void ourProject() {
		WebElement Project= driver.findElement(By.xpath("//h2[normalize-space()='Our projects']"));
		String ExpectedResult ="Our projects";
		soft.assertTrue(Project.isDisplayed());
		soft.assertEquals(Project.getText(), ExpectedResult);
	}
	@Test(priority=23)
	void ourProjectImg1EyeButton() {
		WebElement Img1= driver.findElement(By.xpath("//img[@alt='Animal Husbandry Department Ranchi Jharkhand']"));
		a.moveToElement(Img1).build().perform();
		WebElement eye= driver.findElement(By.xpath("(//i[@class='fa fa-eye'])[1]"));
		eye.click();
		driver.navigate().back();
	}
	@Test(priority=24)
	void ourProjectImg1win() {
		WebElement Img1= driver.findElement(By.xpath("//img[@alt='Animal Husbandry Department Ranchi Jharkhand']"));
		a.moveToElement(Img1).build().perform();
		WebElement win= driver.findElement(By.xpath("//a[@title='Animal Husbandry Department Ranchi Jharkhand']"));
		win.click();
		WebElement close= driver.findElement(By.xpath("//a[@class='pp_close']"));
		close.click();
	}
	@Test(priority=25)
	void ourProjectImg2EyeButton() {
		WebElement Img2= driver.findElement(By.xpath("//img[@alt='Gulmohar garden Bhopal Madhya Pradesh']"));
		a.moveToElement(Img2).build().perform();
		WebElement eye= driver.findElement(By.xpath("(//i[@class='fa fa-eye'])[2]"));
		eye.click();
		driver.navigate().back();
	}
	@Test(priority=26)
	void ourProjectImg2win() {
		WebElement Img2= driver.findElement(By.xpath("//img[@alt='Gulmohar garden Bhopal Madhya Pradesh']"));
		a.moveToElement(Img2).build().perform();
		WebElement win= driver.findElement(By.xpath("//a[@title='Gulmohar garden Bhopal Madhya Pradesh']//i[@class='fa fa-arrows-alt']"));
		win.click();
		WebElement close= driver.findElement(By.xpath("//a[@class='pp_close']"));
		close.click();
	}
	@Test(priority=27)
	void ourProjectImg3EyeButton() {
		WebElement Img3= driver.findElement(By.xpath("//img[@alt='Vaibhav palace Bankhedi Mandya pradesh']"));
		a.moveToElement(Img3).build().perform();
		WebElement eye= driver.findElement(By.xpath("(//a[@class='ico-view-detail'])[3]"));
		eye.click();
		driver.navigate().back();
	}
	@Test(priority=28)
	void ourProjectImg3win() {
		WebElement Img3= driver.findElement(By.xpath("//img[@alt='Vaibhav palace Bankhedi Mandya pradesh']"));
		a.moveToElement(Img3).build().perform();
		WebElement win= driver.findElement(By.xpath("//a[@title='Vaibhav palace Bankhedi Mandya pradesh']//i[@class='fa fa-arrows-alt']"));
		win.click();
		WebElement close= driver.findElement(By.xpath("//a[@class='pp_close']"));
		close.click();
	}
	@AfterTest
	void close() {
		driver.quit();
	}
}
