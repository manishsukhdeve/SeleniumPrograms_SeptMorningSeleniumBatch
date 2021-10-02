package Selenium_06_FrameHandle_AuthPopUpHandle_ActionsClassConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalFrames {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		System.out.println(driver.getTitle());
		
		List<WebElement> totalframes = driver.findElements(By.tagName("frame"));
		System.out.println("Total number of frames : " + totalframes.size());
		
		for (int i=0; i<totalframes.size(); i++) {
			String frames = totalframes.get(i).getAttribute("src");
			System.out.println("Frames : " + frames);
		}
			
	}

}
