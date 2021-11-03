import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import util.DriverConn;

public class AlertDemo 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		WebDriver driver = DriverConn.getDriver();
		
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("cusid")).sendKeys("11");
		driver.findElement(By.name("submit")).click();
		
		Alert alert = driver.switchTo().alert();
		
		String text = alert.getText();
		System.out.println(text);
		
		alert.accept();
		// alert.dismiss();
		
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.quit();
		
	}

}
