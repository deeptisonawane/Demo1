package window;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;



public class Windows {
	static 	WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
	    driver = new HtmlUnitDriver();
		driver.navigate().to("https://www.naukri.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		String main=driver.getWindowHandle();
	  Set<String> abc = driver.getWindowHandles();
	  System.out.println(abc.size());
	  for(String win : abc)
	  {
		
		driver.switchTo().window(win) ; 
		String title=driver.getTitle();
		System.out.println(title);
		if(!title.equals("Jobs - Recruitment - Job Search - Employment - Job Vacancies - Naukri.com")){
			driver.close();
		}
	  }
		driver.switchTo().window(main);
		String title=driver.getTitle();
		System.out.println("my main "+title);
		
		Thread.sleep(3000);
		
	    driver.findElement(By.xpath("//span[text()='Search']")).click();
	    driver.findElement(By.name("qp")).sendKeys("testing");
	    driver.findElement(By.xpath("//button[text()='Search ']")).click();
	    driver.navigate().back();
	   
	    driver.findElement(By.xpath("//button[text()='View Salaries']")).click();
		Thread.sleep(5000);
	  
      driver.quit();
	}

}
