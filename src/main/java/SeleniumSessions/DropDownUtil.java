package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownUtil {
	
							/**
							 * 1. This method is used to select the value from a drop down on the basis of given text.
							 * @param element
							 * @param value
							 */
							public static void SelectValueFromDropDownByText(WebElement element, String value)
							{
								Select select = new Select(element);
								select.selectByVisibleText(value);
							}
							
							
							
							
							/**
							 * 2. This method is used to select the value from a drop down on the basis of given index.
							 * @param element
							 * @param number
							 */
							public static void SelectValueFromDropDownByIndex(WebElement element, int number)
							{
								Select select1 = new Select(element);
								select1.selectByIndex(number);
							}
							
							
							
							
							/**
							 * This method is used to get all the values from the drop down.
							 * @param element
							 */
							public static ArrayList<String> getDropDownValues(WebElement element)
							{
								System.out.println("----------------------");
								Select select3 = new Select(element);
								
								List<WebElement> droplist = select3.getOptions();
								System.out.println("Total number of values in the dropdown : " + droplist.size());
								
								ArrayList<String> ar = new ArrayList<String>();
								
								for (int i=0; i<droplist.size(); i++)
								{
									String text = droplist.get(i).getText();
//									System.out.println(text);
									
									ar.add(text);
								}
								return ar;
							
							}

							
							
							/**
							 * This method is used to select the value from drop down without select class.
							 * @param driver
							 * @param locator
							 * @param value
							 */
							public static void SelectDropDownValueWithoutSelect(WebDriver driver, String locator, String value)
							{
								List<WebElement> droplist = driver.findElements(By.xpath(locator));
								System.out.println("Total Drop Down Values : " + droplist.size());
								
								for(int i=0; i<droplist.size(); i++)
								{
									String text = droplist.get(i).getText();
									System.out.println("Total number of values : " + text);
									if(text.equals(value))
									{
										droplist.get(i).click();
										break;
									}	
								}
							}
}
