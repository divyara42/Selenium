package seleniumclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test01 {

	public static void main(String[] args) {
		
		WebDriver driver;
         WebDriverManager.chromedriver().setup();
         
         driver = new ChromeDriver();
         driver.get("https://www.google.com/");
         WebElement searchbox = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
         searchbox.sendKeys("Google Text");
         searchbox.sendKeys(Keys.ENTER);
         
         
         
	}

}
