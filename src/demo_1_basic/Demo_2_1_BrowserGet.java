package demo_1_basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Demo_2_1_BrowserGet {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.gecko.driver", "Resources/geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		//driver.get("https://www.facebook.com/"); 
	    //driver.quit();

		System.setProperty("webdriver.ie.driver", "Resources/IEDriverServer.exe");
	    WebDriver driver = new InternetExplorerDriver();
	    driver.get("https://www.facebook.com/");
	    driver.quit();
	}

}
