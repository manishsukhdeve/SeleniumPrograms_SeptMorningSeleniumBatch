package DropDownWithSelectWithoutSelect;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandleWithIndex {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/r.php");
		
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
//		Select select = new Select(day);
//		select.selectByIndex(15);
//		
//		Select select1 = new Select(month);
//		select1.selectByIndex(5);
//		
//		Select select2 = new Select(year);
//		select2.selectByIndex(10);
	
		SelectValueFromDropDownByIndex(day, 10);
		SelectValueFromDropDownByIndex(month, 10);
		SelectValueFromDropDownByIndex(year, 10);
		
	} 
	
	/**
	 * 2. This method is used to select the value from a drop down on the basis of given index.
	 * @param element
	 * @param value
	 */
	public static void SelectValueFromDropDownByIndex(WebElement element, int index) {
		Select select = new Select (element);
		select.selectByIndex(index);
		
	}

}
