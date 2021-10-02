package Selenium_06_FrameHandle_AuthPopUpHandle_ActionsClassConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthPopUp2 {	// Handling Authentication Popup Window

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
//		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
//		before the domain name we have to add username and password.
//		ex. admin is username and admin is password
//		and before domain name we have to enter admin 
//		domain name : the-internet.herokuapp.com/basic_auth
		
//		Another way:
		
		String username = "admin";
		String password = "admin";
		
		driver.get("https://"+username+":"+password+"@the-internet.herokuapp.com/basic_auth");
		
	}

}
