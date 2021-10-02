package Selenium_8A_SyncWait_ImplicitWait_ExplicitWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWaitConcept {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

//		it will be applied for all the Webelements.	
//		global wait
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);	// dynamic wait
		
		System.out.println(driver.getTitle());
		
//		Thread.sleep(2000);		// static wait 
		
		WebElement email = driver.findElement(By.id("login1"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.name("proceed"));
		
		email.sendKeys("test@rediffmail.comm");
		password.sendKeys("test456");
		loginButton.click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);	// dynamic wait
//		w1 --- w2 ---> 10 seconds
		
		
	}

}
