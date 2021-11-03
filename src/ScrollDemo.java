import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.DriverConn;

public class ScrollDemo 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WebDriver driver = DriverConn.getDriver();
		
		driver.get("http://www.facebook.com/");
		
		WebElement link = driver.findElement(By.linkText("Careers"));
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("window.scrollBy(0,400)" );
		// js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		js.executeScript("arguments[0].scrollIntoView();", link);
		
	}

}
