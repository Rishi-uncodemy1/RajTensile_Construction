package services;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WalkwayTensileStructureTest{
	String driverPath = "C:\\Users\\Administrator\\OneDrive\\Documents\\Uncodemy\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
	WebDriver driver = new ChromeDriver();
	
	Boolean a,b,c;
	Actions action = new Actions(driver);
	

	@BeforeTest
	void navigate_functionality() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\OneDrive\\Documents\\Uncodemy\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver.navigate().to("https://rajtensilestructure.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}

	@Test(priority=1)
	void visibilityServices() throws InterruptedException {
		WebElement services = driver.findElement(By.xpath("(//span[@class='sub-arrow'])[1]"));
		//action.moveToElement(services).perform();

		a=services.isDisplayed();
		b=services.isEnabled();

		if(a==true && b==true) {
			services.click();
			Thread.sleep(2000);
			System.out.println("Services Module is visible");
		}
		else {
			driver.navigate().refresh();
		}	
	}

	@Test(priority=2)
	void visibilityWalkwayTensileStructure() throws InterruptedException {
		WebElement walkwayTensileStructure = driver.findElement(By.xpath("(//a[@class='elementor-sub-item'])[2]"));

		a=walkwayTensileStructure.isDisplayed();
		b=walkwayTensileStructure.isEnabled();

		if(a==true && b==true) {
			walkwayTensileStructure.click();
			Thread.sleep(2000);
			//c=walkwayTensileStructure.isSelected();
			//System.out.println("Walkway Tensile Structure option is visible and selectable: "+c);
		}
		else {
			driver.navigate().refresh();
		}
	}

	@Test(priority=3)
	void visibilityLogo() throws InterruptedException {
		WebElement logo = driver.findElement(By.xpath("//h1[normalize-space()='Walkway Tensile Structure']"));
		a=logo.isDisplayed();
		System.out.println("Logo is visible: "+a);
		Thread.sleep(2000);

		WebElement homebtn = driver.findElement(By.xpath("//i[@class='fa fa-home']"));
		b=homebtn.isDisplayed();
		c=b=homebtn.isEnabled();
		System.out.println("Home button is visible: "+b);
		System.out.println("Home button is clickable: "+c);
		homebtn.click();
		Thread.sleep(2000);
	}

	@Test(priority=4)
	void walkwayTensileStructurePage() throws InterruptedException {
		WebElement services = driver.findElement(By.xpath("(//span[@class='sub-arrow'])[1]"));
		services.click();
		Thread.sleep(2000);

		WebElement walkwayTensileStructure = driver.findElement(By.xpath("(//a[@class='elementor-sub-item'])[2]"));
		walkwayTensileStructure.click();
		Thread.sleep(2000);
	}

	@Test(priority=5)
	void visibilityFeatures() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(2000);

		js.executeScript("window.scrollBy(0,650)");
		Thread.sleep(2000);

		WebElement features = driver.findElement(By.xpath("//strong[normalize-space()='Features: Walkway Tensile Structures']"));
		a= features.isDisplayed();
		System.out.println("Features are visible: "+a);
	}

	@Test(priority=6)
	void visibilityNextFlexes() throws InterruptedException {
		WebElement nextbtn = driver.findElement(By.xpath("//a[@class='flex-next']"));
		a=nextbtn.isDisplayed();
		System.out.println("Next arrow button on flexes is visible: "+a);
		b=nextbtn.isEnabled();
		System.out.println("Next arrow button on flexes is enabled: "+b);
		
		for(int i=1;i<=5;i++){
			action.moveToElement(nextbtn).perform();
			Thread.sleep(1000);
		}
		Thread.sleep(2000);
	}
	
	@Test(priority=7)
	void visibilityPreviousFlexes() throws InterruptedException {
		WebElement previousbtn = driver.findElement(By.xpath("//a[@class='flex-prev']"));
		a=previousbtn.isDisplayed();
		System.out.println("Previous button button on flexes is visible: "+a);
		b=previousbtn.isEnabled();
		System.out.println("Previous button button on flexes is enabled: "+b);

		
		for(int i=1;i<=5;i++){
			action.moveToElement(previousbtn).perform();
			Thread.sleep(1000);
		}
		Thread.sleep(2000);
	}
	
	@Test(priority=8)
	void visibilityDesignAndCreativity(){
		WebElement designAndCreativity = driver.findElement(By.xpath("//a[normalize-space()='Design & Creativity']"));
		a=designAndCreativity.isDisplayed();
		System.out.println("Design&Creativity is visible: "+a);
		designAndCreativity.click();
	} 
	
	@Test(priority=9)
	void visibilityEngineeringInnovation() throws InterruptedException{
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(2000);

		js.executeScript("window.scrollBy(0,850)");
		Thread.sleep(2000);
		
		WebElement engineeringInnovation = driver.findElement(By.xpath("//a[normalize-space()='Engineering Innovation']"));
		a=engineeringInnovation.isDisplayed();
		System.out.println("Engineering Innovation is visible: "+a);
		engineeringInnovation.click();
	}
	
	@Test(priority=10)
	void visibilityFabricationQuality() throws InterruptedException{
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(2000);

		js.executeScript("window.scrollBy(0,850)");
		Thread.sleep(2000);
		
		WebElement fabricationQuality = driver.findElement(By.xpath("//a[normalize-space()='Fabrication Quality']"));
		a=fabricationQuality.isDisplayed();
		System.out.println("Fabrication Quality is visible: "+a);
		fabricationQuality.click();
	}
	
	@Test(priority=11)
	void visibilityConstructionService() throws InterruptedException{
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(2000);

		js.executeScript("window.scrollBy(0,850)");
		Thread.sleep(2000);
		
		WebElement constructionService = driver.findElement(By.xpath("//a[normalize-space()='Construction Service']"));
		a=constructionService.isDisplayed();
		System.out.println("Construction Service is visible: "+a);
		constructionService.click();
	}
	
	@Test(priority=12)
	void visibilityFlexibleDesignAesthetics() throws InterruptedException {
		WebElement element = driver.findElement(By.xpath("//h2[normalize-space()='Features Of Our Excellent Tensile Structure']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView()",element);
		WebElement previousbtn = driver.findElement(By.xpath("//i[@class='fa fa-angle-left']"));
		previousbtn.click();
		WebElement flexibleDesignAesthetics = driver.findElement(By.xpath("//div[@class='owl-wrapper']//div[1]//div[1]//a[1]//img[1]"));
		a=flexibleDesignAesthetics.isDisplayed();
		if(a=true) {
			flexibleDesignAesthetics.click();
		}
		else {
			driver.navigate().refresh();
		}
	}
	
	@Test(priority=13)
	void visibilityExcellentDurability() throws InterruptedException {
		WebElement element = driver.findElement(By.xpath("//h2[normalize-space()='Features Of Our Excellent Tensile Structure']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView()",element);
		WebElement previousbtn = driver.findElement(By.xpath("//i[@class='fa fa-angle-left']"));
		previousbtn.click();
		WebElement excellentDurability = driver.findElement(By.xpath("//div[@class='fullwidth']//div[@class='container']//div[2]//div[1]//a[1]//img[1]"));
		a=excellentDurability.isDisplayed();
		if(a=true) {
			excellentDurability.click();
		}
		else {
			driver.navigate().refresh();
		}
	}
	
	@Test(priority=14)
	void visibilityLowMaintenance() throws InterruptedException {
		WebElement element = driver.findElement(By.xpath("//h2[normalize-space()='Features Of Our Excellent Tensile Structure']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView()",element);
		WebElement previousbtn = driver.findElement(By.xpath("//i[@class='fa fa-angle-left']"));
		previousbtn.click();
		WebElement lowMaintenance = driver.findElement(By.xpath("//div[@class='fullwidth']//div[3]//div[1]//a[1]//img[1]"));
		a=lowMaintenance.isDisplayed();
		if(a=true) {
			lowMaintenance.click();
		}
		else {
			driver.navigate().refresh();
		}
	}
	
	@Test(priority=15)
	void visibilityOutstandingTranslucency() throws InterruptedException {
		WebElement element = driver.findElement(By.xpath("//h2[normalize-space()='Features Of Our Excellent Tensile Structure']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView()",element);
		driver.findElement(By.xpath("//div[@class='owl-next']")).click();
		WebElement outstandingTranslucency = driver.findElement(By.xpath("//div[@class='fullwidth']//div[3]//div[1]//a[1]//img[1]"));
		a=outstandingTranslucency.isDisplayed();
		if(a=true) {
			outstandingTranslucency.click();
		}
		else {
			driver.navigate().refresh();
		}
	}
	
	@Test(priority=16)
	void visibilityLightWeightNature() throws InterruptedException {
		WebElement element = driver.findElement(By.xpath("//h2[normalize-space()='Features Of Our Excellent Tensile Structure']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView()",element);
		driver.findElement(By.xpath("//div[@class='owl-next']")).click();
		WebElement lightWeightNature = driver.findElement(By.xpath("//div[@class='fullwidth']//div[3]//div[1]//a[1]//img[1]"));
		a=lightWeightNature.isDisplayed();
		if(a=true) {
			lightWeightNature.click();
		}
		else {
			driver.navigate().refresh();
		}
	}
	
	@Test(priority=17)
	void visibilityNextButton() throws InterruptedException {
		WebElement nextbtn = driver.findElement(By.xpath("//i[@class='fa fa-angle-right']"));
		
		for(int i=1;i<=3;i++) {
		nextbtn.click();
		Thread.sleep(1000);
		}
	}
	
	@Test(priority=18)
	void visibilityPreviousButton() throws InterruptedException {
		WebElement previousbtn = driver.findElement(By.xpath("//i[@class='fa fa-angle-left']"));
		
		for(int i=1;i<=3;i++) {
		previousbtn.click();
		Thread.sleep(1000);
		}
	}
	
	@Test(priority=19)
	void visibilityContactUsButton() {
		WebElement contactUsButton = driver.findElement(By.xpath("(//span[@class='elementor-button-text'])[3]"));
		a=contactUsButton.isDisplayed();
		System.out.println("Contact Us Button is visible: "+a);
		b=contactUsButton.isEnabled();
		System.out.println("Contact Us Button is Enabled: "+b);
		contactUsButton.click();
	}
	
	@AfterTest
	void quitFunctionality() {
		driver.close();
	}
}
