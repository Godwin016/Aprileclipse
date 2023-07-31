package pgm;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkvalidation {
	ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	}
	@Test
	public void Linkvalidation()
	{
		List<WebElement> li=driver.findElements(By.tagName("a"));
		System.out.println("no of links= "+li.size());
		for(WebElement element:li)
		{
			String link=element.getAttribute("href");
			verify(link);
		}
	}
	public void verify(String link) {
		
		try {
			URL u=new URL(link);
			HttpURLConnection con=(HttpURLConnection)u.openConnection();
			con.connect();
			if(con.getResponseCode()==200)
			{
				System.out.println("successful--"+link);
			}
			else if(con.getResponseCode()==404)
			{
				System.out.println("broken--"+link);
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	
	
	

}
