package Utils;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	Generic generic = new Generic();
	public WebDriver driver;
	
	public WebDriver webDriverManager() throws IOException
	{
		String browser_properties = generic.getProperty("browser");
		String browser_maven = System.getProperty("browser");
		System.out.println("Browser Properties: " + browser_properties);
		System.out.println("Browser Maven: " + browser_maven);
		
		String browserName = browser_maven!=null? browser_maven : browser_properties;
		System.out.println("Browser Name: " + browserName);
		System.out.println(driver==null);
		System.out.println(browserName.equalsIgnoreCase("chrome"));
		
		if(driver==null & browserName.equalsIgnoreCase("chrome"))
		{
			System.out.println("1");
			System.setProperty("webdriver.chrome.driver",
					"E:\\Selenium\\DownloadRequired\\BrowserDriver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(driver==null  & browserName.equalsIgnoreCase("firefox"))
		{
			System.out.println("2");
			System.setProperty("webdriver.gecko.driver",
					"E:\\Selenium\\DownloadRequired\\BrowserDriver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		return driver;
	}

}
