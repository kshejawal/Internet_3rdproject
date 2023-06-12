package Database;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class horizontal_Slider {
    public String URL="http://the-internet.herokuapp.com";
	WebDriver driver;
	@BeforeTest
	public void slider() {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium jars\\chromedriver_win32 (1)/chromedriver.exe");
 		ChromeOptions co = new ChromeOptions();
 		co.addArguments("--remote-allow-origins=*");
 		driver = new ChromeDriver(co);
 		driver.manage().window().maximize();
 		driver.get(URL);
 	
 		
	}
	@Test(priority=1)
	public void perfom() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[24]/a")).click();
		
		WebElement header=driver.findElement(By.xpath("/html/body/div[2]/div/div/h3"));
		
		Assert.assertTrue(header.isDisplayed(),"horizontal slider is not present");
		
		if(header.isDisplayed()) {
			
			header.getText();
		}
	}
	@Test(priority=2)
	public void sliderp() {
		
		WebElement slider=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/input"));
		
		Assert.assertTrue(slider.isDisplayed(),"slider is not avilable");
		
		if(slider.isDisplayed()) {
			
			slider.click();
		}
		
		
	}

	
}
