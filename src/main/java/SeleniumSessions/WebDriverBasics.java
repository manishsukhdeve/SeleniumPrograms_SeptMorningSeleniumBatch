package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {	// WebDriver is an interface hence we cannot create object for WebDriver. 

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver (); // 1. Open the Browser	
		driver.get("https://www.google.com"); 	// 2. Enter URL
		
		String title = driver.getTitle(); 	// 3. Get the page title.
		System.out.println(title);			// Google
		
		//Validation point
		if (title.equals("Google")) {
			System.out.println("Title is correct");		
		}
		else {
			System.out.println("Incorrect titel");
		}
		
		System.out.println(driver.getCurrentUrl());		// https://www.google.com/
		//System.out.println(driver.getPageSource());
		
		//driver.quit();// close the browser	Interview Question 
		driver.close();	// close the browser
		
		//System.out.println(driver.getTitle()); //Session ID is null. Using WebDriver after calling quit()?
	
	}

}

// WebDriver driver = new ChromeDriver();
// we can do top casting here. 
// because parent is WebDriver and child class is ChromeDriver here.
// ChromeDriver is a class which is implementing WebDriver interface and child class object can be referred by parent interface reference variable. 

 	