import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.DriverConn;

public class ExplicitWaitDemo {

	public static void main(String[] args) 
	{
		
		WebDriver driver = DriverConn.getDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
		
		System.out.println("Git hub ");
		System.out.println("Git hub 1");
	}

}
