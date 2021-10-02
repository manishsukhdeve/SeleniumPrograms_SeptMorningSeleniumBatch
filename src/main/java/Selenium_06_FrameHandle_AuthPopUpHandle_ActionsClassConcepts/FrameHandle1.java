package Selenium_06_FrameHandle_AuthPopUpHandle_ActionsClassConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandle1 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		
//		There are 3 ways to handle frames;
		
//		WebElement frameElement = driver.findElement(By.name("main"));
//		driver.switchTo().frame(frameElement);	// 1. Select a frame using its previously located WebElement.
//		String text = driver.findElement(By.cssSelector("body > h2")).getText();
//		System.out.println(text);
		
		driver.switchTo().frame("main"); // 2. Select a frame by its name or ID. Frames located by matching name attributes are always givenprecedence over those matched by ID.
		String text = driver.findElement(By.cssSelector("body > h2")).getText();
		System.out.println(text);	
		
//		driver.switchTo().frame(2);	// 3. Select a frame by its (zero-based) index
//		String text = driver.findElement(By.cssSelector("body > h2")).getText();
//		System.out.println(text);
		
		
//		driver.switchTo().defaultContent();	// Driver come back to the main page from frame.
		
//		driver.switchTo().parentFrame();
		
	}

}
