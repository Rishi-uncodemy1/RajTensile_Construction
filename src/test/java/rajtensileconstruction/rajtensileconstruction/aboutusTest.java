package rajtensileconstruction.rajtensileconstruction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class aboutusTest {
	String driverPath = "C:\\Users\\shyamini\\Downloads\\Selenium\\chromedriver-win64\\chromedriver.exe";
	WebDriver driver = new ChromeDriver();
	@BeforeTest
	void navigate() {
		driver.get("https://rajtensilestructure.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test(priority=1)
	void aboutus() throws InterruptedException {
    	Thread.sleep(10000);
    	WebElement dr = driver.findElement(By.xpath("(//a[@class=\"elementor-item\"])[1]"));
    	dr.click();
    }
	@Test(priority=2)
	void companyprof() {
		WebElement cp = driver.findElement(By.xpath("//a[normalize-space()='COMPANY PROFILE']"));
		cp.click();
	}
	@Test(priority=3)
	void yearexp() {
		WebElement yp= driver.findElement(By.xpath("//li[@class='vc_tta-tab vc_active']//span[@class='vc_tta-title-text'][normalize-space()='YEARS OF EXPERIENCE']"));
		boolean b = yp.isDisplayed();

		if (b=true) {
			 yp.click();
		}

		else {
			 driver.navigate().refresh();
		}
	}
	@Test(priority=4)
	void bstmatrl() {
		WebElement bm= driver.findElement(By.xpath("//div[@class='vc_row wpb_row vc_row-fluid bg-gray']//li[2]//a[1]"));
		boolean d = bm.isDisplayed();

		if (d=true) {
			 bm.click();
		}

		else {
			 driver.navigate().refresh();
		}
	}
	@Test(priority=5)
	void profstnd() {
		WebElement ps= driver.findElement(By.xpath("(//span[@class=\"vc_tta-title-text\"])[3]"));
		boolean x = ps.isDisplayed();

		if (x=true) {
			 ps.click();
		}

		else {
			 driver.navigate().refresh();
		}
	}
	@Test(priority=6)
	void conctus() {
		WebElement cs= driver.findElement(By.xpath("//span[contains(text(),'Contact Us')]"));
		boolean c = cs.isDisplayed();

		if (c=true) {
			 cs.click();
		}

		else {
			 driver.navigate().refresh();
		}
	}
	@AfterTest
	void close() {
		driver.quit();	}
	
}
