package testng;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazonwindowhandler {

	ChromeDriver driver;
	
	@BeforeTest
	public void beforetest()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
	}
	@Test
	public void test()
	{
		
	}
}
