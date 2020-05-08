package LandingPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class storeSignUpPage {
	
	
	By emailaddress= By.id("email");
	By username= By.id("username");
	By password= By.id("password");
	By create_your_account_button= By.xpath("//button[@type='submit']");
	WebDriver driver;
	
	
	
	
	public storeSignUpPage(WebDriver driver) {
		this.driver=driver; 
	}
	


	public void emailaddress() {
	
	 driver.findElement(emailaddress).sendKeys("imran@gmail.com");
	}
	
	
	public void username() {
		driver.findElement(username).sendKeys("Imran");
	}
	
	public void password() {
		driver.findElement(password).sendKeys("test@12345");
	}
	
	public void create_your_account_button() {
		driver.findElement(create_your_account_button).click();
	}

	}





		
	
	


