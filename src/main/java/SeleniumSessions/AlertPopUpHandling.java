package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopUpHandling {

	public static void main(String[] args) throws InterruptedException {
		
		// Alert means javascript popup. 
		// Alert class is responsible for javascript popup. 
		// Advertisement popup and windows popup that time we cannot use Alert method. 
		// Alert is not a webelement. (means we cannot inspect that popup.)

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		System.out.println(driver.getTitle());
		
		//Thread.sleep(2000);
		
		// By.name locator. 
		driver.findElement(By.name("proceed")).click();	//Clicking on GO button
		
		Thread.sleep(2000);
		
		Alert alert = driver.switchTo().alert();	// Alert is an interface. we cannot create object of the interface but we can create reference. 
		String text = alert.getText();
		System.out.println(text);
		
		// Validation 
		if(text.equals("Please enter a valid user name")) {
			System.out.println("Correct error message.....");
		}
		else {
			System.out.println("in-correct error message....");
		}
				
		alert.accept();		// click on OK button.
		
		//alert.dismiss();	// cancel the alert.
		
		System.out.println("------------------------------------------");
		
		}	
	}