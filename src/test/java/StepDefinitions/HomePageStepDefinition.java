package StepDefinitions;
import java.io.IOException;

import PageObjects.LandingPage;
import Utils.TestObject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class HomePageStepDefinition {
	
	TestObject testobject;
	LandingPage landingPage;
	
	public HomePageStepDefinition(TestObject testobject)
	{
		this.testobject = testobject;
		this.landingPage = testobject.pageObjectManager.getLandingPageObject();
//		landingPage = new LandingPage(testobject.driver);
	}
	
	
	@Given("User is on GreenKart Home page")
	public void user_is_on_green_kart_home_page() throws IOException {
		String URL = testobject.generic.getProperty("HOME_PAGE_URL");
		URL = URL.trim().replace("\"", "");
		landingPage.launchLandingPage(URL);
//		testobject.driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	}
	@When("^User search with short name (.+) on Landing Page$")
	public void user_search_the_product_with_on_home_page(String ShortName) throws InterruptedException {
		
		landingPage.searchText(ShortName);
		Thread.sleep(1000);
	}
	
	@When("User extract the product Name on Home Page")
	public void user_extract_the_product_Name_on_Home_Page() throws InterruptedException {
			
			testobject.Product_Name_HomePage = landingPage.getText();
	//		String ProductName = testobject.driver.findElement(By.cssSelector("h4[class='product-name']")).getText();
			String arr[] = testobject.Product_Name_HomePage.split("-");
			testobject.Product_Name_HomePage = arr[0].strip();
			System.out.println("Product Name at Search Page: "+ testobject.Product_Name_HomePage);
		
	}
	

}
