package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
	
	public WebDriver driver;
	
	public CheckoutPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By increment = By.className("increment");
	By addToCart = By.xpath("//button[text()='ADD TO CART']");
	By cartIcon = By.xpath("//img[@alt=\"Cart\"]");
	By proceedToCheckout = By.xpath("//button[text()='PROCEED TO CHECKOUT']");
	By productName = By.cssSelector("p[class='product-name']");
	By applyButton = By.cssSelector(".promoBtn");
	By placeOrder = By.xpath("//button[text()='Place Order']");
	
	public void increaseQuantity(int Quantity)
	{
		while(Quantity > 0)
		{
		driver.findElement(increment).click();
		Quantity -= 1;
		}
	}
	
	public void clickAddToCartButton()
	{
		driver.findElement(addToCart).click();
	}
	
	public void clickonCartIcon()
	{
		driver.findElement(cartIcon).click();
	}
	
	public void proceedToCheckout()
	{
		driver.findElement(proceedToCheckout).click();
	}
	
	public String getProductName()
	{
		return driver.findElement(productName).getText();
	}
	
	public Boolean verifyApplyButton()
	{
		return driver.findElement(applyButton).isDisplayed();
	}
	
	public Boolean verifyPlaceOrderButton()
	{
		return driver.findElement(placeOrder).isDisplayed();
	}

}
