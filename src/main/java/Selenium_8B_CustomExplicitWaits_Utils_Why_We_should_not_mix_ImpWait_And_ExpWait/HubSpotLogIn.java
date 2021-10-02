package Selenium_8B_CustomExplicitWaits_Utils_Why_We_should_not_mix_ImpWait_And_ExpWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HubSpotLogIn {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		ElementUtil elementutil = new ElementUtil(driver);
		
		By email = By.id("login1");
		By password = By.id("password");
		By login = By.name("proceed");
		By forgotpassword = By.linkText("Forgot Password?");
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
//		elementutil.clickWhenReady(forgotpassword, 6);
		
		
		String title = elementutil.waitForTitleToBePresent("Rediffmail", 6);
		System.out.println(title);
		
		elementutil.waitForElementToBePresent(email, 15).sendKeys("Test789@rediffmail.com");
		elementutil.doSendKeys(password, "Test789");
		
//		elementutil.doClick(login);
		elementutil.waitForElementToBePresent(login, 5).click();
		
		
	}

}
