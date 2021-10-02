package Selenium_8B_CustomExplicitWaits_Utils_Why_We_should_not_mix_ImpWait_And_ExpWait;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
	
//------------------------------------------------------------------------------------------------
	
	// Wait custom methods: wait utils:
	
	public void visibilityOfAllElement( List<WebElement> element, int timeout ) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.visibilityOfAllElements(element));
	}
	
	
	public WebElement waitForElementToBePresent(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		return getElement(locator);
	}
	
	
	public WebElement waitForElementToBeClickable(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.elementToBeClickable(locator));
		return getElement(locator);
	}
	
	
	public WebElement waitForElementToBeVisible(By locator, int timeout) {
		WebElement element = getElement(locator);
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.visibilityOf(element));
		return element;
	}
	
	
	public WebElement waitForElementVisibilityLocated(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		return getElement(locator);
	}
	
	
	public String waitForUrl(String url, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.urlContains(url));
		return driver.getCurrentUrl();
	}
	
	
	public boolean waiAlertToBepresent(String url, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.alertIsPresent());
		return true;
	}
	
	
	public void clickWhenReady(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.elementToBeClickable(locator));
		getElement(locator).click();
	}
	
	
	public String waitForTitleToBePresent(String title, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.titleContains(title));
		return driver.getTitle();
	}

}
