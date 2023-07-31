package testng;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class gurudemo {
	
	ChromeDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html#google_vignette");
	}
	@Test
	public void doubleandright()
	{
	WebElement right= driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
	Actions act=new Actions(driver);
	act.contextClick(right);
	act.perform();
	driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]")).click();
	driver.switchTo().alert().accept();
	WebElement doubleClick= driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
	act.doubleClick(doubleClick);
	act.perform();
	Alert a=driver.switchTo().alert();
	String alerttext=a.getText();
	a.accept();
	System.out.println(alerttext);
	
		
		
		
	}

}
