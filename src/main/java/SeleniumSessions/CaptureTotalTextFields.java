package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureTotalTextFields {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://register.rediff.com/register/register.php");
		System.out.println(driver.getTitle());
		
//		List<WebElement> listInput = driver.findElements(By.tagName("input"));
		List<WebElement> listInput = driver.findElements(By.xpath("//input[@type='text']"));
		
		System.out.println(listInput.size());
		
		for (int i=0; i<listInput.size(); i++) {
			listInput.get(i).sendKeys("Manish");
		}
		//driver.close();
			
			System.out.println("************************************");
			
	}
		
		
}