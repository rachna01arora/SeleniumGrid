package package1;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Test5 {

	
	@Test
	public void amazon(){
		Test4.driver.get("https://www.amazon.in/");
		System.out.println("Amazon Successfully logged into URL");
	}

}
