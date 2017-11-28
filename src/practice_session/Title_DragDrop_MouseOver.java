package practice_session;


import java.awt.event.ActionEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Title_DragDrop_MouseOver 
{
	static WebDriver driver;

	
	
	
	@BeforeTest
	public void beforetest()
	{
		System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@Test (enabled=false)
	public void title() throws InterruptedException
	{
	driver.get("https://www.facebook.com/login/");
	String title = driver.getTitle();
	System.out.println(title);
	Assert.assertEquals(title, "Log in to Facebook | Facebook"); 
	Thread.sleep(5000);
	}
	
	
	@Test 
	public void dragdrop() throws InterruptedException
	{
	driver.get("http://jqueryui.com/droppable/");
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
	
	Actions act = new Actions(driver);
	act.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).build().perform();
	
	Thread.sleep(5000);
	}
	
	@Test (enabled = false)
	public void mousehover() throws InterruptedException
	{
		driver.get("http://jqueryui.com/droppable/");
		
			
		WebElement sour=driver.findElement(By.xpath("//a[text()='Contribute']"));
		WebElement tar=driver.findElement(By.xpath("//a[text()='Bug Triage']"));
		
		Actions act= new Actions(driver);
		act.moveToElement(sour).moveToElement(tar).click().build().perform();
		
		Thread.sleep(5000);
	}
	
	
	@AfterTest
	public void aftertest()
	{
	driver.quit();
	}
}
