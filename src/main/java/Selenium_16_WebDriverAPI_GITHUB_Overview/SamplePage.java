package Selenium_16_WebDriverAPI_GITHUB_Overview;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SamplePage {

	public static void main(String[] args) {

//		WebDriver driver = new ChromeDriver();		// Top Casting
//		or
//		ChromeDriver driver1 = new ChromeDriver();
//		
//		FirefoxDriver driver2 = new FirefoxDriver();
		
		WebDriver driver;
		String browser = "Chrome";
		
		if (browser.equals("Chrome")) {
			driver = new ChromeDriver();
		}
		else if (browser.equals("Firefox")) {
			driver = new FirefoxDriver();
		}
		
		RemoteWebDriver dr = new ChromeDriver();	// Top Casting
//		WebDriver dr = new RemoteWebDriver(new URL("https:// 192.12.3:4444/wd/hub"), capabilities);
	
//		---------------------------------------------------------------------------
	
		
		
		
		
	}

}
