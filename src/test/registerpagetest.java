package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.BDregisterpage;

public class registerpagetest {
	
	WebDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://blazedemo.com/register");
	}
	@Test
	public void test1()
	{
		BDregisterpage ob=new BDregisterpage(driver);
		ob.setvalues("alvin", "luminar", "alvin@gmail.com", "cdgfhaja", "cdgfhaja");
		ob.register();
	}

}
