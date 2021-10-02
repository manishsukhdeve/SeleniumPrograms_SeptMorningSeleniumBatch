package SeleniumSessions;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownTest {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/r.php");
		
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
//		DropDownUtil.getDropDownValues(month);
//		DropDownUtil.getDropDownValues(day);
//		DropDownUtil.getDropDownValues(year);
		
		
		String date = "12-Dec-2012";
		String dateval[] = date.split("-");
		DropDownUtil.SelectValueFromDropDownByText(day, dateval[0]);
		DropDownUtil.SelectValueFromDropDownByText(month, dateval[1]);
		DropDownUtil.SelectValueFromDropDownByText(year, dateval[2]);
		
		
		
		ArrayList<String> daylist = DropDownUtil.getDropDownValues(day);
		System.out.println(daylist);
		
		ArrayList<String> monthlist = DropDownUtil.getDropDownValues(month);
		System.out.println(monthlist);
		
		ArrayList<String> yearlist = DropDownUtil.getDropDownValues(year);
		System.out.println(yearlist);
	}

}
