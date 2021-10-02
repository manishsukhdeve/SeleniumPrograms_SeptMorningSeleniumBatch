package DropDownWithSelectWithoutSelect;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandle {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/r.php");
		
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
//		Select select  = new Select(day);
//		select.selectByVisibleText("13");
//		
//		Select select1 = new Select(month);
//		select1.selectByVisibleText("Apr");
//		
//		Select select2 = new Select(year);
//		select2.selectByVisibleText("1986");
		
//		System.out.println("DOB selected as 13 Apr 1986");
		
		selectValueFromDropDown(day, "10");
		selectValueFromDropDown(month, "Apr");
		selectValueFromDropDown(year, "1980");
		
	}
	
	/**
	 * 1. This method is used to select the value from a drop down on the basis of given text.
	 * @param element
	 * @param value
	 */
	public static void selectValueFromDropDown(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByVisibleText(value);

	}

}
