package Selenium_07_Actions_SendKeys_Click_ScreenShotUtil_ElementUtils_GenericMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://mahasbtc.org/sbtc/login/login.php?url=/login/index.php");
		System.out.println(driver.getCurrentUrl());
		
		// Page Object -
		By email = By.id("usernamefield");
		By password = By.id("passwordfield");
		By LogIn = By.id("SubmitButton");
		
		Util util = new Util(driver);	// Object
		
//		util.getElement(email).sendKeys("Test@gmail.com");
//		util.getElement(password).sendKeys("Test123");
//		util.getElement(LogIn).click();
		
		util.doSendKeys(email, "selenium@gmail.com");
		util.doSendKeys(password, "test1234");
		util.doClick(LogIn);
		
	}

}
