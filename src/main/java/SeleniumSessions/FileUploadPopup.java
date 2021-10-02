package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadPopup {
	
	// File upload popup is operating system popup. 

	public static void main(String[] args) throws InterruptedException {

	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
	//driver.get("http://demo.guru99.com/test/upload/");
	
	System.out.println(driver.getTitle()); 
	
	driver.findElement(By.name("upfile")).sendKeys("D:\\test.jpg");
	
	Thread.sleep(2000);
	
	driver.close();
	
	System.out.println("--------------------------------------------");
	
	
	
	
		
		
	}

}
