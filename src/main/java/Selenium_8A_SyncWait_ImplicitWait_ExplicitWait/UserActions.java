package Selenium_8A_SyncWait_ImplicitWait_ExplicitWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UserActions {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		System.out.println(driver.getTitle());
		
//		WebElement email = driver.findElement(By.id("login1"));
//		WebElement password = driver.findElement(By.id("password"));
//		WebElement loginButton = driver.findElement(By.name("proceed"));
//		
//		Actions action = new Actions(driver);
//		
//		action.sendKeys(email, "test@rediffmail.com").perform();
//		action.sendKeys(password, "test456").perform();
//		action.click(loginButton).perform();
		
		ElementUtil elementUtil = new ElementUtil(driver);		// Utility Method.
		elementUtil.doActionSendKeys(By.id("login1"), "test@rediffmail.com");
		elementUtil.doActionSendKeys(By.id("password"), "test456");
		elementUtil.doActionClick(By.name("proceed"));
		
	}

}
