 package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationConcept {

	public static void main(String[] args) {

// https://www.orangehrm.com/orangehrm-30-day-trial/		more elements are available in this site
// https://demo.opencart.com/index.php?route=account/login	for testing
// https://www.orangehrm.com/orangehrm-30-day-trial/		for testing
		
// Question - What is the difference between driver.get and driver.navigate method?		
		
// Back forward button simulation in the browser through simulation.
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().to("https://www.amazon.in/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().back();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().back();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().refresh();
		
		driver.close();
		
		System.out.println("--------------------------------------------------------");
		
	}

}
