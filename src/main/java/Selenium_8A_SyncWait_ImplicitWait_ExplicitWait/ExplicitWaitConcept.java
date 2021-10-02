package Selenium_8A_SyncWait_ImplicitWait_ExplicitWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitConcept {

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
		
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("login1")));
		
		WebElement email = driver.findElement(By.id("login1"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.name("proceed"));
		
		email.sendKeys("test@rediffmail.comm");
		password.sendKeys("test456");
		loginButton.click();
		
		
		
		
		
		
	}

}
