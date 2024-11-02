package StepDefinitions;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.reporter.FileUtil;

import Utils.TestObject;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

public class Hooks {
	
TestObject testobject;
	
	public Hooks(TestObject testobject)
	{
		this.testobject = testobject;
	}

	@After
	public void closeDriver()
	{
		testobject.driver.quit();
	}
	
	@AfterStep
	public void attachScreenshot(Scenario scenario) throws IOException
	{
		WebDriver driver = testobject.driver;
		if(scenario.isFailed())
		{
			File sourcefile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			byte [] fileContent= FileUtils.readFileToByteArray(sourcefile);
			scenario.attach(fileContent, "image/png", "image");
		}
	}
	
}
