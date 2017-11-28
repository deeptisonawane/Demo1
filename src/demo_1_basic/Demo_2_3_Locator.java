package demo_1_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_2_3_Locator {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		Demo_2_3_Locator ref = new Demo_2_3_Locator();
		ref.setup();
		ref.locator();
		ref.teardown();

	}
    
	public void setup(){
		System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://Facebook.com/login/");
	}
	public void locator(){
		
		//driver.findElement(By.id("pass")).sendKeys("12345");
		 // driver.findElement(By.name("email")).sendKeys("priyanka");
		 // driver.findElement(By.id("loginbutton")).click();
		  //driver.findElement(By.name("login")).click();
		  
		  driver.findElement(By.xpath("//input[@placeholder = 'Email address or phone number']")).sendKeys("priyanka");
		  driver.findElement(By.xpath("//button[@type = 'submit']")).click();
	}
	public void teardown(){
		driver.close();
	}
}
