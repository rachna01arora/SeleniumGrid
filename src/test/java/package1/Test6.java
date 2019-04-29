package package1;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Test6 {
	
	@Test
	public void myntra(){
		Test4.driver.get("https://www.myntra.com/");
		System.out.println("Myntra Successfully logged into URL");
	}
}
