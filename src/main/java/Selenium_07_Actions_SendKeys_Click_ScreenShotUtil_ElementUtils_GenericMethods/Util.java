package Selenium_07_Actions_SendKeys_Click_ScreenShotUtil_ElementUtils_GenericMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Util {
	
	WebDriver driver;
		
	/**
	 * 1. This method is used to create WebDriver.
	 * @param driver
	 */
	public Util(WebDriver driver) {
		this.driver = driver;
	}
	
	
	/**
	 * 2. This method is used to create the webElement on the basis of By locator.
	 * @param locator
	 * @return
	 */
	public WebElement getElement(By locator) {
		WebElement element = null;
		try {
			element = driver.findElement(locator);
		}
		catch (Exception e) {
			System.out.println("Some exception occured while creating the webElement....");
			System.out.println(e.getMessage());
		}
		return element;
	}
	
	
	/**
	 * 3. This method is used to click on element. 
	 * @param locator
	 */
	public void doClick(By locator) {
		try {
			getElement(locator).click();
		}
		catch (Exception e) {
			System.out.println("Some exception occured while clicking the webElement....");
			System.out.println(e.getMessage());
		}
	}

	
	/**
	 * 4. This method is used to pass value in the WebElement 
	 * @param locator
	 * @param value
	 */
	public void doSendKeys(By locator, String value) {
		try {
			getElement(locator).sendKeys(value);
		}
		catch (Exception e) {
			System.out.println("Some exception occured while passing value to the webElement....");
			System.out.println(e.getMessage());
		}
		
	}
}
