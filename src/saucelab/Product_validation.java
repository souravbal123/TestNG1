package saucelab;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Product_validation {
	public WebDriver driver;

	@Test
	public void testcase1() throws InterruptedException {

		driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/span[1]/img[1]"))
				.click();

		driver.findElement(By.xpath("//span[contains(text(),'The Sauce DevOps Test Toolchain')]")).click();
		Thread.sleep(10000);
		List<String> actstr = new ArrayList<String>();
		actstr.add(driver.getTitle());
		actstr.add(driver.getCurrentUrl());

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
		Thread.sleep(10000);
		List<String> actstr = new ArrayList<String>();
		actstr.add(driver.getTitle());
		actstr.add(driver.getCurrentUrl());
		List<String> expstr = new ArrayList<String>();
		expstr.add("Cross Browser Testing Tool");
		expstr.add("https://saucelabs.com/products/cross-browser-testing");
		Assert.assertEquals(actstr, expstr);
	}

	@Test
	public void testcase3() throws InterruptedException {

		driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/span[1]/img[1]"))
				.click();
		driver.findElement(By.xpath(
				"//header/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/a[1]/div[1]/div[1]/span[1]"))
				.click();
		Thread.sleep(10000);
		List<String> actstr = new ArrayList<String>();
		actstr.add(driver.getTitle());
		actstr.add(driver.getCurrentUrl());
		List<String> expstr = new ArrayList<String>();
		expstr.add("Mobile Testing for iOS, Android Apps, and Games");
		expstr.add("https://saucelabs.com/products/mobile-testing");
		Assert.assertEquals(actstr, expstr);
	}

	@Test
	public void testcase4() throws InterruptedException {

		driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/span[1]/img[1]"))
				.click();
		driver.findElement(By.xpath(
				"//header/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/a[1]/div[1]/div[1]/span[1]"))
				.click();
		Thread.sleep(10000);
		List<String> actstr = new ArrayList<String>();
		actstr.add(driver.getTitle());
		actstr.add(driver.getCurrentUrl());
		List<String> expstr = new ArrayList<String>();
		expstr.add("AI-driven Low-Code and No-Code Testing");
		expstr.add("https://saucelabs.com/products/low-code-testing");
		Assert.assertEquals(actstr, expstr);

	}

	@Test
	public void testcase5() throws InterruptedException {

		driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/span[1]/img[1]"))
				.click();
		driver.findElement(By.xpath(
				"//header/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/a[1]/div[1]/div[1]/span[1]"))
				.click();
		Thread.sleep(10000);
		List<String> actstr = new ArrayList<String>();
		actstr.add(driver.getTitle());
		actstr.add(driver.getCurrentUrl());
		List<String> expstr = new ArrayList<String>();
		expstr.add("Sauce Performance");
		expstr.add("https://saucelabs.com/products/sauce-performance");
		Assert.assertEquals(actstr, expstr);
	}

	@Test
	public void testcase6() throws InterruptedException {

		driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/span[1]/img[1]"))
				.click();
		driver.findElement(By.xpath(
				"//header/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[4]/a[1]/div[1]/div[1]/span[1]"))
				.click();
		Thread.sleep(10000);
		List<String> actstr = new ArrayList<String>();
		actstr.add(driver.getTitle());
		actstr.add(driver.getCurrentUrl());
		List<String> expstr = new ArrayList<String>();
		expstr.add("App Monitoring & Error Reporting With Backtrace");
		expstr.add("https://saucelabs.com/products/error-reporting");
		Assert.assertEquals(actstr, expstr);
	}

	@Test
	public void testcase7() throws InterruptedException {

		driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/span[1]/img[1]"))
				.click();
		driver.findElement(By.xpath(
				"//header/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[5]/a[1]/div[1]/div[1]/span[1]"))
				.click();
		Thread.sleep(10000);
		List<String> actstr = new ArrayList<String>();
		actstr.add(driver.getTitle());
		actstr.add(driver.getCurrentUrl());
		List<String> expstr = new ArrayList<String>();
		expstr.add("All-in-One API Testing & Quality Platform");
		expstr.add("https://saucelabs.com/products/api-testing");
		Assert.assertEquals(actstr, expstr);

	}

	@Test
	public void testcase8() throws InterruptedException {

		driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/span[1]/img[1]"))
				.click();
		driver.findElement(By.xpath(
				"//header/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[6]/a[1]/div[1]/div[1]/span[1]"))
				.click();
		Thread.sleep(10000);
		List<String> actstr = new ArrayList<String>();
		actstr.add(driver.getTitle());
		actstr.add(driver.getCurrentUrl());
		List<String> expstr = new ArrayList<String>();
		expstr.add("Visual Testing");
		expstr.add("https://saucelabs.com/products/visual-testing");
		Assert.assertEquals(actstr, expstr);
	}

	@Test
	public void testcase9() throws InterruptedException {

		driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/span[1]/img[1]"))
				.click();
		driver.findElement(By.xpath(
				"//header/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/a[1]/div[1]/div[1]/span[1]"))
				.click();
		Thread.sleep(10000);
		List<String> actstr = new ArrayList<String>();
		actstr.add(driver.getTitle());
		actstr.add(driver.getCurrentUrl());
		List<String> expstr = new ArrayList<String>();
		expstr.add("Sauce Insights");
		expstr.add("https://saucelabs.com/products/sauce-insights");
		Assert.assertEquals(actstr, expstr);

	}

	@AfterTest
	public void exit() {
		driver.close();
	}

	@BeforeTest
	public void start() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver109.exe");
		driver = new ChromeDriver();
		driver.get("https://saucelabs.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
}