package DropDownWithSelectWithoutSelect;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownWithoutSelectClass {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/r.php");
		
//		List<WebElement> daysList = driver.findElements(By.xpath("//select[@id='day']/option"));
//		System.out.println(daysList.size());
//		
//		for (int i=0; i<daysList.size(); i++) {
//			String text = daysList.get(i).getText();
//			System.out.println(text);
//			if(text.equals("13")) {
//				daysList.get(i).click();
//				break;
//			}
//		}
		
		String day = "//select[@id='day']/option";
		String month = "//select[@id='month']/option";
		String year = "//select[@id='year']/option";
		
		WithoutSelectUtility.DropDownWithoutSelectClass(driver, day, "15");
		WithoutSelectUtility.DropDownWithoutSelectClass(driver, month, "Jun");
		WithoutSelectUtility.DropDownWithoutSelectClass(driver, year, "1987");

	}
	


}
