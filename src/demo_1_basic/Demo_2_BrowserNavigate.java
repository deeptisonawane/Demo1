package demo_1_basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.MaximizeWindow;

public class Demo_2_BrowserNavigate {

	public static void main(String[] args) throws InterruptedException {

	   System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.navigate().to("https://www.facebook.com/");
       driver.manage().window().maximize();
       Thread.sleep(1000);
       driver.navigate().refresh();
       driver.navigate().back();
       Thread.sleep(1000);
       driver.navigate().forward();
	   driver.close();


	}

}
