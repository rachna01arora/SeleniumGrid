package package1;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;  
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {
	static WebDriver driver;
	String baseURL, NodeURL;
	
	@BeforeTest
	public void setup() throws MalformedURLException{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\selenium_grid\\chromedriver.exe");
		baseURL="https://accounts.google.com/ServiceLogin/signinchooser?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Ftab%3Dwm&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin/";
		NodeURL="http://20.198.14.96:5567/wd/hub";	
		//NodeURL="http://20.198.14.117:5566/wd/hub";		
		DesiredCapabilities capability=DesiredCapabilities.chrome();
		capability.setBrowserName("chrome");
		capability.setPlatform(Platform.WIN10);
	    driver= new RemoteWebDriver(new URL(NodeURL), capability);
	//	URL url = new URL("http://20.198.14.96:4444/wd/hub");
	//	WebDriver driver = new RemoteWebDriver(url, capability);
	
	}
@Test
public void gmail(){
	driver.get(baseURL);
	driver.manage().window().maximize();
	System.out.println("Gmail Successfully open the URL");
}

}