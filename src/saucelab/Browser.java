package saucelab;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Browser {

	@Test
	public void login()  {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver109.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement uname = driver.findElement(By.id("user-name"));
		uname.sendKeys("standard_user");
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("secret_sauce");
		WebElement login = driver.findElement(By.id("login-button"));
		login.click();
		WebElement radio = driver.findElement(By.id("react-burger-menu-btn"));
		radio.click();
   //Thread.sleep(2000);
		WebElement signout = driver.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]"));
		signout.click();
		driver.close();

	}
}
