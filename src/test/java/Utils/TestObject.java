package Utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import PageObjects.PageObjectManager;

public class TestObject {
	public WebDriver driver;
	public String Product_Name_HomePage;
	public String Product_Name_CheckoutPage;
	public PageObjectManager pageObjectManager;
	public TestBase testBase;
	public Generic generic;
	
	public TestObject() throws IOException
	{
		testBase = new TestBase();
		generic = new Generic();
		driver = testBase.webDriverManager();
		pageObjectManager = new PageObjectManager(driver);
		
	}

}
