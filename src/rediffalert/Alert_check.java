package rediffalert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Alert_check {
	@Test
	public void checkbox_validation() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver109.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(
				By.xpath("//body/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[2]/div[2]/div[1]/input[2]"))
				.click();
		Alert alr = driver.switchTo().alert();
		String actsr = alr.getText();
		alr.accept();
		String expstr = "Please enter a valid user name";
		Assert.assertEquals(actsr, expstr);
		driver.close();
	}
}
