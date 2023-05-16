package saucelab;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Dropdown_navigate {
	@Test
	public void check_Dropdown() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver109.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		WebElement dropdown = driver.findElement(By.xpath(
				"//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[2]/div[1]/span[1]/select[1]"));
		Select sel = new Select(dropdown);
		List<WebElement> options = sel.getOptions();
		List<String> actualstr = new ArrayList<String>();

		for (WebElement element : options) {
			//System.out.println(element.getText());
			actualstr.add(element.getText());
		}

		List<String> expectstr = new ArrayList<String>();
		expectstr.add("Name (A to Z)");
		expectstr.add("Name (Z to A)");
		expectstr.add("Price (low to high)");
		expectstr.add("Price (high to low)");
		Assert.assertEquals(actualstr, expectstr);
		driver.close();
	}

}
