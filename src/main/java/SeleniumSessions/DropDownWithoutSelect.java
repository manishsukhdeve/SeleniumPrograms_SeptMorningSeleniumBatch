package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownWithoutSelect {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/r.php");
		
//		WebElement day = driver.findElement(By.id("day"));
//		WebElement month = driver.findElement(By.id("month"));
//		WebElement year = driver.findElement(By.id("year"));
		
//		List<WebElement> dayslist = driver.findElements(By.xpath("//select[@id='day']/option"));
//		System.out.println(dayslist.size());
//		
//		for(int i=0; i<dayslist.size(); i++)
//		{
//			String text = dayslist.get(i).getText();
//			System.out.println("Total number of days : " + text);
//			if(text.equals("3"))
//			{
//				dayslist.get(i).click();
//				break;
//			}	
//		}
		
		String day = "//select[@id='day']/option";
		String month = "//select[@id='month']/option";
		String year = "//select[@id='year']/option";
		
		DropDownUtil.SelectDropDownValueWithoutSelect(driver, day, "13");
		DropDownUtil.SelectDropDownValueWithoutSelect(driver, month, "Apr");
		DropDownUtil.SelectDropDownValueWithoutSelect(driver, year, "1986");
		
	}
}

