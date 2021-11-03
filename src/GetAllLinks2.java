import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.DriverConn;

public class GetAllLinks2 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		
		WebDriver driver = DriverConn.getDriver();
		driver.get("https://www.facebook.com/");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total links :"+links.size());
		
		ArrayList<String> al = new ArrayList<>();
		
		for(WebElement link : links)
		{
			if(!link.getText().equals(""))
			{
				al.add(link.getText());
			}

		}
		
		for(String s: al)
		{
			System.out.println(s);
			/*WebElement link = driver.findElement(By.linkText(s));
			link.click();
			System.out.println(driver.getTitle());
			driver.navigate().back();*/
			
		}
		
		
	}

}
