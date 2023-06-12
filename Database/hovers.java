package Database;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class hovers {
	public String URL="http://the-internet.herokuapp.com";
    WebDriver driver;
    @BeforeTest
	public void hovershomepage() {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium jars\\chromedriver_win32 (1)/chromedriver.exe");
 		ChromeOptions co = new ChromeOptions();
 		co.addArguments("--remote-allow-origins=*");
 		driver = new ChromeDriver(co);
 		driver.manage().window().maximize();
 		driver.get(URL);
	}
    @Test
	public void hovers() throws InterruptedException {
		WebElement hoversp=driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[25]/a"));
		
		Assert.assertTrue(hoversp.isDisplayed(),"hovers is not display");
		
		if(hoversp.isDisplayed()) {
			
			hoversp.click();
			Thread.sleep(2000);
		}
	}
    @Test
	public void hovershome() throws InterruptedException {
    	
    	//verify image 1 
    	
		WebElement image_1=driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/img"));
		
		Assert.assertTrue(image_1.isDisplayed(),"image is not present");
		
		if(image_1.isDisplayed()) {
			
			image_1.click();
		}
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div/a")).click();
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		//verify image 2
		
		WebElement image_2=driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/img"));
		
		Assert.assertTrue(image_2.isDisplayed(),"image is not present");
		
        if(image_2.isDisplayed()) {
			
	          image_2.click();
		}
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/a")).click();

        Thread.sleep(2000);
		
		driver.navigate().back();
		
		//verify image 3
		
        WebElement image_3=driver.findElement(By.xpath("/html/body/div[2]/div/div/div[3]/img"));
		
		Assert.assertTrue(image_3.isDisplayed(),"image is not present");
		
        if(image_3.isDisplayed()) {
			
        	image_3.click();
		}
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[3]/div/a")).click();

        Thread.sleep(2000);
		
		driver.navigate().back();
		

		
		
	}
}
