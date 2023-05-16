package saucelab;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Search_validation {
	@Test
	public void matching_Text() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver109.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://saucelabs.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//header/div[1]/div[1]/div[2]/div[1]/button[1]/div[1]/span[1]/img[1]")).click();
		String act = driver.findElement(By.xpath("//input[@id='search']")).getAttribute("placeholder");
		String exp = "Start typing to search...";
		Assert.assertEquals(act, exp);
		driver.close();
	}
}
