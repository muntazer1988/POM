package ValidateTestPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import LandingPage.storeSignUpPage;

public class SignUpPage  {
	
	
	
	@Test
	public void realTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\omid_\\Drivers\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://wordpress.com/start/user");
		
		
		storeSignUpPage up=new storeSignUpPage(driver);
		up.emailaddress();
		up.username();
		up.password();
		up.create_your_account_button();
		
	}

}
