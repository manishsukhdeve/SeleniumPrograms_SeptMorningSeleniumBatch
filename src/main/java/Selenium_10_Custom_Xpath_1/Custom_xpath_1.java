package Selenium_10_Custom_Xpath_1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Custom_xpath_1 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
//		Creating the xpath with one property.
		//htmltag[@prop1='value']
		//input[@id='input-email']
		
		//*[@id='input-email']
		
		//div//input[@id='input-email']
		
		//div//input -- indirect child = 6
		//div/input  -- direct child = 3
		
		
//		Creating the xpath with two property.
		//htmltag[@prop1='value' and @prop2='value']
		//input[@id='input-email' and @type='text']
		
//		Creating the xpath with three property.
		//input[@class='form-control' and @type='text' and @name='email']
		
//		-------------------------
		
		//input[@class='form-control']
		
//		-------------------------
		
//		contains() in xpath:
			
		//htmltag[contains(@prop,'value')]

		//input[contains(@class,'input-lg')]
		//input[contains(@id,'input-email')]
		//input[@id='input-email' and contains(@name,'email')]
		//input[@id='input-email' and contains(@name,'')]
		
//		-------------------------
		
//		contains used for dynamic ids:
		
//		<input id='test_123'>
//		<input id='test_223'>
//		<input id='test_133'>
//		<input id='test_143'>
		
		//input[contains(@id, 'test_')]
		
//		-------------------------
		
//		(//input[contains(@class,'form-control')])[2]
//		(//input[contains(@class,'form-control')])[position()=2]
		
//		(//input[contains(@class,'form-control')])[3]
//		(//input[contains(@class,'form-control')])[position()=3]
		
//		(//input[contains(@class, 'form-control')])[last()]
		
//		-------------------------
//		(//a)[52]
				
//		test() in xpath				(without contains)
		//htmltag[text()='value']
		
		//label[text()='E-Mail Address']
		
		//div[text()=' Warning: No match for E-Mail Address and/or Password.']
		
		//label[text()='Password']
		
//		-------------------------
		
//		text() with contains
		
		//label[contains(text(),'Password')]
		
		//h2[contains(text(),'New Customer')]	
		//h2[contains(text(),'Customer')]
		//h2[contains(text(),'New ')]
		
		//h1[@class='private-page__title']
		
		//a[text()='Your Store']
		//a[contains(text(),'Store')]
		
//		-------------------------
//		https://demo.opencart.com/index.php?route=account/login
//			
//		test.selenium@gmail.com
//		Test#12345
		
//		-------------------------
		
		//span[text()='Currency']
		//span[starts-with(@class,'hidden-xs hidden-sm hidden-md')] 
//		(//span[starts-with(@class,'hidden-xs hidden-sm hidden-md')])[1]
		//span[starts-with(text(),'Currency')]
 
		//a[starts-with(text(),'Your Store')]
		
		
	}

}
