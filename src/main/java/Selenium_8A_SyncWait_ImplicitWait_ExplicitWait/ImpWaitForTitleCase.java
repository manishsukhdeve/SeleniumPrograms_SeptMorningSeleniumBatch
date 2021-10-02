package Selenium_8A_SyncWait_ImplicitWait_ExplicitWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImpWaitForTitleCase {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);	// dynamic wait
		
//		System.out.println(driver.getTitle());
//		implicit wait will not work for title.
//		implicit wait will work only for webelement.
//		title is browser property. 
		
		WebElement email = driver.findElement(By.id("login1"));
		email.sendKeys("test@rediffmail.com");
		System.out.println(driver.getTitle());
		
	}

}
