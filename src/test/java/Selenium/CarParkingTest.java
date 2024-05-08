package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CarParkingTest {
	
	 String driverPath="C:\\Users\\vivek\\Downloads\\chromedriver-win64\\chromedriver.exe";
	 WebDriver driver = new ChromeDriver();
	 Boolean a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r;
	 JavascriptExecutor js = (JavascriptExecutor)driver; 
	 
	 
	 @BeforeTest
	 void navigate() throws InterruptedException {
	 driver.navigate().to("https://rajtensilestructure.com/");
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\vivek\\Downloads\\chromedriver-win64\\chromedriver.exe");
	 driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("(//a[@class=\"elementor-item elementor-item-anchor has-submenu\"])[1]")).click();
	 driver.findElement(By.xpath("(//a[@class=\"elementor-sub-item\"])[1]")).click();
	    	  
	       }
	 
	 @Test(priority=1)
     void home() throws InterruptedException {
//    	 Thread.sleep(3000);
    	 WebElement home = driver.findElement(By.xpath("//i[@class=\"fa fa-home\"]"));
    	 c=home.isDisplayed();
    	 
    	 if (c=true) {
    		 home.click();
    	 }
    		 else {
    			 driver.navigate().refresh();
    		 }
    	 }
      @Test(priority=2)
      void imagearrowforward() throws InterruptedException {
    	  Thread.sleep(3000);
    	  WebElement imageforward = driver.findElement(By.xpath("//a[@class=\"flex-next\"]"));
    	  d=imageforward.isDisplayed();
    	  
    	  if (d=true) {
    		  imageforward.click();   		  
    	  }
    	  else {
    		  driver.navigate().refresh();    		  
    	  }
  
      }
    @Test(priority=3)
    void imagearrowprevious() throws InterruptedException {
       Thread.sleep(3000);
        WebElement imageprevious = driver.findElement(By.xpath("//a[@class=\"flex-prev\"]"));
    	e=imageprevious.isDisplayed();
    	if (d=true) {
         imageprevious.click();   		  
     	  }
     	  else {
     		  driver.navigate().refresh();    		  
     	  }
   
       }
      @Test(priority=4)
      void designcreativity() throws InterruptedException {
//      Thread.sleep(3000);
        WebElement design = driver.findElement(By.xpath("//a[normalize-space()='Design & Creativity']"));
        f=design.isDisplayed();
	   if (f=true) {
		  design.click();   		  
	  }
	  else {
		  driver.navigate().refresh();    		  
	  }
     }
      @Test(priority=5)
      void engineeringinnovation() throws InterruptedException {
//         Thread.sleep(3000);
        WebElement innovation = driver.findElement(By.xpath("//a[normalize-space()='Engineering Innovation']"));
        g=innovation.isDisplayed();
    	   if (f=true) {
    		  innovation.click();   		  
    	  }
    	  else {
    		  driver.navigate().refresh();    		  
    	  }
         }
      
     @Test (priority=6) 
      void fabricationquality() throws InterruptedException {
//    	  Thread.sleep(3000);
          WebElement fabric = driver.findElement(By.xpath("//a[normalize-space()='Fabrication Quality']"));
          h=fabric.isDisplayed();
      	   if (h=true) {
      		  fabric.click();   		  
      	  }
      	  else {
      		  driver.navigate().refresh();    		  
      	  }
    	  
    	  
      }
     @Test(priority=7) 
     void constructiveservice() throws InterruptedException {
//   	  Thread.sleep(3000);
         WebElement constructive = driver.findElement(By.xpath("//a[normalize-space()='Construction Service']"));
         i=constructive.isDisplayed();
     	   if (i=true) {
     		  constructive.click();   		  
     	  }
     	  else {
     		  driver.navigate().refresh();    		  
     	  } 
     }
     
     @Test(priority=8)
     void flexibledesign() throws InterruptedException {
//      	  Thread.sleep(3000);
            WebElement flexible = driver.findElement(By.xpath("(//a[@target=\"_self\"])[5]"));
            j=flexible.isDisplayed();
        	   if (j=true) {
        		  flexible.click();   		  
        	  }
        	  else {
        		  driver.navigate().refresh();    		  
        	  }    	  
        }
     @Test(priority=9)
     void excellentdurability() throws InterruptedException {
//     	  Thread.sleep(3000);
           WebElement excellent = driver.findElement(By.xpath("(//a[@target=\"_self\"])[7]"));
           k=excellent.isDisplayed();
       	   if (k=true) {
       		  excellent.click();   		  
       	  }
       	  else {
       		  driver.navigate().refresh();    		  
       	  }    	  
       }
     
     @Test(priority=10)
     void lowmaintenance() throws InterruptedException {
//    	  Thread.sleep(3000);
          WebElement low = driver.findElement(By.xpath("(//a[@target=\"_self\"])[9]"));
          l=low.isDisplayed();
      	   if (l=true) {
      		  low.click();   		  
      	  }
      	  else {
      		  driver.navigate().refresh();    		  
      	  }    	  
      }
     
     @Test(priority=11)
     void outstandingtranslucency() throws InterruptedException {
//   	  Thread.sleep(3000);
         WebElement outstanding = driver.findElement(By.xpath("(//a[@target=\"_self\"])[11]"));
         m=outstanding.isDisplayed();
     	   if (m=true) {
     		  outstanding.click();   		  
     	  }
     	  else {
     		  driver.navigate().refresh();    		  
     	  }    	  
     }
     
     @Test(priority=12)
     void leightweightnature() throws InterruptedException {
//      	  Thread.sleep(5000);
      	  WebElement element = driver.findElement(By.xpath("//h2[normalize-space()='Features Of Our Excellent Tensile Structure']"));
      	  js.executeScript("argument[0].scrollIntoView();", element);
      	  driver.findElement(By.xpath("//i[@class='fa fa-angle-right']")).click();
           WebElement leightweight = driver.findElement(By.xpath("(//a[@target=\"_self\"])[13]"));
           n=leightweight.isDisplayed();
        	   if (n=true) {
        		  leightweight.click();   		  
        	  }
        	  else {
        		  driver.navigate().refresh();    		  
        	  }    	  
        }
     
   @Test(priority=13)
     void costbenefit() throws InterruptedException {
//     	  Thread.sleep(5000);
	      WebElement element = driver.findElement(By.xpath("//h2[normalize-space()='Features Of Our Excellent Tensile Structure']"));
     	  js.executeScript("argument[0].scrollIntoView();", element);
     	  driver.findElement(By.xpath("//i[@class='fa fa-angle-right']")).click();
          WebElement costbenefit = driver.findElement(By.xpath("(//a[@target=\"_self\"])[15]"));
           o=costbenefit.isDisplayed();
       	   if (o=true) {
       		  costbenefit.click();   		  
       	  }
       	  else {
       		  driver.navigate().refresh();    		  
       	  }    	  
       } 
   
   
   @Test(priority=14)
   void featureforward() throws InterruptedException {
//  	  Thread.sleep(3000);
        WebElement featureforward = driver.findElement(By.xpath("//div[@class='owl-next']"));
        p=featureforward.isDisplayed();
    	   if (p=true) {
    		  featureforward.click();   		  
    	  }
    	  else {
    		  driver.navigate().refresh();    		  
    	  }    	  
    }  
  
   @Test(priority=15)
   void featureback() throws InterruptedException {
//  	  Thread.sleep(3000);
        WebElement featureback = driver.findElement(By.xpath("//div[@class='owl-prev']"));
        q=featureback.isDisplayed();
    	   if (q=true) {
    		  featureback.click();   		  
    	  }
    	  else {
    		  driver.navigate().refresh();    		  
    	  }    	  
    }   
   
   @Test(priority=16)
   void contactus() throws InterruptedException {
//  	  Thread.sleep(3000);
        WebElement contactus = driver.findElement(By.xpath("(//a[@class='elementor-button elementor-button-link elementor-size-sm'])[3]"));
        r=contactus.isDisplayed();
    	   if (r=true) {
    		  contactus.click();   		  
    	  }
    	  else {
    		  driver.navigate().refresh();    		  
    	  }    	  
    }   
   
}



	 
	 




