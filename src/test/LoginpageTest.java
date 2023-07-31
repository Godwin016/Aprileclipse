package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.FBloginpage;

public class LoginpageTest extends BaseClass {
	
	
	@Test
	public void test1()
	{
		
		FBloginpage ob=new FBloginpage(driver);
		ob.setvalues("abc@gmail", "gdvshf");
		ob.login();

	}



}
