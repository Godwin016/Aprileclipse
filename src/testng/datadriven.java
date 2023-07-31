package testng;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class datadriven {
	
	ChromeDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	@Test
	public void datadriven()
	{
		FileInputStream ob=new FileInputStream("C:\\Users\\User\\OneDrive\\Desktop\\datadriven.xlsxx");
		XSSFWorkbook
	}

}
