package Selenium_06_FrameHandle_AuthPopUpHandle_ActionsClassConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoverToElement {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://mrbool.com/how-to-create-menu-with-submenu-using-css-html/26146");
		System.out.println(driver.getTitle());
		
		Actions action = new Actions(driver);	// Actions class is available in Selenium, not in java. 
//		In Select class we are passing WebElement.
//		In Actions class we are passing driver. Action class handles user actions. like double click, mouse over etc. 
		
		WebElement contentlink = driver.findElement(By.className("menulink"));
		
		action.moveToElement(contentlink).build().perform();
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("COURSES")).click();
		
			
		
	}
	

}
