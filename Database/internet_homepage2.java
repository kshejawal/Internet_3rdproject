package Database;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class internet_homepage2 {
  WebDriver driver;
	public String Url="http://the-internet.herokuapp.com/";
  @BeforeTest
  public void lunch() {
	  System.setProperty("webdriver.chrome.driver", "C:\\selenium jars\\chromedriver_win32 (1)/chromedriver.exe");
 		ChromeOptions co = new ChromeOptions();
 		co.addArguments("--remote-allow-origins=*");
 		driver = new ChromeDriver(co);
 		driver.manage().window().maximize();
 		driver.get(Url);
  }
  @Test
  public void verify_internet_homepage() {
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  WebElement Pagetitle=driver.findElement(By.xpath("/html/body/div[2]/div/h1"));
	  WebElement Example= driver.findElement(By.xpath("/html/body/div[2]/div/h2"));
	  WebElement Ab_testing=driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[1]/a"));
	  WebElement Element = driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[2]/a"));
	  WebElement Basic_auth=driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[3]/a"));
	  WebElement Broken_image=driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[4]/a"));
	  WebElement challange_dom=driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[5]/a"));
	  WebElement checkbox =driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[6]/a"));
	  WebElement contextmenue =driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[7]/a"));
	  WebElement Digest_authentication =driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[8]/a"));
	  WebElement disappering_elements =driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[9]/a"));
	  WebElement drag_and_drop= driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[10]/a"));
	  WebElement dropdown= driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[11]/a"));
	  WebElement dynamic_content=driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[12]/a"));
	  WebElement dynamic_control=driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[13]/a"));
	  WebElement dynamic_loading=driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[14]/a"));
	  WebElement entry_add=driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[15]/a"));
	  WebElement exit_intent=driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[16]/a"));
	  WebElement file_download=driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[17]/a"));
	  WebElement file_upload=driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[18]/a"));
	  WebElement floting_menue=driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[19]/a"));
	  WebElement forgot_password=driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[20]/a"));
	  WebElement form_authentication=driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[21]/a"));
	  WebElement frams =driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[22]/a"));
	  WebElement geoloaction =driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[23]/a"));
	  WebElement horizontal_slider =driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[24]/a"));
	  WebElement hovers =driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[25]/a"));
	  WebElement infinite_scrol =driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[26]/a"));
	  WebElement inputs =driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[27]/a"));
	  WebElement jqury_ui_menues =driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[28]/a"));
	  WebElement java_scripts_alert =driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[29]/a"));
	  WebElement javasriptsonload_event_error =driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[30]/a"));
	  WebElement key_presses =driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[31]/a"));
	  WebElement large_and_deep_dom =driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[32]/a"));
	  WebElement multiple_windows =driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[33]/a"));
	  WebElement nasted_frames =driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[34]/a"));
	  WebElement notification_massages =driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[35]/a"));
	  WebElement redirect_link =driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[36]/a"));
	  WebElement secure_file_download =driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[37]/a"));
	  WebElement shadow_dom =driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[38]/a"));
	  WebElement shifting_content =driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[39]/a"));
	  WebElement slow_resorse =driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[40]/a"));
	  WebElement sortable_data_table =driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[41]/a"));
	  WebElement Status_code =driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[42]/a"));
	  WebElement Typos =driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[43]/a"));
	  WebElement  editor=driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[44]/a"));

      Assert.assertTrue(Pagetitle.isDisplayed(), "title is not display");
      Assert.assertTrue(Example.isDisplayed(), "Example is not display");
     
      Assert.assertTrue(Pagetitle.isEnabled(), "Pagetitle is not Enabled");
      Assert.assertTrue(Example.isEnabled(), "Example is not Enabled");
   
  }
  
  
}
