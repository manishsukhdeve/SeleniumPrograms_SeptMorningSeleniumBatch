package Selenium_13_JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptTest {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app-eu1.hubspot.com/contacts/24970340/objects/0-1/views/all/list");
//		driver.get("https://manishtesting2018.wixsite.com/manishresume");
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("username")).sendKeys("mamta.sukhdeve123@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Test@123456789");
//		driver.findElement(By.id("loginBtn")).click();
		
//		1. getTitleByJS
		String pageTitle = JavaScriptUtil.getTitleByJS(driver);
		System.out.println(pageTitle);
		
//		2. generateAlert
//		JavaScriptUtil.generateAlert(driver, "Selenium JavaScript utilities");
		
//		3. refreshBrowserByJS
//		JavaScriptUtil.refreshBrowserByJS(driver);
		
//		4. getBrowserInfo
//		System.out.println(JavaScriptUtil.getBrowserInfo(driver));
		
//		5. sendKeysUsingJSWithID
//		JavaScriptUtil.sendKeysUsingJSWithID(driver, "username", "mamta.sukhdeve123@gmail.com");
		
//		6. clickElementByJs
//		WebElement loginButton = driver.findElement(By.id("loginBtn"));
//		JavaScriptUtil.clickElementByJs(loginButton, driver);

//		7. drawBorder
		WebElement forgotPassword = driver.findElement(By.linkText("Forgot my password"));
		JavaScriptUtil.drawBorder(forgotPassword, driver);
		
		WebElement loginFrame = driver.findElement(By.id("hs-login"));
		JavaScriptUtil.drawBorder(loginFrame, driver);
		
//		8. flash
		JavaScriptUtil.flash(forgotPassword, driver);
		JavaScriptUtil.flash(loginFrame, driver);
		
//		9. getPageInnerText
		System.out.println(JavaScriptUtil.getPageInnerText(driver));
		
//		10. scrollPageDown
		JavaScriptUtil.scrollPageDown(driver);
		
//		11. scrollIntoView
		WebElement bottomText = driver.findElement(By.linkText("Privacy Policy"));
		JavaScriptUtil.scrollIntoView(bottomText, driver);
		JavaScriptUtil.flash(bottomText, driver);
		
		
//		driver.quit();
		

	}

}
