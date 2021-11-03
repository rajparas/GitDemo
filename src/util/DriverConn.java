package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverConn 
{
	public static WebDriver getDriver()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\srajpara2\\OneDrive - DXC Production\\Desktop\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		return driver;
		
		
	
	}

	

}
