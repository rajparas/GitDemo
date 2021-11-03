import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import util.DriverConn;

public class WebTables 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		
		WebDriver driver = DriverConn.getDriver();
		
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		
		String data = driver.findElement(By.xpath("//table/tbody/tr[3]/td[3]")).getText();
		
		System.out.println(data);
		
		
		/*try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.quit();*/
		
	}

}
