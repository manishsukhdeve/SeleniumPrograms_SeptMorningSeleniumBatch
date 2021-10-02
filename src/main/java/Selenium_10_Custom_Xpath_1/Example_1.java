package Selenium_10_Custom_Xpath_1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example_1 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement email = driver.findElement(By.xpath("//input[@id='input-email']"));
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		WebElement submit = driver.findElement(By.xpath("//input[@class='btn btn-primary']"));
		
		email.sendKeys("Testing Selenium");
		password.sendKeys("Test456");
		submit.click();
		
		String headerValue = driver.findElement(By.xpath("//a[text()='Your Store']")).getText();
		System.out.println(headerValue);
		
		System.out.println(driver.findElement(By.xpath("//a[contains(text(),'Store')]")).isDisplayed());
		
		
		
	}

}
