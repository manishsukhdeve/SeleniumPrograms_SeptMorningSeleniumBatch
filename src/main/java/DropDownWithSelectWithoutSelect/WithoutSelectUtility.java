package DropDownWithSelectWithoutSelect;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WithoutSelectUtility {
	
	/**
	 * This method is used to select the values from drop down without select class.
	 * @param driver
	 * @param locator
	 * @param value
	 */
	public static void DropDownWithoutSelectClass(WebDriver driver, String locator, String value) {
		
		List<WebElement> droplist = driver.findElements(By.xpath(locator));
		System.out.println(droplist.size());
		
		for (int i=0; i<droplist.size(); i++) {
			String text = droplist.get(i).getText();
			System.out.println(text);
			if(text.equals(value)) {
				droplist.get(i).click();
				break;
			}
		}
	}

}
