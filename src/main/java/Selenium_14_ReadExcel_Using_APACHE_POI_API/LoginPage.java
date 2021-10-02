package Selenium_14_ReadExcel_Using_APACHE_POI_API;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://manishtesting2018.wixsite.com/manishresume/contact");
		
		WebElement name = driver.findElement(By.id("input_comp-k5m6p3d8"));
		WebElement email = driver.findElement(By.id("input_comp-k5m6p3dl"));
		
//		name.sendKeys("Testing_Utility_DataDrivenFramework");
//		email.sendKeys("Test@gmail.com");
		
		Xls_Reader_Utility reader = new Xls_Reader_Utility ("C:\\Users\\Mitansh\\Desktop\\SampleExcel.xlsx");
		String sheetName = "login";
		
		int rowCount = reader.getRowCount(sheetName);
		System.out.println(rowCount);
		
		for (int rowNum=2; rowNum<=rowCount; rowNum++) {
			String loginId = reader.getCellData(sheetName, "Username", rowNum);
			String password = reader.getCellData(sheetName, "Password", rowNum);
			System.out.println(loginId + " " + password);
			
			Thread.sleep(1000);
			
			name.clear();
			name.sendKeys(loginId);
			
			email.clear();
			email.sendKeys(password);
			
		}
	}

}
