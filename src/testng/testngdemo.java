package testng;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testngdemo {
	
	ChromeDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("httpa://www.facebook.com");
	}
	@Test
	public void titleverification()
	{
		System.out.println("titleverification");
	}
	@Test
	public void contentverification()
	{
		System.out.println("contentverification");
	}
	@AfterMethod
	public void aftmthd()
	{
		System.out.println("aftermethod");
	}
	@AfterTest
	public void teardown()
	{
		System.out.println("browser close");
	}
	

}
