package Selenium_08_Sync_Wait_ImplicitWait_And_ExplicitWait_Concept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HubSpotLoginPageExplicitWait {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		WebDriverWait wait1 = new WebDriverWait(driver, 20);
		wait1.until(ExpectedConditions.titleContains("Rediffmail"));
		
		System.out.println(driver.getTitle());
		
		By email = By.id("login1");
		
		// Explicit Wait
		WebDriverWait wait = new WebDriverWait(driver, 20);	// WebDriverWait is a class	// Object
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(email));
		// Exception in thread "main" org.openqa.selenium.TimeoutException:
		// Expected condition failed: waiting for presence of element located by: By.id: username
		// (tried for 3 second(s) with 500 milliseconds interval)
			
		
		WebElement emailid = driver.findElement(email);
		emailid.sendKeys("456@rediffmail.com");
		
//		WebElement email = driver.findElement(By.id("login1"));
//		WebElement password = driver.findElement(By.id("password"));
//		WebElement Signin = driver.findElement(By.name("proceed"));
//		email.sendKeys("test@rediffmail.com");
//		password.sendKeys("test");
//		Signin.click();
		
	}

}
