package seleniumclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNg02 {
	@Test
     public void googlesearch() throws InterruptedException {
    	 
	WebDriver driver;
	WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
	 driver.get("https://www.google.com/");
	 WebElement searchbox2 = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
	 searchbox2.sendKeys("Google text");
	 searchbox2.sendKeys(Keys.ENTER);
	 String currenturl = driver.getCurrentUrl();
	 System.out.println("CurrentURL is: " + currenturl);
	 System.out.println("The title is: "+ driver.getTitle());
	 driver.navigate().to("https://demoqa.com/");
	 driver.navigate().back();
	 Thread.sleep(4000);
	 driver.navigate().forward();
	 Thread.sleep(4000);
	 driver.navigate().refresh();
	 driver.close();
	 
	 
	 
	 
     }
	
}
