package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example1 {
	@Test
	public void browser(){
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver109.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.close();
		System.out.println("chrome browser open");
		
	}

}
