package Selenium_15_HashMapVsHashtable_How_To_Use_HashMap_In_Selenium;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UserLogin {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://manishtesting2018.wixsite.com/manishresume/contact");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
//		Map<String, String> userMap = new HashMap <String, String>();
//		userMap.put("admin", "admin_admin");
//		userMap.put("patient", "tom@gmail.com_test123");
//		userMap.put("doctor", "peter@gmail.com_test12345");
		
//		driver.findElement(By.id("input_comp-k5m6p3d8")).sendKeys(userMap.get("doctor").split("_")[0]);
//		driver.findElement(By.id("input_comp-k5m6p3dl")).sendKeys(userMap.get("doctor").split("_")[1]);
		
		
		doLogin (driver, getUserMap(), "doctor");
		
	}
	
	public static Map<String, String> getUserMap() {
		Map<String, String> userMap = new HashMap <String, String>();
		userMap.put("admin", "admin_admin");
		userMap.put("patient", "tom@gmail.com_test123");
		userMap.put("doctor", "peter@gmail.com_test12345");
		return userMap;
	}
	
	public static void doLogin (WebDriver driver, Map<String, String> userMap, String userKey) {
		driver.findElement(By.id("input_comp-k5m6p3d8")).sendKeys(userMap.get(userKey).split("_")[0]);
		driver.findElement(By.id("input_comp-k5m6p3dl")).sendKeys(userMap.get(userKey).split("_")[1]);
			
	}

}
