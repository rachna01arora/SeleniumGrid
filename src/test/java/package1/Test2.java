package package1;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Test2 {

	
	@Test
	public void yahoo(){
		Test1.driver.get("https://in.yahoo.com/");
		System.out.println("Yahoo Successfully open the URL");
	}
}
