//package TestRunner;
//
//import org.testng.annotations.DataProvider;
//
//import io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.testng.CucumberOptions;
//
//@CucumberOptions(features="src/test/java/features", glue="StepDefinitions", monochrome=true, tags="@Checkout",
//plugin= {"html:target/cucumber.html", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "rerun:target/failed_scenario.txt"})
//public class TestNGRunner extends AbstractTestNGCucumberTests {
//	
//	@Override
//	@DataProvider(parallel=true)
//	public Object [][] scenarios()
//	{
//		return super.scenarios();
//	}
//
//}
