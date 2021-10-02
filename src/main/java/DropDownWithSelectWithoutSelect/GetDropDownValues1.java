package DropDownWithSelectWithoutSelect;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetDropDownValues1 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/r.php");
		
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
//		Select select = new Select(day);
//		List<WebElement> daylist = select.getOptions();
//		System.out.println("Total days in month " + daylist.size());
//		for (int i=0; i<daylist.size(); i++) {
//			String text = daylist.get(i).getText();
//			System.out.println(text);
//		}
//		
//		Select select1 = new Select(month);
//		List<WebElement> monthlist = select1.getOptions();
//		System.out.println("Total months in the year " + monthlist.size());
//		for (int i=0; i<monthlist.size(); i++) {
//			String monthtext = monthlist.get(i).getText();
//			System.out.println(monthtext);
//		}
//		
//		Select select2 = new Select(year);
//		List<WebElement> yearlist = select2.getOptions();
//		System.out.println("Years " + yearlist.size());
//		for (int i=0; i<yearlist.size(); i++) {
//			String yeartext = yearlist.get(i).getText();
//			System.out.println(yeartext);
//		}
		
		getDropDownValues1(day);
		getDropDownValues1(month);
		getDropDownValues1(year);
		
	}
	
	/**
	 * 3. This method is used to get all the values from the drop down.
	 * @param element
	 * @return 
	 */
	public static void getDropDownValues1 (WebElement element) {
		System.out.println("-----------------------------");
		Select select = new Select(element);
		List<WebElement> droplist = select.getOptions();
		System.out.println("Droplist " + droplist.size());
		
		for (int i= 0; i<droplist.size(); i++) {
			String list = droplist.get(i).getText();
			System.out.println(list);
			
		}
		
	}
}

