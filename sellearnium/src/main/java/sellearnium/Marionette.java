package sellearnium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.MarionetteDriver;

public class Marionette 
{

	public static void main(String args[])
	{
		String marionetteDriverLocation="E:\\Study\\selenium\\Drivers\\geckodriver.exe";
		String baseurl = "http://www.google.com";
		
		System.setProperty("webdriver.gecko.driver", marionetteDriverLocation);
		
		WebDriver driver = new MarionetteDriver();
	
		driver.get(baseurl);
		driver.quit();
	}
	
}
