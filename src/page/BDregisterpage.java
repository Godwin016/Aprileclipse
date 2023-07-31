package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BDregisterpage {
	
	WebDriver driver;
	
	By bdName=By.xpath("//*[@id=\"name\"]:-");
	By bdCompany=By.xpath("//*[@id=\"company\"]");
	By Emailaddress=By.xpath("//*[@id=\"email\"]");
	By Password=By.xpath("//*[@id=\"password\"]");
	By Confirmpassword=By.xpath("//*[@id=\"password-confirm\"]");
	By bdregister=By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[6]/div/button");
	
	public BDregisterpage(WebDriver driver){
		this.driver=driver;
	}
	
	public void setvalues(String name,String company,String email,String password,String confirmpassword)
	{
		driver.findElement(bdName).sendKeys(name);
		driver.findElement(bdCompany).sendKeys(company);
		driver.findElement(Emailaddress).sendKeys(email);
		driver.findElement(Password).sendKeys(password);
		driver.findElement(Confirmpassword).sendKeys(confirmpassword);
		
		
	}
	public void register()
	{
		driver.findElement(bdregister).click();
	}
	

}
