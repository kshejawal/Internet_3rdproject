package Database;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Infinite_Scroll {
	
	public String URL="http://the-internet.herokuapp.com";
    WebDriver driver;
    @BeforeTest
	public void scroll() {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium jars\\chromedriver_win32 (1)/chromedriver.exe");
 		ChromeOptions co = new ChromeOptions();
 		co.addArguments("--remote-allow-origins=*");
 		driver = new ChromeDriver(co);
 		driver.manage().window().maximize();
 		driver.get(URL);
	}
	
	@Test
	public void verifyscroll() {
		WebElement scrolli=driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[26]/a"));
		
		Assert.assertTrue(scrolli.isDisplayed(),"infinite scroll is not display");
		
		if(scrolli.isDisplayed()) {
			scrolli.click();
		}
	}
	@Test
	public void scrollhomepage() {
		WebElement headeri=driver.findElement(By.cssSelector("#content > div > h3"));
		
		Assert.assertTrue(headeri.isDisplayed(),"infinite scroll header is not display");
		
	}
}
