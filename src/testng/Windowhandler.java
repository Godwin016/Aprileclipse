package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Windowhandler {
	
	ChromeDriver driver;
	
	@BeforeTest
	public void beforetest()
	{
		driver=new ChromeDriver();
	}
	@Test
	public void test()
	{
		driver.get("https://demo.guru99.com/popup.php");
		
		String parentWindow = driver.getWindowHandle();
		
		System.out.println("Parent Window Title" +driver.getTitle());
		driver.findElement(By.xpath("/html/body/p/a")).click();
		
		Set<String> allWindowsHandles = driver.getWindowHandles();
		
		for (String handle : allWindowsHandles)
		{
			if (!handle.equalsIgnoreCase(parentWindow))
			{
				driver.switchTo().window(handle);
				
				String s=driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td/h2")).getText();
				System.out.println(s);
				driver.close();
			}
			driver.switchTo().window(parentWindow);
		}
	}

}
