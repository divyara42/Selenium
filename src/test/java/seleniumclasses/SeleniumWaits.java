package seleniumclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumWaits extends Baseclass{

	@Test
	public void ThreadSleep() throws InterruptedException {
		
		
		WebElement remove = driver.findElement(By.id("//button[@type='button']"));
		remove.click();
	Thread.sleep(5000);
		WebElement add = driver.findElement(By.xpath("//button[text()='Add']"));
		add.click();
		Assert.assertEquals(add.isDisplayed(), true);
		
	}
}
