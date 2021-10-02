package Selenium_08_Sync_Wait_ImplicitWait_And_ExplicitWait_Concept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HubSpotLoginPageImplicitWait {

	public static void main(String[] args) throws InterruptedException {
		
//		Thread.sleep(5000); 	// Static wait
//		Implicit Wait			// Dynamic wait
//		Explicit Wait			// Dynamic wait

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
//		driver.get("https://app.hubspot.com/login");
		
//		Thread.sleep(2000);		// Static Wait
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	// Implicit wait
		
		System.out.println(driver.getTitle());
		
		// Dynamic Wait
		// applied for all the elements only
		// global wait
		// dynamic wait
		
		WebElement email = driver.findElement(By.id("login1"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement Signin = driver.findElement(By.name("proceed"));
		
		email.sendKeys("test@rediffmail.com");
		password.sendKeys("test");
		Signin.click();
		
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);	
		// above statement is for changing in the implicit wait. 
		// 0 for canceling the implicit wait. 
		// Implicit wait only and only for WebElement. 
		
	}

}
