package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class copypaste {
	
	ChromiumDriver driver;
	
	String baseur1="http://register.rediff.com/register/register.php?FormName=user_details";
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(baseur1);
	}
	@Test
	public void copypaste()
	{
		WebElement fn=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input"));
		fn.sendKeys("godwin");
		WebElement redifmail=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]"));
		
		Actions act=new Actions(driver);
		act.keyDown(fn,Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
		act.keyDown(fn,Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);
		act.keyDown(redifmail,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL);
		act.perform();
	}

}
