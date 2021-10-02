package TestNGSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
//	Before	Before slit, Before test, Before class, Before method
//	Test	@Test
//	After	After method, After class, After test, After slit.
	
	WebDriver driver;
	
	By username = By.id("username");
	By password = By.id("password");
	By login = By.id("logBtn");
	By signup = By.linkText("Sign up");
	By homePageHeader = By.className("private-header__title private-page__title");
	
//	@BeforeTest
	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://app-eu1.hubspot.com/contacts/24970340/objects/0-1/views/all/list");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Test(priority=1)
	public void signUpLinkTest() {
		Assert.assertTrue(driver.findElement(signup).isDisplayed());
	}
	
	@Test(priority=2)
	public void pageTitleTest() {
		String title = driver.getTitle();
		System.out.println("Page title is : " + title);
		Assert.assertEquals(title, "HubSpot Login");
	}
	
	@Test(priority=3)
	public void loginTest() {
		driver.findElement(username).sendKeys("mamta.sukhdeve123@gmail.com");
		driver.findElement(password).sendKeys("Test@123456789");
//		driver.findElement(login).click();
//		String homePageHeaderVal = driver.findElement(homePageHeader).getText();
//		Assert.assertEquals(homePageHeaderVal, "User Guide");
	}
	
//	@AfterTest
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
