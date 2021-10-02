package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://portal.cardknox.com/login"); //manish.sukhdeve@gmail.com / Test@123
		
		driver.get("https://www.eraktkosh.in/eRaktKosh/hissso/loginLogin");
		//driver.get("https://app.box.com/login");
		//driver.get("https://app.hubspot.com/");
		//driver.navigate().to("https://www.amazon.in/");
		//driver.navigate().to("https://www.eraktkosh.in/eRaktKosh/hissso/loginLogin");
		
		Thread.sleep(5000); // this method is used to pause your script for some time. 
		
		//1. id Concept --> I unique locator
		
//		WebElement email = driver.findElement(By.id("form-username"));
//		email.sendKeys("manish.testing@gmail.com");
//		
//		WebElement password = driver.findElement(By.id("form-username form-password"));
//		password.sendKeys("password123");
		
		//driver.findElement(By.id("form-username")).sendKeys("manish.sukhdeve@gmail.com");
		//driver.findElement(By.id("form-username form-password")).sendKeys("Password123");
		//driver.findElement(By.className("form-control btn btn-link-1")).click();
		
//		driver.findElement(By.id("login-email")).sendKeys("sumitraut01@gmail.com");
//		driver.findElement(By.id("login-submit")).click();
//		driver.findElement(By.id("password-login")).sendKeys("Box1086#1");
//		driver.findElement(By.id("login-submit-password")).click();
		
		//2.  name Concept --> II
		
		//driver.findElement(By.name("email")).sendKeys("manish.s@gmail.com");
		
		//3. xpath Concept --> III, dynamic ids		(Xpath is a locator but its not a attribute property.)
		
//		driver.findElement(By.xpath("//*[@id=\'form-username\']")).sendKeys("test.manish@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\'form-username form-password\']")).sendKeys("Test123");
		
		//4. css selector --> III
		
//		driver.findElement(By.cssSelector("#form-username")).sendKeys("manish.testing@gmail.com");
//		driver.findElement(By.cssSelector("#form-username\\ form-password")).sendKeys("Password123");
		
		//5. Class Name --> IV (is not unique always)
		
		driver.findElement(By.className("form-username")).sendKeys("Manish");
		driver.findElement(By.className("form-password")).sendKeys("Test");
		
		//6. Link Text --> only used for hyper links. 
		
		//driver.findElement(By.linkText("Forgot Password?")).click();
		
		//7. Partial link text -->
		
		driver.findElement(By.partialLinkText("Password?")).click();
		
		System.out.println("----------------------------------------------------");//syso + Control key  + Space bar
	
			
	}

}

//How many locators are there in selenium. 
//locating elements in Selenium WebDriver.

//Method				Syntax												Description

//By ID					driver.findElement(By.id (<element ID>))			Locates an element using the ID attribute
//By name				driver.findElement(By.name (<element name>))		Locates an element using the Name attribute
//By class name			driver.findElement(By.className (<element class>))	Locates an element using the Class attribute
//By tag name			driver.findElement(By.tagName (<htmltagname>))		Locates an element using the HTML tag
//By link text			driver.findElement(By.linkText (<linktext>))		Locates a link using link text
//By partial link text	driver.findElement(By.partialLinkText (<linktext>))	Locates a link using the link's partial text
//By CSS				driver.findElement(By.cssSelector (<css selector>))	Locates an element using the CSS selector
//By XPath				driver.findElement(By.xpath (<xpath>))				Locates an element using XPath query


