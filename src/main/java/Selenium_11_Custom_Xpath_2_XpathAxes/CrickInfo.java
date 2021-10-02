package Selenium_11_Custom_Xpath_2_XpathAxes;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrickInfo {

	public static void main(String[] args) {


	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.espncricinfo.com/series/india-tour-of-england-2021-1239527/england-vs-india-2nd-test-1239544/full-scorecard");
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	List<WebElement> scoreList = driver.findElements(By.xpath("//a[contains(text(),'Rohit Sharma')]//parent::td//following-sibling::td[@class='font-weight-bold']"));
	
	System.out.println(scoreList.size());
	
	for (int i=0; i<scoreList.size(); i++) {
		System.out.println(scoreList.get(i).getText());
		
	}
	
	
	}

}
