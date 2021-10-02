package Selenium_07_Actions_SendKeys_Click_ScreenShotUtil_ElementUtils_GenericMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsEvent {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://mahasbtc.org/sbtc/login/login.php?url=/login/index.php");
		System.out.println(driver.getCurrentUrl());
		
		//Thread.sleep(5000);
		
		WebElement email = driver.findElement(By.id("usernamefield"));
		WebElement password = driver.findElement(By.id("passwordfield"));
		WebElement LogIn = driver.findElement(By.id("SubmitButton"));
		
		Actions action = new Actions(driver);
		
		action.sendKeys(email, "Testing").build().perform();
		action.sendKeys(password, "password").build().perform();
		action.click(LogIn).build().perform();
	}
}
