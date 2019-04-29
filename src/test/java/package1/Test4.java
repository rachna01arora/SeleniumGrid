package package1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test4 {
	
	static WebDriver driver;
	String baseURL, NodeURL;
	
	@BeforeTest
	public void setup() throws MalformedURLException{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\selenium_grid\\chromedriver.exe");
		baseURL="https://www.flipkart.com/";	
		NodeURL="http://20.198.14.117:2024/wd/hub";		
		DesiredCapabilities capability=DesiredCapabilities.chrome();
		capability.setBrowserName("chrome");
		capability.setPlatform(Platform.WIN10);
	    driver= new RemoteWebDriver(new URL(NodeURL), capability);
	}
@Test
public void flipkart(){
	driver.get(baseURL);
	driver.manage().window().maximize();
	System.out.println("Flipkart Successfully logged into URL");
}
}
