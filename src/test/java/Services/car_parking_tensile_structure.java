package Services;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class car_parking_tensile_structure {
		
	 WebDriver driver=new ChromeDriver();
	  @BeforeTest
		void Navigate()  
		{
			driver.get("https://rajtensilestructure.com/"); 
		}
		@Test(priority=1)
		void Access_CPTS() 
		{
			WebElement Services =driver.findElement(By.xpath("//li[@class=\"menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children menu-item-14313\"]"));
			Services.click();	   
		    WebElement CarParking =driver.findElement(By.xpath("(//li[@class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-14314\"])"));
		    CarParking.click();
		}
		@Test(priority=2)
		void PreviousandNext() throws InterruptedException 
		{
			WebElement Previous =driver.findElement(By.xpath("//a[@class='flex-prev']"));
			Previous.click();
			Thread.sleep(2000);	
			WebElement Next =driver.findElement(By.xpath("//a[@class='flex-next']"));
			Next.click();
			Thread.sleep(2000);			
			}
		@Test(priority=3)
		void DesignandCreativity() throws InterruptedException 
		{
			WebElement DC =driver.findElement(By.xpath("//a[normalize-space()='Design & Creativity']"));
			DC.click();
			Thread.sleep(2000);
		}
		@Test(priority=4)
		void Engineering_Innovation() throws InterruptedException 
		{
			WebElement EI =driver.findElement(By.xpath("//a[normalize-space()='Engineering Innovation']"));
			EI.click();
			Thread.sleep(2000);
		}
		@Test(priority=5)
		void Fabrication_Quality() throws InterruptedException 
		{
			WebElement FQ =driver.findElement(By.xpath("//a[normalize-space()='Fabrication Quality']"));
			FQ.click();
			Thread.sleep(2000);
		}
		@Test(priority=6)
		void Construction_Service() throws InterruptedException 
		{
			WebElement CS =driver.findElement(By.xpath("//a[normalize-space()='Construction Service']"));
			CS.click();
			Thread.sleep(2000);
			driver.navigate().refresh();
		}
		@Test(priority=7)
		void Flexible_Design_Asthetics() throws InterruptedException 
		{
			WebElement FDA =driver.findElement(By.xpath("(//div[@class=\"owl-item\"])[1]"));
			FDA.click();
			Thread.sleep(1000);
		}
		@Test(priority=8)
		void Excellent_Durability() throws InterruptedException 
		{
			WebElement ED =driver.findElement(By.xpath("(//div[@class=\"owl-item\"])[2]"));
			ED.click();
			Thread.sleep(1000);
		}
		@Test(priority=9)
		void Previous_Button() throws InterruptedException 
		{
			WebElement PB =driver.findElement(By.xpath("//div[@class=\"owl-prev\"]"));
			PB.click();
			Thread.sleep(1000);
		}
		@Test(priority=10)
		void Low_Maintenance() throws InterruptedException 
		{
			WebElement LM =driver.findElement(By.xpath("(//div[@class=\"owl-item\"])[3]"));
			LM.click();
			Thread.sleep(1000);
		}
		@Test(priority=11)
		void Outstanding_Translucency() throws InterruptedException 
		{
			WebElement OT =driver.findElement(By.xpath("(//div[@class=\"owl-item\"])[4]"));
			OT.click();
			Thread.sleep(2000);
		}
		@Test(priority=12)
		void Next_Button() throws InterruptedException 
		{
			WebElement NB =driver.findElement(By.xpath("//div[@class=\"owl-next\"]"));
			Actions a=new Actions(driver);
			a.moveToElement(NB).doubleClick();
			Thread.sleep(1000);
		}
		@Test(priority=13)
		void Lightweight_Nature() throws InterruptedException 
		{
			WebElement LN =driver.findElement(By.xpath("(//div[@class=\"owl-item\"])[5]"));
			LN.click();
			Thread.sleep(2000);
		}
		@Test(priority=14)
		void Next_Button2() throws InterruptedException 
		{
			WebElement NB2=driver.findElement(By.xpath("//div[@class=\"owl-next\"]"));
			Actions a=new Actions(driver);
			a.moveToElement(NB2).doubleClick();
			Thread.sleep(1000);
		}
		@Test(priority=15)
		void Cost_Benefits() throws InterruptedException 
		{
			WebElement CB =driver.findElement(By.xpath("(//div[@class=\"owl-item\"])[6]"));
			CB.click();
			Thread.sleep(1000);
		}
		@Test(priority=16)
		void Home_Icon() throws InterruptedException 
		{
			WebElement HI =driver.findElement(By.xpath("//a[@class='home']"));
			HI.click();
			Thread.sleep(1000);
		}
        @AfterTest
        void close()
         {
         	driver.quit();
         }
         }
