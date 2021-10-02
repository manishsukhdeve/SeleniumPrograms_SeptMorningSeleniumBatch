package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTextFieldValue {

	public static void main(String[] args) {
		
		// Get Text is used for links, buttons, error messages, if there is a text.

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		System.out.println("URL Title : "+ driver.getTitle());
		
		driver.findElement(By.id("login1")).sendKeys("TestingSelenium");
		
		String value = driver.findElement(By.id("login1")).getAttribute("value");
		System.out.println(value);
				
		System.out.println("-------------------------");
	}

}
