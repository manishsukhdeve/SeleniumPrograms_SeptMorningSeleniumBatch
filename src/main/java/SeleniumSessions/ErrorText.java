package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErrorText {

	public static void main(String[] args) {
		
		/**
		 * Error Message Testing
		 */

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://account.box.com/login");
		
		driver.findElement(By.id("login-email")).sendKeys("Test");
		driver.findElement(By.id("login-submit")).click();
		driver.findElement(By.id("password-login")).sendKeys("Test");
		driver.findElement(By.id("login-submit-password")).click();
		
		String errortext = driver.findElement(By.className("form-error")).getText();
		System.out.println(errortext);
		
		System.out.println("-------------------------------");
		
		
	}

}
