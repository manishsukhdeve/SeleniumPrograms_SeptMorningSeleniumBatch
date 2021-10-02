package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetDropDownValues {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/r.php");
		
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		
		
//		Select select = new Select(day);
//		List<WebElement> dayslist = select.getOptions();
//		System.out.println("Total number of days : " + dayslist.size());
//		for (int i=0; i<dayslist.size(); i++)
//		{
//			String text = dayslist.get(i).getText();
//			System.out.println(text);
//		}
		
		
		
//		Select select1 = new Select(month);
//		List<WebElement> monthlist = select1.getOptions();
//		System.out.println("Total number of months : " + monthlist.size());
//		for (int i=0; i<monthlist.size(); i++)
//		{
//			String mahina = monthlist.get(i).getText();
//			System.out.println(mahina);
//		}
		
		
		
//		Select select2 = new Select(year);
//		List<WebElement> yearlist = select2.getOptions();
//		System.out.println("Years : " + yearlist.size()	);
//		for (int i=0; i<yearlist.size(); i++)
//		{
//			String years = yearlist.get(i).getText();
//			System.out.println(years);
//		}
		
		
		getDropDownValues(day);
		getDropDownValues(month);
		getDropDownValues(year);
		
	}
		
		/**
		 * 3. This method is used to get all the values from the drop down.
		 * @param element
		 */
		public static void getDropDownValues(WebElement element)
		{
			System.out.println("----------------------");
			Select select3 = new Select(element);
			List<WebElement> droplist = select3.getOptions();
			System.out.println("Total number of values in the dropdown : " + droplist.size());
			for (int i=0; i<droplist.size(); i++)
			{
				String text = droplist.get(i).getText();
				System.out.println(text);
			}
		}

}
