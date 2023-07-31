package test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import page.Createfbpage;
import page.FBloginpage;

public class CreatepageTest extends BaseClass{
	
	@Test
	public void test1()
	{
		FBloginpage ob=new FBloginpage(driver);
		ob.setvalues("abc@gmail.com","gdvsh");
		ob.login();
		driver.navigate().back();
		Createfbpage ob1 =new Createfbpage(driver);
		ob1.createpage();
		ob1.getstarted();
	}
	
	

}
