package demo_1_basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_2_2_Method_Calling
{
	static WebDriver driver;
	
		public static void main(String[] args) throws InterruptedException 
	{
		setup();

		teardown();
		
	}	
		
		public static void setup() throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
			driver = new ChromeDriver();
			driver.navigate().to("https://www.facebook.com/");
			Thread.sleep(1000);
			driver.manage().window().maximize();
			Thread.sleep(1000);
		}

public static void teardown()
{
	
	driver.close();
}

	}


