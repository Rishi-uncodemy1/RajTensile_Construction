package Technologies;
import java.awt.Desktop.Action;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Actions;
import junit.framework.Assert;
public class ecommerce {
	String driverPath = "C:\\Browserdrivers\\chromedriver.exe";
	WebDriver driver = new ChromeDriver();
	@BeforeTest
	void navigate() throws InterruptedException {
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.tranktechnologies.com/"); 
			driver.manage().window().maximize();
			Thread.sleep(2000);
	}
	@Test(priority=1)
	void Technology() throws InterruptedException {
		Actions a=new Actions(driver);
		WebElement tech=driver.findElement(By.xpath("//a[@href='#'][normalize-space()='Technologies']"));
		a.moveToElement(tech).perform();
		Thread.sleep(2000);
	}
	@Test(priority=2)
	void magneto() throws InterruptedException {
		Actions a=new Actions(driver);
		WebElement ecomm=driver.findElement(By.xpath("//strong[normalize-space()='eCommerce Development']"));
		a.moveToElement(ecomm).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Magento Development']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
}
	@Test(priority=3)
	void codedev() throws InterruptedException {
		Actions a=new Actions(driver);
		WebElement tech=driver.findElement(By.xpath("//a[@href='#'][normalize-space()='Technologies']"));
		a.moveToElement(tech).perform();
		WebElement ecomm=driver.findElement(By.xpath("//strong[normalize-space()='eCommerce Development']"));
		a.moveToElement(ecomm).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Codeigniter Development']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
}
	@Test(priority=4)
	void bigcomm() throws InterruptedException {
		Actions a=new Actions(driver);
		WebElement tech=driver.findElement(By.xpath("//a[@href='#'][normalize-space()='Technologies']"));
		a.moveToElement(tech).perform();
		WebElement ecomm=driver.findElement(By.xpath("//strong[normalize-space()='eCommerce Development']"));
		a.moveToElement(ecomm).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Big Commerce']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
}
	@Test(priority=5)
	void cscart() throws InterruptedException {
		Actions a=new Actions(driver);
		WebElement tech=driver.findElement(By.xpath("//a[@href='#'][normalize-space()='Technologies']"));
		a.moveToElement(tech).perform();
		WebElement ecomm=driver.findElement(By.xpath("//strong[normalize-space()='eCommerce Development']"));
		a.moveToElement(ecomm).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='CS-Cart Development']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
}
	@Test(priority=6)
	void nopcommerce() throws InterruptedException {
		Actions a=new Actions(driver);
		WebElement tech=driver.findElement(By.xpath("//a[@href='#'][normalize-space()='Technologies']"));
		a.moveToElement(tech).perform();
		WebElement ecomm=driver.findElement(By.xpath("//strong[normalize-space()='eCommerce Development']"));
		a.moveToElement(ecomm).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Nop Commerce']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
}

	@Test(priority=7)
	void laravel() throws InterruptedException {
		Actions a=new Actions(driver);
		WebElement tech=driver.findElement(By.xpath("//a[@href='#'][normalize-space()='Technologies']"));
		a.moveToElement(tech).perform();
		WebElement ecomm=driver.findElement(By.xpath("//strong[normalize-space()='eCommerce Development']"));
		a.moveToElement(ecomm).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Laravel Development']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
}
	@Test(priority=8)
	void drupal() throws InterruptedException {
		Actions a=new Actions(driver);
		WebElement tech=driver.findElement(By.xpath("//a[@href='#'][normalize-space()='Technologies']"));
		a.moveToElement(tech).perform();
		WebElement ecomm=driver.findElement(By.xpath("//strong[normalize-space()='eCommerce Development']"));
		a.moveToElement(ecomm).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Drupal Development']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
}
	@Test(priority=9)
	void joomla() throws InterruptedException {
		Actions a=new Actions(driver);
		WebElement tech=driver.findElement(By.xpath("//a[@href='#'][normalize-space()='Technologies']"));
		a.moveToElement(tech).perform();
		WebElement ecomm=driver.findElement(By.xpath("//strong[normalize-space()='eCommerce Development']"));
		a.moveToElement(ecomm).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Joomla Development']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
}
	@Test(priority=10)
	void xpressjs() throws InterruptedException {
		Actions a=new Actions(driver);
		WebElement tech=driver.findElement(By.xpath("//a[@href='#'][normalize-space()='Technologies']"));
		a.moveToElement(tech).perform();
		WebElement ecomm=driver.findElement(By.xpath("//strong[normalize-space()='eCommerce Development']"));
		a.moveToElement(ecomm).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Express JS Development']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
}
	@Test(priority=11)
	void opencart() throws InterruptedException {
		Actions a=new Actions(driver);
		WebElement tech=driver.findElement(By.xpath("//a[@href='#'][normalize-space()='Technologies']"));
		a.moveToElement(tech).perform();
		WebElement ecomm=driver.findElement(By.xpath("//strong[normalize-space()='eCommerce Development']"));
		a.moveToElement(ecomm).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Opencart Development']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
}
	@Test(priority=12)
	void wordpress() throws InterruptedException {
		Actions a=new Actions(driver);
		WebElement tech=driver.findElement(By.xpath("//a[@href='#'][normalize-space()='Technologies']"));
		a.moveToElement(tech).perform();
		WebElement ecomm=driver.findElement(By.xpath("//strong[normalize-space()='eCommerce Development']"));
		a.moveToElement(ecomm).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='WordPress Development']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
}
	@Test(priority=13)
	void shopyfy() throws InterruptedException {
		Actions a=new Actions(driver);
		WebElement tech=driver.findElement(By.xpath("//a[@href='#'][normalize-space()='Technologies']"));
		a.moveToElement(tech).perform();
		WebElement ecomm=driver.findElement(By.xpath("//strong[normalize-space()='eCommerce Development']"));
		a.moveToElement(ecomm).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Shopify Development']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
}
	@Test(priority=14)
	void nodejs() throws InterruptedException {
		Actions a=new Actions(driver);
		WebElement tech=driver.findElement(By.xpath("//a[@href='#'][normalize-space()='Technologies']"));
		a.moveToElement(tech).perform();
		WebElement ecomm=driver.findElement(By.xpath("//strong[normalize-space()='eCommerce Development']"));
		a.moveToElement(ecomm).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Node JS Development']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
}
	@Test(priority=15)
	void woocom() throws InterruptedException {
		Actions a=new Actions(driver);
		WebElement tech=driver.findElement(By.xpath("//a[@href='#'][normalize-space()='Technologies']"));
		a.moveToElement(tech).perform();
		WebElement ecomm=driver.findElement(By.xpath("//strong[normalize-space()='eCommerce Development']"));
		a.moveToElement(ecomm).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Woo Commerce']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
}
	@Test(priority=16)
	void preshop() throws InterruptedException {
		Actions a=new Actions(driver);
		WebElement tech=driver.findElement(By.xpath("//a[@href='#'][normalize-space()='Technologies']"));
		a.moveToElement(tech).perform();
		WebElement ecomm=driver.findElement(By.xpath("//strong[normalize-space()='eCommerce Development']"));
		a.moveToElement(ecomm).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Prestashop Development']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
}
	@Test(priority=17)
	void wixdev() throws InterruptedException {
		Actions a=new Actions(driver);
		WebElement tech=driver.findElement(By.xpath("//a[@href='#'][normalize-space()='Technologies']"));
		a.moveToElement(tech).perform();
		WebElement ecomm=driver.findElement(By.xpath("//strong[normalize-space()='eCommerce Development']"));
		a.moveToElement(ecomm).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Wix Development']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
}
	@Test(priority=18)
	void reactjs() throws InterruptedException {
		Actions a=new Actions(driver);
		WebElement tech=driver.findElement(By.xpath("//a[@href='#'][normalize-space()='Technologies']"));
		a.moveToElement(tech).perform();
		WebElement ecomm=driver.findElement(By.xpath("//strong[normalize-space()='eCommerce Development']"));
		a.moveToElement(ecomm).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='React JS Development']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
}
}
