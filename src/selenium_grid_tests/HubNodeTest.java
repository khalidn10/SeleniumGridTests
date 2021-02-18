package selenium_grid_tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HubNodeTest {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		// Create DesiredCapabilities object and set the required properties
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setPlatform(Platform.WIN10);
		dc.setBrowserName("chrome");
		//dc.setVersion(""); // For setting the browser version
		
		// Create the RemoteWebDriver object
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), dc);
		
		// ***Test can now be written the same way you would for a test to be run locally***
		
		// Open Facebook page
		driver.get("https://www.facebook.com");
	}

}
