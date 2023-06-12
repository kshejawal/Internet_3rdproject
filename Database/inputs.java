package Database;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class inputs {
	public String url="http://the-internet.herokuapp.com";
	
    WebDriver driver;
    @BeforeTest
	public void inputs() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium jars\\chromedriver_win32 (1)/chromedriver.exe");
 		ChromeOptions co = new ChromeOptions();
 		co.addArguments("--remote-allow-origins=*");
 		driver = new ChromeDriver(co);
 		driver.manage().window().maximize();
 		driver.get(url);
	}
    @Test
	public void verify_inputs() throws InterruptedException {
		WebElement input =driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[27]/a"));
		
		Assert.assertTrue(input.isDisplayed(),"inputs is not display");
		
		if(input.isDisplayed()) {
			
			input.click();
			
			Thread.sleep(2000);
		}
	}
    @Test
    public void inputshomepage() {
    	WebElement inputheader=driver.findElement(By.cssSelector("#content > div > div > h3"));
    	
    	WebElement number=driver.findElement(By.cssSelector("#content > div > div > div > p"));
    	
    	Assert.assertTrue(inputheader.isDisplayed(),"input header is not display");
    	
    	Assert.assertTrue(number.isDisplayed(),"number is not display");

    	
    	if(inputheader.isDisplayed()) {
    		
    		inputheader.getText();
    	}
    	if(number.isDisplayed()) {
    		
    		number.getText();
    	}
    }
    @Test
    public void number_box() {
    	WebElement numbox=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/input"));
    	
    	Assert.assertTrue(numbox.isDisplayed(),"numbox is not display");
    	
    	if(numbox.isDisplayed()) {
    	
    		numbox.click();
    		
    		numbox.sendKeys("12345");
    		
    	}
    }
}
