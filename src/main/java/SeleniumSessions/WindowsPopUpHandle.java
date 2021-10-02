package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsPopUpHandle {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/popup.php");	// Parent Window
		System.out.println(driver.getTitle()); // Guru99 Bank Home Page
		
		driver.findElement(By.linkText("Click Here")).click();	// Child Window
		
		Set<String> handles = driver.getWindowHandles(); // Set cannot hold the duplicate values
		
		Iterator<String> it = handles.iterator();
		
		String parentWindowID = it.next();
		System.out.println("Parent Window ID : " + parentWindowID);
		
		String childWindowID = it.next();
		System.out.println("Child Window ID : " + childWindowID);
		
		driver.switchTo().window(childWindowID); //switch to child window
		System.out.println("Child Window title is : " + driver.getTitle());
		
		//Thread.sleep(2000);
		
		driver.close(); // To close the child window popup
		
		driver.switchTo().window(parentWindowID); // switch to parent window
		System.out.println("Parent Window title is : " + driver.getTitle());
		
		//Thread.sleep(2000);
		
		System.out.println("------------------------------------------------");
		
		//the-internet.herokuapp.com
		
		
	}

}
