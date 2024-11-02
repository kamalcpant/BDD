package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class Generic {
	
	public String getProperty(String key) throws IOException
	{
	
	FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\global.properties");
	Properties properties = new Properties();
	properties.load(fis);
	return properties.getProperty(key);
	}
	

}
