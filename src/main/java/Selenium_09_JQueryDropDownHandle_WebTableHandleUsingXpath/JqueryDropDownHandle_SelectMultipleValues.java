package Selenium_09_JQueryDropDownHandle_WebTableHandleUsingXpath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqueryDropDownHandle_SelectMultipleValues {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.id("justAnInputBox")).click();
		
		selectChoiceValue(driver, "choice 1", "choice 2 3", "choice 6 2 3", "choice 7");

	}
	
	/**
	 * select multiple options from dropdown.
	 * @param driver
	 * @param value
	 */
	public static void selectChoiceValue (WebDriver driver, String... value) {
		
		List<WebElement> choicelist = driver.findElements(By.xpath("//div[@class = 'comboTreeDropDownContainer']//ul//li/span[@class = 'comboTreeItemTitle']"));
		
		for (int i=0; i<choicelist.size(); i++) {
			String text = choicelist.get(i).getText();
			System.out.println(text);
			
			for (int k=0; k<value.length; k++) {
				if (text.equals(value[k])) {
					choicelist.get(i).click();
					break;
				}
			}

		}
	}
}



