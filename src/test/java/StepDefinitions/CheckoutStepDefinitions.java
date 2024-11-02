package StepDefinitions;

import org.junit.Assert;

import PageObjects.CheckoutPage;
import Utils.TestObject;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckoutStepDefinitions {
	
	TestObject testobject;
	CheckoutPage checkoutpage;
	
	public CheckoutStepDefinitions(TestObject testobject)
	{
		this.testobject = testobject;
		this.checkoutpage = testobject.pageObjectManager.getCheckoutPageObject();
	}
	
	@When("^User increase (\\d+) of product and add it to Cart$")
	public void User_increase_quantity_ofproduct(int Quantity) throws InterruptedException
	{
		checkoutpage.increaseQuantity(Quantity);
		Thread.sleep(2000);
		checkoutpage.clickAddToCartButton();
	}
	

	@Then("User click on CART icon and Proceed to Checkout")
	public void user_click_on_cart_icon_and_proceed_to_checkout() throws InterruptedException {
	    
	    checkoutpage.clickonCartIcon();
	    checkoutpage.proceedToCheckout();
	    Thread.sleep(3000);
	}
	
	@Then("User validate the product name on Checkout page and buttons availability")
	public void user_validate_the_search_product_on_checkout_page() throws InterruptedException {
			
		testobject.Product_Name_CheckoutPage =  checkoutpage.getProductName();
//		Expected_Name =  testobject.driver.findElement(By.xpath("//table//td[1]")).getText();
		String arr[] = testobject.Product_Name_CheckoutPage.split("-");
		testobject.Product_Name_CheckoutPage = arr[0].strip();
		System.out.println("Product Name at Checkout Page: "+ testobject.Product_Name_CheckoutPage);
		Assert.assertEquals(testobject.Product_Name_HomePage,testobject.Product_Name_CheckoutPage);
		
		Assert.assertTrue(checkoutpage.verifyApplyButton());
		Assert.assertTrue(checkoutpage.verifyPlaceOrderButton());
		
		System.out.println("Test Case Completed Successfully for checkout Functionality");
	}
}
