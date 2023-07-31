package pgm;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpgm {
	
	ChromeDriver driver;
	@Before
	public void setup()
	{
		 driver=new ChromeDriver();
		driver.get("file:///C:/Users/User/OneDrive/Desktop/luminar/alert_example.html");
	}
	@Test
	public void test1()
	{
		driver.findElement(By.xpath("html/body/input[1]")).click();
		Alert a=driver.switchTo().alert();
		String alerttext=a.getText();
		System.out.println(alerttext);
		a.accept();
		driver.findElement(By.xpath("html/body/input[2]")).sendKeys("godwinhvb");
		driver.findElement(By.xpath("html/body/input[3]")).sendKeys("fdshf545682");
		
	}

}
