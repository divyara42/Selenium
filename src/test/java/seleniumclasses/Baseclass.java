package seleniumclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

  @Test
public class Baseclass {
	
	WebDriver driver;
	
	@BeforeMethod
	public void seetup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_controls");
	}
	@AfterMethod
	public void end() {
		driver.close();
		
	}

}
