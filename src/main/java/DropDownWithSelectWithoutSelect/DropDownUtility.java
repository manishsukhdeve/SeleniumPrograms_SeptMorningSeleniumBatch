package DropDownWithSelectWithoutSelect;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

// if you want to see total methods in the class = press Control + o.

public class DropDownUtility {
	
	/**
	 * 1. This method is used to select the value from a drop down on the basis of given text.
	 * @param element
	 * @param value
	 */
	public static void selectValueFromDropDown(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByVisibleText(value);
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
	
	
	/**
	 * 3. This method is used to get all the values from the drop down.
	 * @param element
	 */
	public static ArrayList<String> getDropDownValues1 (WebElement element) {
		System.out.println("-----------------------------");
		Select select = new Select(element);
		List<WebElement> droplist = select.getOptions();
		System.out.println("Total number of values in droplist " + droplist.size());
		ArrayList<String> ar = new ArrayList<String>();
		for (int i= 0; i<droplist.size(); i++) {
			String list = droplist.get(i).getText();
//			System.out.println(list);
			ar.add(list);
		}
		return ar;
	}
	

}
