package saucelab;

import java.util.concurrent.TimeUnit;  //there is a bug in this test

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Page_Validation {
	@Test
	public void page_automate() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver109.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://saucelabs.com/request-demo");
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("sourav");
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("kumar");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("souravbal823@gmail.com");
		driver.findElement(By.xpath("//input[@id='Company']")).sendKeys("soft deal");
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='Country']"));
		Select sel = new Select(dropdown);
		sel.selectByValue("India");
		driver.findElement(By.xpath("//input[@id='Phone']")).sendKeys("9938052081");
		driver.findElement(By.xpath("//label[@id='LblmktoCheckbox_34912_7']")).click();
		driver.findElement(By.xpath("//textarea[@id='How_did_you_hear_about_Sauce_Labs__c']"))
				.sendKeys("From Internet");
		driver.findElement(By.xpath("//label[@id='LblmktoCheckbox_34909_0']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
       
		String act_title=driver.getTitle();
		String exp_title="Thank you";
		Assert.assertEquals(exp_title, act_title);
		
		String act_url=driver.getCurrentUrl();
		String exp_url="https://saucelabs.com/thank-you";
		Assert.assertEquals(exp_url, act_url);
		
		Alert alr = driver.switchTo().alert();
		String actsr = alr.getText();
		alr.accept();
		String exp_str="Hi! Welcome to Sauce Labs. Let's get you where you need to go!";
		Assert.assertEquals(actsr,exp_str);
		driver.close();
	}
}
