package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerConcept {

	public static void main(String[] args) {
		
		// WebDriverManager checks your operating system. 
		// and in your system which browser you are looking for. 
		// chromedriver - chromedriver setup and install your system. 

		WebDriverManager.chromedriver().setup();	// webdriver manager API developed by bonigarcia. 
//		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");	// no need to write this line now 
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		System.out.println(driver.getTitle());
		
		driver.close();
		
		System.out.println("----------------------------------------------------------");
		
	}

}
