package PageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	public WebDriver driver;
	

	public PageObjectManager(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public LandingPage getLandingPageObject()
	{
		LandingPage landingPage = new LandingPage(driver);
		return landingPage;
	}
	
	public OffersPage getOffersPageObject()
	{
		OffersPage offersPage = new OffersPage(driver);
		return offersPage;
	}
	
	public CheckoutPage getCheckoutPageObject()
	{
		CheckoutPage CheckoutPage = new CheckoutPage(driver);
		return CheckoutPage;
	}

}
