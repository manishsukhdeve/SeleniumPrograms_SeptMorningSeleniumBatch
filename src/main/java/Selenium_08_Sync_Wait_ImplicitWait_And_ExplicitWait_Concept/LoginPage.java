package Selenium_08_Sync_Wait_ImplicitWait_And_ExplicitWait_Concept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://mahasbtc.org/sbtc/login/login.php?url=/login/index.php");
		System.out.println(driver.getCurrentUrl());
		
//		Thread.sleep(2000);
		
		// Page Object -
		By email = By.id("usernamefield");
		By password = By.id("passwordfield");
		By LogIn = By.id("SubmitButton");
		
		Util util = new Util(driver);	// Object
		
//		System.out.println(driver.getTitle());
		
//		String title = util.waitForTitlePreesent("mahasbtc.org", 10);
//		System.out.println(title);
		
		util.waitForElementPreesent(email, 20);		// Explicit wait
		util.doSendKeys(email, "selenium@gmail.com");
		
		util.doSendKeys(password, "test1234");
		
		util.waitForElementPreesent(LogIn, 5); 		// Explicit wait
		util.doClick(LogIn);
		
	}

}
