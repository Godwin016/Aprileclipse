package pgm;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {
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
		driver.findElement(By.xpath("//input[@data-testid='royal_email']")).sendKeys("godwinclament");
		driver.findElement(By.xpath("//input[@data-testid='royal_pass']")).sendKeys("71542393");
		driver.findElement(By.name("//button[@name='login']")).click();
	}
}

