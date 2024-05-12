package Homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class arroow {
	 String path = ("C:\\Users\\manishwrq\\Downloads\\Compressed\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	 WebDriver driver = new  ChromeDriver();
	 
	 @BeforeTest
	 void page() throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver" , "C:\\Users\\manishwrq\\Downloads\\Compressed\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			driver.get("https://rajtensilestructure.com/");
			Thread.sleep(5000);
			driver.manage().window().maximize();	 
		 
	 }
	 @AfterTest
	 void close() {
	 	driver.quit();
	 }
	 @Test
	 void arrow() throws InterruptedException {
		 WebElement sit = driver.findElement(By.xpath("//rs-arrow[@class='tp-leftarrow tparrows zeus']"));//left arrows
		 Thread.sleep(5000);
		 int i = 1;
		 
		 while (i<= 5) {
			 sit.click();
			 i++;
			 Thread.sleep(5000);
			
			 
		 }
		 
	 }
	 
	 

}
