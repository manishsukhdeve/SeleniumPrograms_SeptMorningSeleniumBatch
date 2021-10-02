package Selenium_8C_FluentWait_CustomWaitUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitConcept1 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
//		Explicit Wait
//		WebDriverWait wait = new WebDriverWait(driver, 15);
//		wait.until(ExpectedConditions.titleIs("Rediffmail"));
//		wait.until(ExpectedConditions.titleContains("mail"));
//		
//		System.out.println(driver.getTitle());
		
		getElementWithExplicitlyWait(driver, 10, By.id("login1")).sendKeys("Test");
		
//		WebDriverWait wait = new WebDriverWait(driver, 15);
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("login1")));
		
//		WebElement email = driver.findElement(By.id("login1"));
//		email.sendKeys("test@rediffmail.comm");
//		
//		WebElement password = driver.findElement(By.id("password"));
//		password.sendKeys("test456");
//		
//		WebElement loginButton = driver.findElement(By.name("proceed"));
//		loginButton.click();
			
	}
	
	public static WebElement getElementWithExplicitlyWait(WebDriver driver, int timeout, By locator) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		return element;
	}

}
