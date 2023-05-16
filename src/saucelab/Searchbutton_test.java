package saucelab;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Searchbutton_test {

	/*
	 * @Test public void searchResultValidation_Single() throws InterruptedException
	 * { System.setProperty("webdriver.chrome.driver",
	 * "./Driver/chromedriver109.exe"); WebDriver driver = new ChromeDriver();
	 * driver.get("https://saucelabs.com/"); driver.manage().window().maximize();
	 * driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	 * driver.findElement(By.xpath(
	 * "//header/div[1]/div[1]/div[2]/div[1]/button[1]/div[1]/span[1]/img[1]")).
	 * click();
	 * driver.findElement(By.xpath("//input[@id='search']")).sendKeys("test");
	 * Thread.sleep(5000); String str = driver .findElement(By.xpath(
	 * "/html/body/div[12]/div[3]/div/div/div/div[2]/div/ol/li[1]/a/div/div/h6/span"
	 * )) .getText(); System.out.println(str); String text = "Test"; boolean result
	 * = str.contains(text); System.out.println(result); Assert.assertEquals(true,
	 * result); driver.close(); }
	 */

	@Test
	public void searchResultValidation() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver109.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://saucelabs.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//header/div[1]/div[1]/div[2]/div[1]/button[1]/div[1]/span[1]/img[1]")).click();
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Automation");
		Thread.sleep(10000);
		WebElement ol=driver.findElement(By.xpath("//body/div[12]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/ol[1]"));
		List<WebElement> str=ol.findElements(By.tagName("li"));
		System.out.println(str.size());
		System.out.println(str);
		List<Boolean> act_str = new ArrayList<Boolean>();
		for (int i = 1; i <=str.size(); i++) {
			String xpath = "/html/body/div[12]/div[3]/div/div/div/div[2]/div/ol/li[" + i + "]/a/div/div/h6";
			String text = driver.findElement(By.xpath(xpath)).getText();
			boolean result = text.contains("Automation");
			act_str.add(result);

		}
		System.out.println(act_str);
		Assert.assertEquals(act_str.contains(false), false);
		driver.close();
	}
}
