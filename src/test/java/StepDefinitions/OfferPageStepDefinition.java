package StepDefinitions;

import org.junit.Assert;

import PageObjects.OffersPage;
import Utils.TestObject;
import io.cucumber.java.en.Then;

public class OfferPageStepDefinition {
	
	TestObject testobject;
	OffersPage offersPage;
	
	public OfferPageStepDefinition(TestObject testobject)
	{
		this.testobject = testobject;
		offersPage = testobject.pageObjectManager.getOffersPageObject();
//		offersPage = new OffersPage(testobject.driver);
	}
	
	@Then("^User validate the search product (.+) on Offer page$")
	public void user_validate_the_search_product_on_offer_page(String ShortName) throws InterruptedException {
		offersPage.clickOnLink();
//		testobject.driver.findElement(By.linkText("Top Deals")).click();
		offersPage.navigateToOfferPage();
		Thread.sleep(1000);
		offersPage.searchText(ShortName);
//		testobject.driver.findElement(By.id("search-field")).sendKeys("Tom");
		Thread.sleep(200);
		testobject.Product_Name_CheckoutPage =  offersPage.getText();
//		Expected_Name =  testobject.driver.findElement(By.xpath("//table//td[1]")).getText();
		System.out.println(testobject.Product_Name_CheckoutPage);
		Assert.assertEquals(testobject.Product_Name_HomePage,testobject.Product_Name_CheckoutPage);
		System.out.println("Test Case Completed Successfully for Search Functionality");
	}

}
