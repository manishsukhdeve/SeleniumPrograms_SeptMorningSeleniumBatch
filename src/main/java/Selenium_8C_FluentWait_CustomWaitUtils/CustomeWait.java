package Selenium_8C_FluentWait_CustomWaitUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomeWait {	
	
//	this is interview question - without implicit and explicit can we create custome wait ?

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		By username = By.id("login1");
		By password = By.id("password");
		By signin = By.name("proceed");
		
		getElementWithWait(driver, username, 6).sendKeys("Test");
		driver.findElement(password).sendKeys("Test");
		driver.findElement(signin).click();
		
		System.out.println("--");
	}
	
	
	public static WebElement getElementWithWait(WebDriver driver, By locator, int timeout) {
		WebElement element = null;
		for (int i=0; i<timeout; i++) {
			
			try {
				element  = driver.findElement(locator);
				break;
			}
			catch (Exception e) {
				System.out.println("Waiting for element --> " + i + "seconds");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e1) {
//					e1.printStackTrace();
				}
			}
		}
		return element;
	}
	
	
	public static boolean isElementDisplayed(WebDriver driver, By locator, int timeout) {
		WebElement element = null;
		boolean flag = false;
		for (int i=0; i<timeout; i++) {
			
			try {
				element  = driver.findElement(locator);
				flag = element.isDisplayed();
				break;
			}
			catch (Exception e) {
				System.out.println("Waiting for element --> " + i + "seconds");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e1) {
//					e1.printStackTrace();
				}
			}
		}
		return flag;
	}

}
