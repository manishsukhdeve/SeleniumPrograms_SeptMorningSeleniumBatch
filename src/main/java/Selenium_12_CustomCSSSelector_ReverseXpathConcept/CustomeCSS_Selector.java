package Selenium_12_CustomCSSSelector_ReverseXpathConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomeCSS_Selector {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app-eu1.hubspot.com/contacts/24970340/objects/0-1/views/all/list");
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("username")).sendKeys("mamta.sukhdeve123@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Test@123456789");
		driver.findElement(By.id("loginBtn")).click();
		
//		-----------------------------------------------------------------------------------------
		
//		id: concept - #{id}
		
//		#username
//		driver.findElement(By.cssSelector("#username")).sendKeys("mamta.sukhdeve123@gmail.com");
		
//		input[id='username']
//		driver.findElement(By.cssSelector("input#username")).sendKeys("Test");
		
//		input[id='username'][type='email']
//		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("Test");
		
//		button#loginBtn
//		driver.findElement(By.id("username")).sendKeys("mamta.sukhdeve123@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("test456456");
//		driver.findElement(By.cssSelector("button#loginBtn")).click();
		
//		-----------------------------------------------------------------------------------------
		
//		class: concept - .{classname}
		
//		.form-control.private-form__control.login-email
//		driver.findElement(By.cssSelector(".form-control.private-form__control.login-email")).sendKeys("Test");
		
//		input.form-control.private-form__control.login-email
//		driver.findElement(By.cssSelector("input.form-control.private-form__control.login-email")).sendKeys("Test");
		
//		input.login-email
//		driver.findElement(By.cssSelector("input.login-email")).sendKeys("Test");
		
//		button.login-submit
//		driver.findElement(By.id("username")).sendKeys("mamta.sukhdeve123@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("test456456");
//		driver.findElement(By.cssSelector("button.login-submit")).click();

//		-----------------------------------------------------------------------------------------
		
//		text:
//		input[id^='user'] -- starting text
//		driver.findElement(By.cssSelector("input[id^='user']")).sendKeys("Test");
		
//		input[id$='name'] -- ending text
//		driver.findElement(By.cssSelector("input[id$='name']")).sendKeys("Test");
		
//		-----------------------------------------------------------------------------------------

//		contains: 
			
//		input[id*='username']
//		driver.findElement(By.cssSelector("input[id*='username']")).sendKeys("Test");		
	
//		-----------------------------------------------------------------------------------------

//		parent and child relationship:
		
//		div>input[id='username']
//		driver.findElement(By.cssSelector("div>input[id='username']")).sendKeys("test");
		
//		div.private-form__input-wrapper>input[id='username']
//		driver.findElement(By.cssSelector("div.private-form__input-wrapper>input[id='username']")).sendKeys("test");
//				
//		div.private-form__input-wrapper>input#username
//		driver.findElement(By.cssSelector("div.private-form__input-wrapper>input#username")).sendKeys("test");
		
//		-----------------------------------------------------------------------------------------
		
//		Reversing Xpath: traversing from child to parent -> grand parent -> super parent -> top parent in DOM
		
//		//input[@id='username']/../../../../../../../../../..		(absolute xpath example)
//		or 
//		//input[@id='username']/./..//..//..//..//..//..//..//..//..//..
//		
//		//input[@id='username']/../../../../..
//		String text = driver.findElement(By.xpath("//input[@id='username']/../../../../..")).getAttribute("id");
//		System.out.println(text);
		
		// absolute xpath : (system xpath)
		// relative xpath / custom xpath : //span[@id='test']
		
			
//		-----------------------------------------------------------------------------------------

		
		
	}

}
