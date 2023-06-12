package Database;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class JQuery_UI_Menus {

	public String url="http://the-internet.herokuapp.com";
	
	WebDriver driver;
	@BeforeTest
	public void jquery() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium jars\\chromedriver_win32 (1)/chromedriver.exe");
 		ChromeOptions co = new ChromeOptions();
 		co.addArguments("--remote-allow-origins=*");
 		driver = new ChromeDriver(co);
 		driver.manage().window().maximize();
 		driver.get(url);
	}
	@Test
	public void jquryverify() {
		
		WebElement jquryv=driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[28]/a"));
		
		Assert.assertTrue(jquryv.isDisplayed(),"jqury ui menues not display");
		
		if(jquryv.isDisplayed()) {
			
		jquryv.click();
		}
	}
	@Test
	public void jquryverifypage() throws InterruptedException {
		WebElement link=driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/p[1]/a"));
		WebElement enabled=driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/ul/li[2]/a"));
		Assert.assertTrue(link.isDisplayed(),"jequry link is not display");
		Assert.assertTrue(enabled.isDisplayed(),"enabled is not display");
        
		if(link.isDisplayed()) {
			
			link.click();
		}
		driver.navigate().back();
		
        if(enabled.isDisplayed()) {
			
			enabled.click();
		}
        Thread.sleep(100);
       
        
        
	}
	@Test
	public void set() {
        WebElement download=driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/ul/li[2]/ul/li[1]/a"));
	     Assert.assertTrue(download.isDisplayed(),"download is not display");

		if(download.isDisplayed()) {
    	
	       	download.click();
	        }
		   WebElement back=driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/ul/li[2]/ul/li[2]/a"));
		   
		     Assert.assertTrue(back.isDisplayed(),"back is not display");

			if(back.isDisplayed()) {
			
				back.click();
			}
			
			WebElement menue=driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/ul/li/a"));
			   
		     Assert.assertTrue(menue.isDisplayed(),"menue is not display");

			if(menue.isDisplayed()) {
			
				menue.click();
			}
			
		
	}
	
	}

