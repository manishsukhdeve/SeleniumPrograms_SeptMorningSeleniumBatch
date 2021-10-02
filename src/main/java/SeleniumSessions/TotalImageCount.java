package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalImageCount {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://amazon.in");
		System.out.println(driver.getTitle());
		
		List<WebElement> imagelist = driver.findElements(By.tagName("img"));
		System.out.println("Total Image list count : "+ imagelist.size());
		
		for(int i=0; i<imagelist.size(); i++) {
			String imageurl = imagelist.get(i).getAttribute("src");
			System.out.println("Total number of images : "+ imageurl);
			
			System.out.println("-----------------------------------------");
			
		}
		
		
	}

}
