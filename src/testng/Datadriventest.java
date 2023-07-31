package testng;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datadriventest {
	
	ChromeDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
	}
	@Test
	public void test1() 
	{
		FileInputStream ob=new FileInputStream("C:\\Users\\User\\OneDrive\\Desktop\\datadriven.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(ob);
		XSSFSheet sh=wb.getSheet("Sheet2");
		int rowsize=sh=wb.getLastRowNum();
		for(int i=1;i<=rowsize;i++)
		{
			String username=sh.getRow(i).getCell(0).getStringCellValue();
			String pswd=sh.getRow(i).getCell(1).getStringCellValue();
			
			driver.findElement(By.name("email")).sendKeys(username);
			driver.findElement(By.id("pass")).sendKeys(pswd);
			driver.findElement(By.id("submit")).click();
			
			String currenturl=driver.getCurrentUrl();
			String Loginurl=("https://practicetestautomation.com/logged-in-successfully/");
			if(currenturl==Loginurl)
			{
				System.out.println("Logged in successfully");
			}
				else
				{
					System.out.println("Logged in successful");
				}
			}
			
		}
	}

}
