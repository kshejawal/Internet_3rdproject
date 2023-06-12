package Database;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class geolocation {
	
	WebDriver driver;
	
	@BeforeTest
	public void geoLocationhomepage() {
		 System.setProperty("webdriver.chrome.driver", "C:\\selenium jars\\chromedriver_win32 (1)/chromedriver.exe");
	 		ChromeOptions co = new ChromeOptions();
	 		co.addArguments("--remote-allow-origins=*");
	 		driver = new ChromeDriver(co);
	 		driver.manage().window().maximize();

	}
	@Test(priority=1)
	public void verifypage() {
		//verify geolocation is visisble and clickable
		
		driver.get("http://the-internet.herokuapp.com");
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
        WebElement geolocation = driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[23]/a"));
        
        assertTrue(geolocation.isEnabled(),"geolocation not display");
        
        if(geolocation.isEnabled()) {
        	
        	geolocation.click();
        }
	}
	@Test(priority=2)
	public void bluebox() {
		//verify where am i button is visible and clickable
		  WebElement Whereami=driver.findElement(By.cssSelector("#content > div > button"));

	      assertTrue(Whereami.isDisplayed(),"where am i blue box is not display");
	        
	      assertTrue(Whereami.isEnabled(),"where am i blue box is not enabled");
	      
	      if(Whereami.isDisplayed()) {
	    	  
	    	  Whereami.click();
	      }
	     

	}
       
}
