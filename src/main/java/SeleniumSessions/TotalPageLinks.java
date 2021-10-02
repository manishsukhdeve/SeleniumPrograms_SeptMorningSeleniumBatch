package SeleniumSessions;

import java.util.List; 


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalPageLinks {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://amazon.in/");
		//driver.get("https://www.flipkart.com/");
		
		System.out.println(driver.getTitle());
		
		List<WebElement> linkslist = driver.findElements(By.tagName("a"));
		
		System.out.println("Total Number of Links : "+ linkslist.size());
		
		for(int i = 0; i<linkslist.size(); i++) {
			String text = linkslist.get(i).getText();
			System.out.println(text);
		}
			
		System.out.println("*********************************************************");

	}

}

