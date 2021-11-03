import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import util.DriverConn;

public class MouseEvent 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		WebDriver driver = DriverConn.getDriver();
		
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		
		WebElement from = driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement to = driver.findElement(By.xpath("//*[@id=\"table4\"]/tbody/tr/td[2]/div"));
		
		
		Actions builder = new Actions(driver);
		
		// builder.dragAndDrop(from, to).build().perform();
		
		Action dragndrop = builder.clickAndHold(from).moveToElement(to).release().build();
		dragndrop.perform();
		
		
		
		
		
		
	}

}
