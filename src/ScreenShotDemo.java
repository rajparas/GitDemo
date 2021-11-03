import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import util.DriverConn;

public class ScreenShotDemo 

{
	public static void getScreenShot(WebDriver driver, String path)
	{
		TakesScreenshot snap = (TakesScreenshot) driver;
		File source = snap.getScreenshotAs(OutputType.FILE);
		File dest = new File(path);
		
		try {
			FileUtils.copyFile(source, dest);
			System.out.println("Screenshot taken");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WebDriver driver = DriverConn.getDriver();
		
		driver.get("http://www.topsint.com/topserp/");
		getScreenShot(driver, "C:\\Users\\srajpara2\\OneDrive - DXC Production\\Desktop\\Screenshot\\Login.png");
		
		Select login = new Select(driver.findElement(By.id("lutype")));
		login.selectByVisibleText("Customer Acquisition");
		
		driver.findElement(By.id("l_username")).sendKeys("Testing");
		driver.findElement(By.id("l_password")).sendKeys("Demo");
		driver.findElement(By.name("btn_login")).click();
		
		getScreenShot(driver,"C:\\Users\\srajpara2\\OneDrive - DXC Production\\Desktop\\Screenshot\\ErrorMessage.png");
		
		
	}

	private static void getScreenshot() {
		// TODO Auto-generated method stub
		
	}

}
