package Selenium_8A_SyncWait_ImplicitWait_ExplicitWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ElementUtil {
	
	WebDriver driver;
	
	public ElementUtil(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getElement(By locator) { 
		WebElement element = driver.findElement(locator);
		return element;
	}
	
	public void doSendKeys(By locator, String value) {	// normal sendkey method
		getElement (locator).sendKeys(value);
	}
	
	// Action method
	public void doActionSendKeys(By locator, String value) {	// action sendkey method
		Actions action = new Actions(driver);
		WebElement element = getElement (locator);
		action.sendKeys(element, value).perform();
	}
	
	public void doClick (By locator) {					// normal doclick method
		getElement(locator).click();
	}
	
	// Action method
	public void doActionClick (By locator) {			// action doclick method. 
		Actions action = new Actions(driver);
		WebElement element = getElement(locator);
		action.click(element).perform();
		
	}

}
