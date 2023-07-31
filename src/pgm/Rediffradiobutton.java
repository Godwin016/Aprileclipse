package pgm;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediffradiobutton {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		 driver=new ChromeDriver();
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}
	@Test
	public void button()
	{
		
		Boolean button=driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[24]/td[3]/input")).isSelected();
		if(button)
		{
			System.out.println("button is selected");
		}
		else
		{
			System.out.println("button is not selected");
		}

}
	@test
	public void 
}
