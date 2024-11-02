package PageObjects;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OffersPage {
	
public WebDriver driver;
	
	public OffersPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By linkText = By.linkText("Top Deals");
	By searchText = By.id("search-field");
	By getText = By.xpath("//table//td[1]");
	
	public void clickOnLink()
	{
		driver.findElement(linkText).click();
	}
	
	public void navigateToOfferPage()
	{
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();
		i1.next();
		String ChildWindowHandlw = i1.next();
		driver.switchTo().window(ChildWindowHandlw);
	}
	
	public void searchText(String ShortName)
	{
		driver.findElement(searchText).sendKeys(ShortName);
	}
	
	public String getText()
	{
		return driver.findElement(getText).getText();
	}

}
