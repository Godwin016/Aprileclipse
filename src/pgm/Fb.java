package pgm;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb {

	ChromeDriver driver;
	@Before
	public void setup()
	{
		 driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	@Test
	public void test1()
	{
		driver.findElement(By.id("email")).sendKeys("godwinhvb");
		driver.findElement(By.name("pass")).sendKeys("fdshf545682");
		driver.findElement(By.name("login")).click();
	}
}
