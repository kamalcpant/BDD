package PageObjects;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	
	public WebDriver driver;
	
	public LandingPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
//	public String URL = "https://rahulshettyacademy.com/seleniumPractise/#/";
	By searchText = By.className("search-keyword");
	By getText = By.cssSelector("h4[class='product-name']");
	
	
	public void launchLandingPage(String URL) 
	{
		driver.get(URL);
	}
	
	public void searchText(String ShortName)
	{
		driver.findElement(searchText).sendKeys(ShortName);
	}
	
	public String getText()
	{
		return driver.findElement(getText).getText();
	}
	
	public void navigateToLandingPage()
	{
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();
		String ParentWindowHandlw = i1.next();
		driver.switchTo().window(ParentWindowHandlw);
	}

}
