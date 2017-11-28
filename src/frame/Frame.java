package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
	static 	WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("http://seleniumhq.github.io/selenium/docs/api/java/index.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='packageListFrame']")));
		driver.findElement(By.xpath("//a[text()='com.thoughtworks.selenium']")).click();
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='classFrame']")));
		driver.findElement(By.xpath("//a[text()='Tree']")).click();;
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		driver.quit();

	}

}
