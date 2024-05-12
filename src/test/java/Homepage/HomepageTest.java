package Homepage;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;

public class HomepageTest {
	String path = ("C:\\Users\\manishwrq\\Downloads\\Compressed\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	 Actions action = new Actions(driver);
	  JavascriptExecutor js =(JavascriptExecutor)driver;

	@BeforeTest
	void page() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\manishwrq\\Downloads\\Compressed\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver.get("https://rajtensilestructure.com/");
		Thread.sleep(5000);
		driver.manage().window().maximize();

	}

	@AfterTest
	void close() {
		driver.quit();
	}

	@Test(priority = 1)
	void visibilityhome() {
		WebElement cst = driver.findElement(By.xpath(
				"(//li[@class='menu-item menu-item-type-post_type menu-item-object-page menu-item-home current-menu-item page_item page-item-13993 current_page_item menu-item-14084'])[1]"));
		cst.isDisplayed();

	}

	@Test(priority = 2)
	void Enablehome() {
		WebElement prt = driver.findElement(By.xpath(
				"(//li[@class='menu-item menu-item-type-post_type menu-item-object-page menu-item-home current-menu-item page_item page-item-13993 current_page_item menu-item-14084'])[1]"));
		prt.isEnabled();

	}

	@Test(priority = 3)
	void clicablehome() throws InterruptedException {
		WebElement srt = driver.findElement(By.xpath(
				"(//li[@class='menu-item menu-item-type-post_type menu-item-object-page menu-item-home current-menu-item page_item page-item-13993 current_page_item menu-item-14084'])[1]"));
		srt.isEnabled();

		if (srt.isEnabled() && srt.isDisplayed()) {

			srt.click();
			Thread.sleep(5000);
		}

	}

	@Test(priority = 4)
	void visibilityservices() {
		WebElement visiservices = driver.findElement(By.xpath(
				"(//li[@class='menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children menu-item-14313'])[1]"));
		visiservices.isDisplayed();

	}

	@Test(priority = 5)
	void Enableservices() {
		WebElement eservices = driver.findElement(By.xpath(
				"(//li[@class='menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children menu-item-14313'])[1]"));
		eservices.isEnabled();

	}

	@Test(priority = 6)
	void clickableservices() throws InterruptedException {
		WebElement nrt = driver.findElement(By.xpath(
				"(//li[@class='menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children menu-item-14313'])[1]"));
		Thread.sleep(5000);
		if (nrt.isEnabled() && nrt.isDisplayed()) {

			nrt.click();
			Thread.sleep(5000);
		}

	}

	@Test(priority = 7)
	void visibilityecu() {
		WebElement vcu = driver.findElement(By
				.xpath("(//li[@class='menu-item menu-item-type-post_type menu-item-object-page menu-item-14086'])[1]"));
		vcu.isDisplayed();

	}

	@Test(priority = 8)
	void Enableecu() {
		WebElement ecu = driver.findElement(By
				.xpath("(//li[@class='menu-item menu-item-type-post_type menu-item-object-page menu-item-14086'])[1]"));
		ecu.isEnabled();

	}

	@Test(priority = 9)
	void clickableContactUs() throws InterruptedException {
		WebElement ContactUs = driver.findElement(By
				.xpath("(//li[@class='menu-item menu-item-type-post_type menu-item-object-page menu-item-14086'])[1]"));
		Thread.sleep(5000);
		if (ContactUs.isEnabled() && ContactUs.isDisplayed()) {

			ContactUs.click();
			Thread.sleep(5000);
		}

	}

	@Test(priority = 10)
	void projectvisible() throws InterruptedException {
		WebElement visiproject = driver.findElement(By
				.xpath("(//li[@class='menu-item menu-item-type-post_type menu-item-object-page menu-item-14087'])[1]"));
		visiproject.isDisplayed();
		Thread.sleep(1000);
	}

	@Test(priority = 11)
	void projectenable() throws InterruptedException {

		WebElement pe = driver.findElement(By
				.xpath("(//li[@class='menu-item menu-item-type-post_type menu-item-object-page menu-item-14087'])[1]"));
		Thread.sleep(1000);
		pe.isEnabled();

	}

	@Test(priority = 12)
	void ProjectClickable() throws InterruptedException {

		WebElement pc = driver.findElement(By
				.xpath("(//li[@class='menu-item menu-item-type-post_type menu-item-object-page menu-item-14087'])[1]"));
		Thread.sleep(1000);
		if (pc.isDisplayed() && pc.isEnabled()) {
			Thread.sleep(3000);
			pc.click();
		}
	}

	@Test(priority = 13)
	void visibleaboutUs() {

		WebElement eau = driver.findElement(By
				.xpath("(//li[@class='menu-item menu-item-type-post_type menu-item-object-page menu-item-14085'])[1]"));
		eau.isDisplayed();

	}

	@Test(priority = 14)
	void EnableabousUs() {

		WebElement eau = driver.findElement(By
				.xpath("(//li[@class='menu-item menu-item-type-post_type menu-item-object-page menu-item-14085'])[1]"));
		eau.isDisplayed();

	}

	@Test(priority = 15)
	void clickableaboutus() {
		WebElement cau = driver.findElement(By
				.xpath("(//li[@class='menu-item menu-item-type-post_type menu-item-object-page menu-item-14085'])[1]"));
		if (cau.isEnabled() && cau.isEnabled()) {

			cau.click();
		}
	}

	@Test(priority = 16)
	void leftArrow() throws InterruptedException {
		WebElement sit = driver.findElement(By.xpath("//rs-arrow[@class='tp-leftarrow tparrows zeus']"));// left arrows
		Thread.sleep(5000);
		int i = 1;
		while (i <= 5) {
			sit.click();
			i++;
			Thread.sleep(5000);

		}

	}

	@Test(priority = 17)
	void rightArrow() throws InterruptedException {
		WebElement sit = driver.findElement(By.xpath("//rs-arrow[@class='tp-rightarrow tparrows zeus']"));// left arrows
		Thread.sleep(5000);
		int i = 1;
		while (i <= 6) {
			sit.click();
			i++;
			Thread.sleep(5000);

		}
	}

	@Test(priority = 18)
	void visibleGetinCONTACT() {

		WebElement VGT = driver.findElement(By.xpath("(//div[@class='elementor-button-wrapper'])[1]"));
		VGT.isDisplayed();

	}

	@Test(priority = 19)
	void EnableGetinContact() {

		WebElement eau = driver.findElement(By.xpath("(//div[@class='elementor-button-wrapper'])[1]"));
		eau.isDisplayed();

	}

	@Test(priority = 20)
	void clickablgetincontact() throws InterruptedException {
		WebElement cau = driver.findElement(By.xpath("(//div[@class='elementor-button-wrapper'])[1]"));
		if (cau.isEnabled() && cau.isEnabled()) {
			cau.click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//i[@class='eicon-close']")).click();			
			Thread.sleep(5000);
		}

	}

	@Test(priority = 21)
	void faceBookvisibility() {
		WebElement fv = driver
				.findElement(By.xpath("(//a[@class='elementor-item'][normalize-space()='.Facebook'])[1]"));
		fv.isDisplayed();

	}

	@Test(priority = 22)
	void faceBookenability() {
		WebElement fe = driver
				.findElement(By.xpath("(//a[@class='elementor-item'][normalize-space()='.Facebook'])[1]"));
		fe.isEnabled();
	}

	@Test(priority = 23)
	void facebookclickable() throws InterruptedException {
		WebElement fc = driver.findElement(By.xpath("(//a[@class='elementor-item'][normalize-space()='.Facebook'])[1]"));
		
		
		if (fc.isDisplayed() && fc.isEnabled()) {
			fc.click();
			Thread.sleep(4400);
		}
	}

	@Test(priority = 24)
	void instavisibility() {
		WebElement fv = driver.findElement(By
				.xpath("(//li[@class='menu-item menu-item-type-custom menu-item-object-custom menu-item-13628'])[1]"));
		fv.isDisplayed();

	}

	@Test(priority = 25)
	void instaenability() {
		WebElement fe = driver.findElement(By
				.xpath("(//li[@class='menu-item menu-item-type-custom menu-item-object-custom menu-item-13628'])[1]"));
		fe.isEnabled();
	}

	@Test(priority = 26)
	void instaclickable() throws InterruptedException {
		WebElement fc = driver.findElement(By
				.xpath("(//li[@class='menu-item menu-item-type-custom menu-item-object-custom menu-item-13628'])[1]"));
		if (fc.isDisplayed() && fc.isEnabled()) {
			fc.click();
			Thread.sleep(4400);
		}
	}

	@Test(priority = 27)
	void linkedInvisibility() {
		WebElement fv = driver.findElement(
				By.xpath("//ul[@id='menu-1-55b16c1']//a[@class='elementor-item'][normalize-space()='.Linkedin']"));
		fv.isDisplayed();

	}

	@Test(priority = 28)
	void linkedInenability() {
		WebElement fe = driver.findElement(
				By.xpath("//ul[@id='menu-1-55b16c1']//a[@class='elementor-item'][normalize-space()='.Linkedin']"));
		fe.isEnabled();
	}

	@Test(priority = 29)
	void linkedInclickable() throws InterruptedException {
		js.executeScript("window.scrollBy(0,400)");
		Thread.sleep(1000);
		WebElement fc = driver.findElement(By.xpath("//ul[@id='menu-1-55b16c1']//a[@class='elementor-item'][normalize-space()='.Linkedin']"));
		Thread.sleep(4400);
		if (fc.isDisplayed() && fc.isEnabled()) {

			fc.click();
			Thread.sleep(4400);
		}
	}

}
