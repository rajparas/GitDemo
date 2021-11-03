import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import util.DriverConn;

public class HandleMultipleWindows 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		WebDriver driver = DriverConn.getDriver();
		
		driver.get("http://demo.guru99.com/popup.php");
		
		String mainTab = driver.getWindowHandle();
		System.out.println("Main : "+mainTab);
		
		driver.findElement(By.linkText("Click Here")).click();
		
		
		Set<String> allTab = driver.getWindowHandles();
		System.out.println("After Click : "+allTab);
		
		for(String tab : allTab)
		{
			if(!tab.equals(mainTab))
			{
				driver.switchTo().window(tab);
				driver.findElement(By.name("emailid")).sendKeys("Tops12@gmail.com");
				driver.findElement(By.name("btnLogin")).click();
				
			}
		}
		
		
		
		
		
	}

}
