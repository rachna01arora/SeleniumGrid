package package1;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Test3 {
		
		@Test
		public void rediffmail(){
			Test1.driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
			System.out.println("Rediffmail Successfully open the URL");
		}

}
