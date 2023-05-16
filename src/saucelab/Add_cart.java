package saucelab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Add_cart {
	@Test
	public void product_add() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver109.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		WebElement uname = driver.findElement(By.id("user-name"));
		uname.sendKeys("standard_user");
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("secret_sauce");
		WebElement login = driver.findElement(By.id("login-button"));
		login.click();
		WebElement add = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		add.click();

		WebElement pro_name = driver.findElement(By.id("item_4_title_link"));
		String desc_pro_name = pro_name.getText();
		System.out.println(desc_pro_name);
		WebElement pro_price = driver.findElement(By.className("inventory_item_price"));
		String desc_pro_price = pro_price.getText();
		System.out.println(desc_pro_price);
		WebElement cart = driver.findElement(By.className("shopping_cart_link"));
		cart.click();
		WebElement add_name = driver.findElement(By.id("item_4_title_link"));
		String cart_pro_name = add_name.getText();
		System.out.println(cart_pro_name);
		WebElement cart_price = driver.findElement(By.className("inventory_item_price"));
		String add_cart_price = cart_price.getText();
		System.out.println(add_cart_price);
		Assert.assertEquals(desc_pro_name, cart_pro_name);
		Assert.assertEquals(desc_pro_price, add_cart_price);
		driver.close();

	}
}
