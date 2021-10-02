package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAndNavigate {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");	// once the page fully loaded then only print title of the page. 
		
		//driver.navigate().to("https://www.amazon.in/");	// navigate not wait page is loaded or not. title of page instently print in the console when we use navigation method.
		
		System.out.println(driver.getTitle());
		
		System.out.println("-------------------------------------------------------------------");
		
		driver.quit();
		
		
		
	}

}
