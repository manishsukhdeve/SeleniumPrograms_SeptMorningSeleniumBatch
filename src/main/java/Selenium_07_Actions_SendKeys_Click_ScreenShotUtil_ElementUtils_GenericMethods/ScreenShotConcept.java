package Selenium_07_Actions_SendKeys_Click_ScreenShotUtil_ElementUtils_GenericMethods;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShotConcept {

	public static void main(String[] args) throws IOException {
		
		// Interview Question: How will you take screenshot for particular page. 

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://mahasbtc.org/sbtc/login/login.php?url=/login/index.php");
		System.out.println(driver.getCurrentUrl());
		
//		File SrcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(SrcFile, new File("./target/screenshot/page.png"));
		

		takePageScreenshot(driver, "loginpage");
		
		
		WebElement email = driver.findElement(By.id("usernamefield"));
		WebElement password = driver.findElement(By.id("passwordfield"));
		WebElement LogIn = driver.findElement(By.id("SubmitButton"));
		
		email.sendKeys("Testing@gmail.com");
		password.sendKeys("Password");
//		LogIn.click();
		
		takeElementScreenshot(email, "emailid");
		takeElementScreenshot(password, "password");
//		takeElementScreenshot(LogIn, "loginButton");
		
		driver.quit();
	
	}
	
	
	/**
	 * Generic method of Page Screenshot.  
	 * @param driver
	 * @param fileName
	 */
	public static void takePageScreenshot(WebDriver driver, String fileName) {
		File SrcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(SrcFile, new File("./target/screenshot/"+fileName+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	/**
	 * Generic method of Element Screenshot. 
	 * @param element
	 * @param fileName
	 */
	public static void takeElementScreenshot(WebElement element, String fileName) {
		File SrcFile = ((TakesScreenshot)element).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(SrcFile, new File("./target/screenshot/"+fileName+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
