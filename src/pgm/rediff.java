package pgm;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class rediff {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		 driver=new ChromeDriver();
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}
	@Test
	public void test1()
	{
Boolean logo=driver.findElement(By.xpath("//img[@title='Rediff.com']")).isDisplayed();
if(logo)
{
	System.out.println("logo is displayed");
}
else
{
	System.out.println("logo is not displayed");
}
		
		
		
		
	}

}
