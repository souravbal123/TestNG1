package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test_annotation {
	public WebDriver driver;

	@Test
	public void testcase1() throws InterruptedException {
		driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/span[1]/img[1]"))
				.click();
		driver.findElement(By.xpath("//span[contains(text(),'The Sauce DevOps Test Toolchain')]")).click();
		//Thread.sleep(10000);
		List<String> actstr = new ArrayList<String>();
		actstr.add(driver.getTitle());
		actstr.add(driver.getCurrentUrl());
		System.out.println(actstr);

		List<String> expstr = new ArrayList<String>();
		expstr.add("Sauce Labs Products: The DevOps Test Toolchain");
		expstr.add("https://saucelabs.com/products");

		Assert.assertEquals(actstr, expstr);
	}

	@Test
	public void testcase2() throws InterruptedException {
		driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/span[1]/img[1]"))
				.click();
		driver.findElement(By.xpath(
				"//header/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/a[1]/div[1]/div[1]/span[1]"))
				.click();
		//Thread.sleep(10000);
		List<String> actstr = new ArrayList<String>();
		actstr.add(driver.getTitle());
		actstr.add(driver.getCurrentUrl());
		List<String> expstr = new ArrayList<String>();
		expstr.add("Cross Browser Testing Tool");
		expstr.add("https://saucelabs.com/products/cross-browser-testing");
		Assert.assertEquals(actstr, expstr);
	}

	@AfterMethod
	public void exit() {
		driver.close();
	}

	@BeforeMethod
	public void start() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver109.exe");
		driver = new ChromeDriver();
		driver.get("https://saucelabs.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

}
