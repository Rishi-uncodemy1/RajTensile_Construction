package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ServicesTest {
	Boolean a,b;
    String driverPath="C:\\Users\\vivek\\Downloads\\chromedriver-win64\\chromedriver.exe";
	WebDriver driver = new ChromeDriver();

	@BeforeTest
	void navigate() {
	driver.navigate().to("https://rajtensilestructure.com/");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vivek\\Downloads\\chromedriver-win64\\chromedriver.exe");
	driver.manage().window().maximize();
	}
	@Test (priority=1)
	
	void services() throws InterruptedException {
		Thread.sleep(5000);
		WebElement click =driver.findElement(By.xpath("(//a[@class=\"elementor-item elementor-item-anchor has-submenu\"])[1]"));
	    a= click.isDisplayed();
	
    	
	    if(a= true) {
		click.click();
	    }
//		action.moveToElement(service).perform();
	    else {
        driver.navigate().refresh();	
	    }
	    }
	
	
@Test(priority=2)
 void carparkingtensile() throws InterruptedException {
	Thread.sleep(3000); 
WebElement carparking= driver.findElement(By.xpath("(//a[@class=\"elementor-sub-item\"])[1]"));
b= carparking.isDisplayed();

if (b=true) {
	 carparking.click();
}

else {
	 driver.navigate().refresh();
}
}
	@AfterTest
	    void quit() {
	    driver.quit();
	    }
	
}
	

