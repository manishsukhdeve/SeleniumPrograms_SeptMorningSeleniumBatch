package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandle {

	public static void main(String[] args) {
		
	// ListBox and Drop down both are same thing. 	

	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://en-gb.facebook.com/r.php");
	
	WebElement day = driver.findElement(By.id("day"));
	WebElement month = driver.findElement(By.id("month"));
	WebElement year = driver.findElement(By.id("year"));
	
	
//	Select select = new Select(day);	// Select class already available in selenium. no default constructor available in the select class. you need to pass the element. 
//	select.selectByVisibleText("5");	// selectByVisibleText
//	select.selectByIndex(10);			// selectByIndex

//	Select select1 = new Select(month);
//	select1.selectByVisibleText("Apr");	// selectByVisibleText
//	select1.selectByIndex(4);			// selectByIndex
	
//	Select select2 = new Select(year);
//	select2.selectByVisibleText("1980");// selectByVisibleText	
//	select2.selectByIndex(25);			// selectByIndex
	
//-----------------------------------------------------------------------------------------
	
//	SelectValueFromDropDownByText(day,"5");
//	SelectValueFromDropDownByText(month, "Apr");
//	SelectValueFromDropDownByText(year, "1965");
	
	
	SelectValueFromDropDownByIndex(day, 10);
	SelectValueFromDropDownByIndex(month, 5);
	SelectValueFromDropDownByIndex(year, 10);
	
	}
	
	
	/**
	 * 1. This method is used to select the value from a drop down on the basis of given text.
	 * @param element
	 * @param value
	 */
	public static void SelectValueFromDropDownByText(WebElement element, String value)
	{
		Select select = new Select(element);
		select.selectByVisibleText(value);
	}
	
	
//-----------------------------------------------------------------------------------------	
	
	/**
	 * 2. This method is used to select the value from a drop down on the basis of given index.
	 * @param element
	 * @param number
	 */
	public static void SelectValueFromDropDownByIndex(WebElement element, int number)
	{
		Select select1 = new Select(element);
		select1.selectByIndex(number);
	}

}
