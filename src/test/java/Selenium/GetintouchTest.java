package selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class GetintouchTest {
	Boolean a , b, c,d;
	String driverPath = "C:\\Users\\Shashidhar\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
	
    WebDriver driver = new ChromeDriver();
    @BeforeTest
    void navigate() throws InterruptedException {
    	
    	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shashidhar\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		 driver.get("https://rajtensilestructure.com/");
		 driver.manage().window().maximize();
	     Thread.sleep(2000);
    	
    }
	
    @AfterTest
    void close() {
    	driver.findElement(By.cssSelector("i[class='eicon-close']")).click();
    	driver.quit();
    }
	
    
    @Test(priority=1)
	 void Click() throws InterruptedException {
		
    	  driver.findElement(By.xpath("(//span[@class='elementor-button-text'])[1]")).click();
	     Thread.sleep(2000);
	     WebElement Logo = driver.findElement(By.xpath("//img[@class='attachment-large size-large wp-image-13452']"));
         Thread.sleep(2000);
         a = Logo.isDisplayed();
         System.out.println("Get in touch(Logo) is dispalyed " + a);
   
	}
    
    @Test(priority=2)
	 void Office() throws InterruptedException {
    	 WebElement office = driver.findElement(By.xpath("//h3[normalize-space()='Office']"));
        Thread.sleep(2000);
        b = office.isDisplayed();
        System.out.println("Office Heading is dispalyed " + b);
        WebElement phoneno1 = driver.findElement(By.xpath("//span[contains(text(),'+91 9335441233')]"));
        Thread.sleep(1000);
        b = phoneno1.isDisplayed();
        System.out.println("Contact number 1  is dispalyed " + b);
        WebElement phoneno2 = driver.findElement(By.xpath("//span[contains(text(),'+91 7800609205')]"));
        Thread.sleep(1000);
        b = phoneno2.isDisplayed();
        System.out.println("Contact number 2 is dispalyed " + b);
  
	}
    @Test(priority=3)
	 void email() throws InterruptedException {
    	   WebElement email =	driver.findElement(By.xpath("//span[contains(text(),'rajtensile@gmail.com')]"));
          Thread.sleep(2000);
          c =email.isDisplayed();
          System.out.println("Email  is dispalyed " + c);
          
          WebElement Officesaddress = driver.findElement(By.cssSelector("span[class='elementor-heading-title elementor-size-default']"));
         Thread.sleep(2000);
       c =Officesaddress.isDisplayed();
       System.out.println(" All Office address  are dispalyed " + c);

 
	}
	@Test(priority=4)
	void Letstalk() throws InterruptedException {
		WebElement Letstalk = driver.findElement(By.xpath("//span[contains(text(),'Let’s talk')]"));
		    Thread.sleep(2000);
		    d =Letstalk.isDisplayed();
		    d =Letstalk.isEnabled();
	          System.out.println("Letstalk  is dispalyed " + d);
	          System.out.println("Letstalk  is Enabled " + d);
		    
	          WebElement Letstk =  driver.findElement(By.xpath("//span[contains(text(),'Let’s talk')]"));
		    Thread.sleep(2000);
		    d =Letstalk.isDisplayed();
		    System.out.println("Letstalk  is dispalyed " + d);
		    //driver.findElement(By.xpath("//span[contains(text(),'Let’s talk')]")).click();
		    //Thread.sleep(2000);
		   
	
	}
}
