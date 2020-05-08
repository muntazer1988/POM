package Initialize_Browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class initializeBrowser {
	
	static WebDriver driver;
	
	
 public static WebDriver headBrowser(String browserName, String url) {
	 
	 if (browserName.equals("chrome")) {
		 driver=new ChromeDriver();
	 }
	 
	 else if (browserName.equals("Firefox")) {
		 driver=new FirefoxDriver();
	 }
	 
	 else if (browserName.equals("IE")) {
		 driver=new InternetExplorerDriver();
	 }
	 
	
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 driver.manage().window().maximize();
	 driver.get("https://wordpress.com/start/user");
	 
	 return driver;
	 
 }
	

}
