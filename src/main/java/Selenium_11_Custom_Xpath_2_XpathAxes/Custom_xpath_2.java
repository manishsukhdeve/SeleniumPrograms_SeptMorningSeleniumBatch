package Selenium_11_Custom_Xpath_2_XpathAxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Custom_xpath_2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
//		driver.get("https://app.hubspot.com/login");
		driver.get("https://app-eu1.hubspot.com/contacts/24970340/objects/0-1/views/all/list");
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("username")).sendKeys("mamta.sukhdeve123@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Test@123456789");
		driver.findElement(By.id("loginBtn")).click();
		
//		Xpath Axes: (Interview Question)
		
//		under div another div.
		//div[@class='private-form__input-wrapper']//following::div
		
		
//		username field xpath-
		//div[@class='input-group']/input[@name='username']
		
		//div[@class='input-group']//following ::input[@name='username']
//		(//div[@class='input-group']//following ::input)[1]
		
		
//		going back to div
		//input[@name='username']//preceding::div
		
		
//		child to parent 
		//input[@name='username']//parent::div
		
		//div[@class='input-group']//child::input[@name='username']
		
//		highest parent of the div
		//div[@class='input-group']//ancestor::div[@class='container']
		
//		mamta.sukhdeve123@gmail.com	Test@123456789
		
		//span[text()='Mamta Suk']//ancestor::td//preceding-sibling::td//input
		//span[text()='Mamta Suk']//ancestor::td//preceding-sibling::td//child::input
		//span[text()='Mamta Suk']//ancestor::td//preceding-sibling::td//span[@class='UICheckbox__PrivateCheckboxIndicator-kavxn3-1 cTdJJX private-checkbox__indicator']
		
//		crmpro - mamta.sukhdeve123@gmail.com	Test@123456789	MamtaSuk
		//a[contains(text(),'Manish Suk')]//parent::td//preceding-sibling::td/input[@name='contact_id' and @type='checkbox']
		//a[contains(text(),'Manish Suk')]//parent::td//following-sibling::td/a[@context='company']
		
		//a[contains(text(),'Rohit Sharma')]//parent::td//following-sibling::td[@class='font-weight-bold']
		
		
		
		
		Thread.sleep(50000);
		
		driver.navigate().to("https://app-eu1.hubspot.com/contacts/24970340/objects/0-1/views/all/list");
		
//		driver.findElement(By.xpath("//span[text()='Mamta Suk']//ancestor::td//preceding-sibling::td//span[@class='UICheckbox__PrivateCheckboxIndicator-kavxn3-1 cTdJJX private-checkbox__indicator']")).click();
		
		selectContact(driver, "Mamta Suk");
	
		
	}
	
	public static void selectContact(WebDriver driver, String contactName) {
		driver.findElement(By.xpath("//span[text()='"+contactName+"']//ancestor::td//preceding-sibling::td//span[@class='UICheckbox__PrivateCheckboxIndicator-kavxn3-1 cTdJJX private-checkbox__indicator']")).click();
		
	}

}
