package Selenium_12_CustomCSSSelector_ReverseXpathConcept;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateCustomDynamicCSSSelectors {

	public static void main(String[] args) {
		
//		Interview Question for CSS selector:
		
//		naveen youtube video: https://www.youtube.com/watch?v=VYIDZ57mMy4
//		url: https://guide.blazemeter.com/hc/en-us
//		url: https://app.hubspot.com/login

//		CSS Selector is faster than XPath.class.
//		Xpath is starting looking element from top of the dom.
//		CSS Selector directely hiting on the dom element. 
		
//		Rules:
//		1. id --> htmltag#id, #id
//		2. class --> htmltag.classname, .classname, .c1.c2.c3, HtmlTag.c1.c2.c3...c3
//		3. parent>childtag
		
//		https://guide.blazemeter.com/hc/en-us
//		ul#categories
//		div.header-inner
//		div.logo
//		.logo
//		.header-inner
		
//		https://app.hubspot.com/login
//		#username
//		input#username
//		input.form-control.private-form__control.login-email
//		input#username.form-control.private-form__control.login-email
//		input.login-email
//		.form-control.private-form__control.login-email
//		
//		4. htmltag[id='value']
//		input[id='username'] --> css with one attribute
//		//input[@id='username'] --> xpath
//		input[id='username'][type='email'] --> css with two attribute.
//		input[@id='username' and @type='email']  --> xpath with two attribute.
		
//		5. contains the text in css
//		input[id*='user']
//		input[id*='name']
		
//		id = 
//		test_123
//		test_456		
//		test_789
//		
//		intput[id*=test_]
		
//		6. starting the text in css:
//		input[id*=user]
		
//		7. ending the text in css:
//		input[id$=name]
		
//		8. comma in css:
//		div.private-form__control-wrapper,input#username
		
//		9. first-if-type in css:
//		ul#categories>li:first-of-type
		
//		10. last-of-type in css:
//		ul#categories>li:last-of-type
		
//		11. nth-of-type
//		ul#categories>li:nth-of-type(1)
//		ul#categories>li:nth-of-type(2)
//		ul#categories>li:nth-of-type(12)
//		ul#categories>li:nth-of-type(n) -- all the elements
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://guide.blazemeter.com/hc/en-us");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		List<WebElement> blazemeter = driver.findElements(By.cssSelector("ul#categories>li:nth-of-type(n)"));
		
		System.out.println(blazemeter.size());
		
		for (int i=0; i<blazemeter.size(); i++) {
			String totallinks = blazemeter.get(i).getText();
			System.out.println(totallinks);
		}
		
//		12. sibling of element:
//		div.private-form__input-wrapper+div
//		div.private-form__input-wrapper+div.private-form__meta
//		ul#categories>li:nth-of-type(3)+li
		
//		13. not operator in css:
//		div.private-form__control-wrapper:not,(private-form__control-wrapper)
//		input.form-control.private-form__control:not(.login-password)
		
//		---------------------------------------------------------------------------------------------------------------
		
	}

}
