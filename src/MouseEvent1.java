import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import util.DriverConn;

public class MouseEvent1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		WebDriver driver = DriverConn.getDriver();
		
		driver.get("https://www.google.co.in/?gws_rd=ssl");
		
		WebElement search = driver.findElement(By.name("q"));
		
		Actions builder = new Actions(driver);
		
		Action find = builder.click(search).
				sendKeys(search, "Tops Tech").
			//	sendKeys(Keys.ARROW_DOWN).
				sendKeys(Keys.ENTER).
				build();
		find.perform();
		
		
		
		
		
		
		
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.quit();
		
		
	}

}
