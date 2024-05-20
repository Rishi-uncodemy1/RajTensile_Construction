package Services;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class gazebo_tensile_structure {
	 WebDriver driver=new ChromeDriver();
	@BeforeTest
	void navigate()  
	{
		driver.get("https://rajtensilestructure.com/"); 
	}
	@Test(priority=2)
	void Access_GTS() 
	{
		WebElement Services =driver.findElement(By.xpath("//li[@class=\"menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children menu-item-14313\"]"));
		Services.click();	   
	    WebElement Gazebo =driver.findElement(By.xpath("(//li[@class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-14337\"])"));
	    Gazebo.click();
	}
	@Test(priority=2)
	void previousandnext() throws InterruptedException 
	{
		WebElement Previous =driver.findElement(By.xpath("//a[@class='flex-prev']"));
		Previous.click();
		Thread.sleep(2000);	
		WebElement Next =driver.findElement(By.xpath("//a[@class='flex-next']"));
		Next.click();
		Thread.sleep(2000);			
		}
	@Test(priority=3)
	void designandcreativity()
	{
		WebElement DC =driver.findElement(By.xpath("//a[normalize-space()='Design & Creativity']"));
		DC.click();
	}
	@Test(priority=4)
	void Engineering_Innovation() 
	{
		WebElement EI =driver.findElement(By.xpath("//a[normalize-space()='Engineering Innovation']"));
		EI.click();
	}
	@Test(priority=5)
	void Fabrication_Quality()
	{
		WebElement FQ =driver.findElement(By.xpath("//a[normalize-space()='Fabrication Quality']"));
		FQ.click();
	}
	@Test(priority=6)
	void Construction_Service() 
	{
		WebElement CS =driver.findElement(By.xpath("//a[normalize-space()='Construction Service']"));
		CS.click();
		driver.navigate().refresh();
	}
	@Test(priority=7)
	void FlexibleDesign_Asthetics()
	{
		WebElement FDA =driver.findElement(By.xpath("(//div[@class=\"owl-item\"])[1]"));
		FDA.click();
	}
	@Test(priority=8)
	void Excellent_Durability()
	{
		WebElement ED =driver.findElement(By.xpath("(//div[@class=\"owl-item\"])[2]"));
		ED.click();
	}
	@Test(priority=9)
	void Previous_Button() 
	{
		WebElement PB =driver.findElement(By.xpath("//div[@class=\"owl-prev\"]"));
		PB.click();
	}
	@Test(priority=10)
	void Low_Maintenance() 
	{
		WebElement LM =driver.findElement(By.xpath("(//div[@class=\"owl-item\"])[3]"));
		LM.click();
	}
	@Test(priority=11)
	void Outstanding_Translucency()
	{
		WebElement OT =driver.findElement(By.xpath("(//div[@class=\"owl-item\"])[4]"));
		OT.click();
	}
	@Test(priority=12)
	void Next_Button()
	{
		WebElement NB =driver.findElement(By.xpath("//div[@class=\"owl-next\"]"));
		Actions a=new Actions(driver);
		a.moveToElement(NB).doubleClick();
	}
	@Test(priority=13)
	void Lightweight_Nature() 
	{
		WebElement LN =driver.findElement(By.xpath("(//div[@class=\"owl-item\"])[5]"));
		LN.click();
	}
	@Test(priority=14)
	void Next_Button2() 
	{
		WebElement NB2=driver.findElement(By.xpath("//div[@class=\"owl-next\"]"));
		Actions a=new Actions(driver);
		a.moveToElement(NB2).doubleClick();
	}
	@Test(priority=15)
	void Cost_Benefits() 
	{
		WebElement CB =driver.findElement(By.xpath("(//div[@class=\"owl-item\"])[6]"));
		CB.click();
	}
	@Test(priority=16)
	void Home_Icon()  
	{
		WebElement HI =driver.findElement(By.xpath("//a[@class='home']"));
		HI.click();
	}
	@Test(priority=17,enabled=false)
	void RajTensile_Logo()  
	{
		WebElement logo =driver.findElement(By.xpath("//section[@class='elementor-section elementor-top-section elementor-element elementor-element-256c209 elementor-section-content-middle elementor-section-height-min-height elementor-hidden-tablet elementor-hidden-mobile elementor-section-boxed elementor-section-height-default elementor-section-items-middle elementor-sticky elementor-sticky--active elementor-section--handles-inside elementor-sticky--effects animated fadeIn']//div[@class='elementor-column elementor-col-33 elementor-top-column elementor-element elementor-element-2ae7f28']//a"));
		logo.click();
	}
	@AfterTest
	void close()
	{
		driver.quit();
}
}
		