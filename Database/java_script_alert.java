package Database;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class java_script_alert {
	
	public String url="http://the-internet.herokuapp.com";
    WebDriver driver;
    @BeforeTest
	public void javascriptalert() {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium jars\\chromedriver_win32 (1)/chromedriver.exe");
 		ChromeOptions co = new ChromeOptions();
 		co.addArguments("--remote-allow-origins=*");
 		driver = new ChromeDriver(co);
 		driver.manage().window().maximize();
 		driver.get(url);
	}
    @Test
	public void scriptverify() throws InterruptedException {
		WebElement javahome=driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[29]/a"));
		Assert.assertTrue(javahome.isDisplayed(),"java script alert is not display");
		if(javahome.isDisplayed()) {
			javahome.click();
		}
		WebElement jsalert=driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button"));
    	Assert.assertTrue(jsalert.isDisplayed(),"js alert is not display");
    	if(jsalert.isDisplayed()) {
    		jsalert.click();
    		driver.switchTo().alert().accept();
    	}
		WebElement jsconform=driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button"));
    	Assert.assertTrue(jsconform.isDisplayed(),"js conform is not display");
    	if(jsconform.isDisplayed()) {
    		jsconform.click();
    		driver.switchTo().alert().accept();
    	}
    	WebElement jsprompt=driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button"));
    	Assert.assertTrue(jsprompt.isDisplayed(),"js prompt is not display");
    	if(jsprompt.isDisplayed()) {
    		jsprompt.click();
    		driver.switchTo().alert().accept();
    	}
		
	}
}
