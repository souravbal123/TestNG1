package saucelab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Saucelab_validation {

	public WebDriver driver;
	public String browser = "chrome";

	@Test
	public void login_validation() {

		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver109.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox") || browser.equalsIgnoreCase("mozilla")) {
			System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "./Driver/msedgedriver.exe");
			driver = new EdgeDriver();
		}
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		WebElement uname = driver.findElement(By.id("user-name"));
		uname.sendKeys("standard_user");
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("secret_sauce");
		WebElement login = driver.findElement(By.id("login-button"));
		login.click();
		//String exp_url = "https://www.saucedemo.com/inventory.html";
		//String act_url = driver.getCurrentUrl();
		//System.out.println(act_url);
		/*
		 * if (exp_url.equals(act_url)) { System.out.println("test pass"); } else {
		 * System.out.println("test fails"); }
		 */
		//Assert.assertEquals(exp_url, act_url);
		WebElement radio=driver.findElement(By.id("react-burger-menu-btn"));
		radio.click();
		WebElement signout=driver.findElement(By.id("logout_sidebar_link"));
		signout.click();
		String exp_url="https://www.saucedemo.com/";
		String act_url=driver.getCurrentUrl();
		Assert.assertEquals(exp_url, act_url);
		
		driver.close();
	}
}
