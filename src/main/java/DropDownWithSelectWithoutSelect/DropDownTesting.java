package DropDownWithSelectWithoutSelect;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownTesting {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/r.php");
		
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		String date = "20-Dec-1986";
		String datval[] = date.split("-");
		
		DropDownUtility.selectValueFromDropDown(day, datval[0]);
		DropDownUtility.selectValueFromDropDown(month, datval[1]);
		DropDownUtility.selectValueFromDropDown(year, datval[2]);
		
		ArrayList<String> daylist = DropDownUtility.getDropDownValues1(day);
		System.out.println(daylist);

		ArrayList<String> monthlist = DropDownUtility.getDropDownValues1(month);
		System.out.println(monthlist);
		
		ArrayList<String> yearlist = DropDownUtility.getDropDownValues1(year);
		System.out.println(yearlist);
		
	}

}
