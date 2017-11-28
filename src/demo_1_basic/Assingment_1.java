package demo_1_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.host.Window;

public class Assingment_1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.navigate().to("https://recruiter.shine.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("Buy now")).click();
		//Thread.sleep(1000);
		
		driver.navigate().back();
		
		driver.findElement(By.className("blc_btn pullLeft cls_request_demo")).click();
		
		Thread.sleep(500);
		driver.close();

	}

}
